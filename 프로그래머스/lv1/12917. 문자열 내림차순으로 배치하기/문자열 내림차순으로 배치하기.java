import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        
        // 문자 배열을 내림차순으로 정렬
        Arrays.sort(chars, Collections.reverseOrder());
        
        // 정렬된 문자 배열을 문자열로 변환
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}