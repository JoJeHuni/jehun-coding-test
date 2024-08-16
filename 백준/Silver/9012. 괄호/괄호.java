import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int open = 0;
            String[] vpsArray = br.readLine().split("");

            for (int j = 0; j < vpsArray.length; j++) {
                if (vpsArray[j].equals("(")) open++;
                else open--;

                if (open < 0) {
                    break;
                }
            }

            if (open != 0 && i != T - 1) sb.append("NO").append("\n");
            else if (open == 0 && i != T - 1) sb.append("YES").append("\n");
            else if (open != 0 && i == T - 1) sb.append("NO");
            else if (open == 0 && i == T - 1) sb.append("YES");
        }

        System.out.println(sb);
    }
}
