import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, start;
    static StringBuilder sb = new StringBuilder();
    static int[][] arr;
    static boolean[] visited;

    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1];

        arr = new int[N+1][N+1];

        for (int i = 0; i < M; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int vertexOne = Integer.parseInt(str.nextToken());
            int vertexTwo = Integer.parseInt(str.nextToken());

            arr[vertexOne][vertexTwo] = arr[vertexTwo][vertexOne] = 1;
        }

        dfs(start);

        sb.append("\n");
        visited = new boolean[N+1];

        bfs(start);

        System.out.println(sb);
    }

    private static void dfs(int start) {
        visited[start] = true;
        sb.append(start + " ");

        for (int i = 0; i <= N ; i++) {
            if(arr[start][i] == 1 && !visited[i]) dfs(i);
        }
    }

    private static void bfs(int start) {
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int startVertex = queue.poll();
            sb.append(startVertex + " ");

            for (int i = 0; i <= N; i++) {
                if (arr[startVertex][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
