import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        
        //n이 0이 되지 않으면서 2로 안 나눠질 때까지 계속 나누고
        //안 나눠지면 건전지 사용량 ans를 +1 해준다
        
        while(n != 0){
            if(n % 2 == 0){
                n /= 2;
            } else {
                n--;
                ans++;
            }
        }

        return ans;
    }
}