import java.io.*;
import java.util.*;

public class Main {
    static int node, edge, count;
    static boolean[] visited;
    static List[] computers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine()); // 7
        edge = Integer.parseInt(br.readLine()); // 6
        count = 0;
        visited = new boolean[node + 1];        // 1 ~ 7 까지 담을 배열
        computers = new ArrayList[node + 1];         // 1번 ~ 7번 컴퓨터까지 담을 리스트

        for (int i = 0; i < node + 1; i++) {
            computers[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for (int i = 1; i <= edge; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            computers[start].add(end);
            computers[end].add(start);
        }

        bfs(1);
        br.close();
        System.out.println(count);
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int next = queue.poll();

            for (int i = 0; i < computers[next].size(); i++) {
                int cnt = (int) computers[next].get(i);
                if (!visited[cnt]) {
                    visited[cnt] = true;
                    queue.add(cnt);
                    count++;
                }
            }
        }
    }
}