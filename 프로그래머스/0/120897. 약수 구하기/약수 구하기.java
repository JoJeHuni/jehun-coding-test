import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int num = 0;
        
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) num++;
        }
        
        int[] answer = new int[num];
        
        int num2 = 0;
        
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer[num2] = i;
                num2++;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}