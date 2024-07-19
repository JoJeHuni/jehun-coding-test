import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] part = br.readLine().split(" ");

        int N = Integer.parseInt(part[0]);
        int M = Integer.parseInt(part[1]);

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String tmp = br.readLine();
            if(set.contains(tmp)){
                result.add(tmp);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());

        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}
