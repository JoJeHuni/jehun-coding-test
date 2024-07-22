import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dp;
    static int[] score;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stairs = Integer.parseInt(br.readLine());
        dp = new int[stairs + 1];
        score = new int[stairs + 1];

        for (int i = 1; i <= stairs; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        if (stairs == 1) {
            System.out.println(score[1]);
            return;
        }

        dp[1] = score[1];
        dp[2] = score[1] + score[2];

        for (int i = 3; i <= stairs; i++) {
            dp[i] = Math.max(dp[i-2] + score[i], dp[i-3] + score[i-1] + score[i]);
        }

        System.out.println(dp[stairs]);
    }
}
