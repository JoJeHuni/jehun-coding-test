import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static Queue<Node> queue = new LinkedList<>();
    static int[][] map;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static boolean[][] visited;
    static int nx, ny;
    static int T, N, M, K;
    static int count;

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());

        for (int k = 0; k < T; k++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[N][M];
            visited = new boolean[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }

            count = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        count++;

                        bfs(i, j);
                    }
                }
            }

            System.out.println(count);
        }
    }

    private static void bfs(int x, int y) {
        queue.add(new Node(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            for (int i = 0; i < 4; i++) {
                nx = node.x + dx[i];
                ny = node.y + dy[i];

                if (range_check() && !visited[nx][ny] && map[nx][ny] == 1) {
                    queue.offer(new Node(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
    }
    private static boolean range_check() {
        return nx >= 0 && ny >= 0 && nx < N && ny < M;
    }
}
