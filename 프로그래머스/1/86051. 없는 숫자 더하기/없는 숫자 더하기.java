import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;
        
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i <= 9; i++) {
            set.add(i);
        }
        
        for (int num : numbers) {
            set.remove(num);
        }
        
        for (int add : set) {
            sum += add;
        }
        
        answer = sum;
        
        return answer;
    }
}