import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new Integer[1001];
        dp[0] = 1;
        dp[1] = 1;

        System.out.println(recur(N));
        br.close();
    }

    private static int recur(int N) {
        if (dp[N] == null) {
            dp[N] = (recur(N - 1) + 2 * recur(N - 2)) % 10007;
        }
        return dp[N];
    }
}
