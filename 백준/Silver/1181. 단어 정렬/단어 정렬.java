import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];

        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if (i == 0) sb.append(words[i]).append("\n");
            else if (!words[i].equals(words[i - 1]) && i == N - 1) sb.append(words[i]);
            else if (!words[i].equals(words[i - 1]) && i < N - 1) sb.append(words[i]).append("\n");
        }
        System.out.println(sb);
    }
}
