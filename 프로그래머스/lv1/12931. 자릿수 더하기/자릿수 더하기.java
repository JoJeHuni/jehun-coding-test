import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        int i = 10;
        while (num < 10) {
            answer += n % i;
            n = n / i;
            num++;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}