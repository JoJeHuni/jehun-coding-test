import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] size = br.readLine().split(" ");
        String[] pair = br.readLine().split(" ");
        int T = Integer.parseInt(pair[0]);
        int P = Integer.parseInt(pair[1]);

        int sum_TPair = 0;

        for (int i = 0; i < size.length; i++) {
            if (Integer.parseInt(size[i]) % T != 0) sum_TPair += (Integer.parseInt(size[i]) / T + 1);
            else if (Integer.parseInt(size[i]) % T == 0) sum_TPair += (Integer.parseInt(size[i]) / T);
        }

        System.out.println(sum_TPair);
        System.out.println(N/P + " " + N%P);
    }
}