import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] score = br.readLine().split(" ");
        int maxScore = 0;

        for (int i = 0; i < N; i++) {
            maxScore = Math.max(maxScore, Integer.parseInt(score[i]));
        }

        double result = 0.0;
        for (int i = 0; i < N; i++) {
            score[i] = String.valueOf((Double.parseDouble(score[i]) / maxScore) * 100);

            result += Double.parseDouble(score[i]);
        }
        System.out.println(result / N);
    }
}