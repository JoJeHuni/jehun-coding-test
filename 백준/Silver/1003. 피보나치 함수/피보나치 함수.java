import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // f(0) -> 0호출 1회, 1호출 0회 , f(1) -> 0호출 0회, 1호출 1회 로 기본이 저장돼 있어야 한다. 
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(dp[N][0] + " " + dp[N][1]).append('\n');
        }
        System.out.println(sb);
    }

    static Integer[] fibonacci(int N) {
        if(dp[N][0] == null || dp[N][1] == null) { // 처음 들어오는 것이면
            dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0]; // 0, 1 호출 횟수 저장
            dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
        }
        return dp[N];
    }
}