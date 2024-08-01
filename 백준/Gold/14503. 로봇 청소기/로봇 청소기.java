import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] map;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int sx, sy, direction;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        st = new StringTokenizer(br.readLine());
        sx = Integer.parseInt(st.nextToken());
        sy = Integer.parseInt(st.nextToken());
        direction = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(sx, sy, direction);
        System.out.println(count);
        br.close();
    }

    static void dfs(int x, int y, int direction) {
        if (map[x][y] == 0) {
            map[x][y] = 2;
            count++;
        }

        for (int i = 0; i < 4; i++) {
            direction = (direction + 3) % 4;
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx >= 0 && nx < N && ny >= 0 && ny < M && map[nx][ny] == 0) {
                dfs(nx, ny, direction);
                return;
            }
        }

        int backDirection = (direction + 2) % 4;
        int bx = x + dx[backDirection];
        int by = y + dy[backDirection];

        if (bx >= 0 && bx < N && by >= 0 && by < M && map[bx][by] != 1) {
            dfs(bx, by, direction);
        } else if (bx < 0 || bx >= N || by < 0 || by >= M || map[bx][by] == 1) {
            return;
        }
    }
}