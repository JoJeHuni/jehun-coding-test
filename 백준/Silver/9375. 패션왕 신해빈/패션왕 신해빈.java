import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> combo = new HashMap<>();

            for (int j = 0; j < n; j++) {
                String[] parts = br.readLine().trim().split(" ");
                if (combo.containsKey(parts[1])) {
                    combo.put(parts[1], combo.get(parts[1]) + 1);
                } else {
                    combo.put(parts[1], 1);
                }
            }

            int result = 1;

            for (int value : combo.values()) {
                result *= (value + 1);
            }

            System.out.println(result - 1);
        }
    }
}