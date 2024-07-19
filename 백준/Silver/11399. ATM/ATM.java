import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] P = (br.readLine()).split(" ");
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(P[i]));
        }

        Collections.sort(arr);

        int sum = 0;
        int temp = 0;

        for (int i = 0; i < N; i++) {
            temp += arr.get(i);
            sum += temp;
        }

        sb.append(sum);
        System.out.println(sb);
    }
}
