import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        StringBuilder stringbuilder = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            
            for (int j = 0; j < count; j++) {
                stringbuilder.append(i);
            }
        }
        
        answer = stringbuilder.toString() + "0" + stringbuilder.reverse().toString();
        return answer;
    }
}