import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int K;
    static int[] visited;
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        if (N >= K) {
            System.out.println(N - K);
            return;
        } else visited = new int[100001];

        System.out.print(bfs(N));
    }

    private static int bfs(int start) {
        queue = new LinkedList<>();
        visited[start] = 1;
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == K) return visited[current] - 1;
            if (current - 1 >= 0 && visited[current - 1] == 0) {
                visited[current - 1] = visited[current] + 1;
                queue.add(current - 1);
            }
            if (current + 1 <= 100000 && visited[current + 1] == 0) {
                visited[current + 1] = visited[current] + 1;
                queue.add(current + 1);
            }
            if (current * 2 <= 100000 && visited[current * 2] == 0) {
                visited[current * 2] = visited[current] + 1;
                queue.add(current * 2);
            }
        }
        return -1;
    }
}
