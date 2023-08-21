import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] array = s.split(" ");
        
        for (int i = 0; i < array.length; i++) {
            String current = array[i];
            
            if (array[i].length() == 0)
                answer += " ";
            else {
                answer += current.substring(0, 1).toUpperCase();
                answer += current.substring(1, current.length()).toLowerCase();
                answer += " ";
            }
        }
        
        if (s.substring(s.length() - 1, s.length()).equals(" "))
            return answer;
        
        return answer.substring(0, answer.length() - 1);
    }
}