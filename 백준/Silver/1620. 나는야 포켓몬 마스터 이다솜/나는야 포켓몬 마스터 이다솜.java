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

        Map<Integer, String> pokemonNumMap = new HashMap<>();
        Map<String, Integer> pokemonNameMap = new HashMap<>();

        for (int i = 1; i < N + 1; i++) {
            String pokemon = br.readLine();
            pokemonNumMap.put(i, pokemon);
            pokemonNameMap.put(pokemon, i);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (input.charAt(0) >= 49 && input.charAt(0) <= 57) {
                int key = Integer.parseInt(input);
                sb.append(pokemonNumMap.get(key));
            } else {
                sb.append(pokemonNameMap.get(input));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
