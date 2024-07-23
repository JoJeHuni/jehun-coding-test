import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int N, M;
    static boolean[][] visited;
    static int[][] miro;
    static int dx[]={0, 0, 1, -1};
    static int dy[]={1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");
        N = Integer.parseInt(parts[0]);
        M = Integer.parseInt(parts[1]);

        miro = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                miro[i][j] = Integer.parseInt(line[j]);
            }
        }

        bfs(0,0);

        System.out.println(miro[N - 1][M - 1]);
        br.close();
    }

    static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for(int i = 0; i < 4; i++) {
                x = now[0] + dx[i];
                y = now[1] + dy[i];
                if (x < 0 || y < 0 || x >= N || y >= M || visited[x][y] || miro[x][y] == 0) continue;
                else {
                    visited[x][y] = true;
                    queue.add(new int[] {x, y});
                    miro[x][y] = miro[now[0]][now[1]] + 1;
                }
            }
        }
    }
}
