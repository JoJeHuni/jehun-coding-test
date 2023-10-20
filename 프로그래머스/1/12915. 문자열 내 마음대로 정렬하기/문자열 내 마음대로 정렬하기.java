import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> strList = new ArrayList<>();
        
        for (int i = 0; i < strings.length; i++) {
            strList.add(strings[i].charAt(n) + strings[i]);
            // 정렬해야하는 문자열을 맨 앞에 붙여서 그대로 정렬한다.
        }
        
        Collections.sort(strList);
        
        answer = new String[strList.size()];
        
        // substring으로 1번째부터 길이만큼 잘라서 answer에 넣어준다.
        for (int i = 0; i < strList.size(); i++) {
            answer[i] = strList.get(i).substring(1, strList.get(i).length());
        }
        
        return answer;
    }
}