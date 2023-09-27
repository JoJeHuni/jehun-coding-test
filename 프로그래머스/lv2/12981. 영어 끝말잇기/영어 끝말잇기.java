import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        List<String> list = new ArrayList<String>();
        int[] answer = {0,0};
        
        // 현재 단어 알파벳 길이까지 반복
        for(int i = 0; i < words.length; i++){
            if(list.contains(words[i])){   // 이전에 등장한 단어인경우
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                break;
            }
            
            list.add(words[i]); // 현재 단어 리스트에 넣기
            
            // 끝말잇기가 아닌경우 - 이전의 단어의 끝자리 알파벳과 현재 단어의 첫 번째 자리 알파벳이 다른 경우
            if(i > 0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                break;
            }
        }
        return answer;
    }
}