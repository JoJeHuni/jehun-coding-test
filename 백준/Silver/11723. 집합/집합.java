import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set = new HashSet<>();
        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            String command = br.readLine();
            String[] parts = command.split(" ");

            if (parts[0].equals("add")) {
                int k = Integer.parseInt(parts[1]);
                set.add(k);
            } else if (parts[0].equals("remove")) {
                int k = Integer.parseInt(parts[1]);
                set.remove(k);
            } else if (parts[0].equals("check")) {
                int k = Integer.parseInt(parts[1]);
                if (set.contains(k)) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            } else if (parts[0].equals("toggle")) {
                int k = Integer.parseInt(parts[1]);
                if (set.contains(k)) {
                    set.remove(k);
                } else {
                    set.add(k);
                }
            } else if (parts[0].equals("all")) {
                set.clear();
                for (int j = 1; j <= 20; j++) {
                    set.add(j);
                }
            } else if (parts[0].equals("empty")) set.clear();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
