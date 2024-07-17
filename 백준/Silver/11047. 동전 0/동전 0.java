import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String[] parts = n.split(" ");

        int N = Integer.parseInt(parts[0]);
        int total = Integer.parseInt(parts[1]);

        int count = 0;
        List<Integer> list = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }

        StringBuilder sb = new StringBuilder();

        while (total > 0) {
            if (total >= list.get(N-1)) {
                total -= list.get(N-1);
                count++;
            } else {
                N--;
            }
            if (total == 0) break;
        }
        sb.append(count);
        System.out.println(sb);
    }
}