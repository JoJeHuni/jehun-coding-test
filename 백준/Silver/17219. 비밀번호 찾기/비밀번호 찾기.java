import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] parts = br.readLine().split(" ");

        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            String site = line[0];
            String passwd = line[1];
            map.put(site, passwd);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (map.containsKey(input)) {
                sb.append(map.get(input));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
