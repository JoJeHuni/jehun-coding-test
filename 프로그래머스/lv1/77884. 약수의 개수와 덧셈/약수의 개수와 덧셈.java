import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int sum = 0;
        
        while (left <= right) {
            
            List<Integer> num = new ArrayList<>();
            
            for (int i = 1; i <= left; i++) {
                if (left % i == 0) {
                    num.add(i);
                }
            }
            
            if (num.size() % 2 == 0) {
                sum += left;
            } else {
                sum -= left;
            }
            left++;
        }
        
        answer = sum;
        
        return answer;
    }
}