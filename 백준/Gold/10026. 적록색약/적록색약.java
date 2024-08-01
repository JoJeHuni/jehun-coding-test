import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static String[][] map;
    static int[] dx = new int[]{-1,0,1,0};
    static int[] dy = new int[]{0,1,0,-1};
    static int nx, ny;
    static int countN, countY;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new String[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] parts = st.nextToken().split("");
            for (int j = 0; j < N; j++) {
                map[i][j] = parts[j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j);
                    countN++;
                }
            }
        }

        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j].equals("R")) {
                    map[i][j] = "G";
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j);
                    countY++;
                }
            }
        }

        System.out.println(countN + " " + countY);
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];

            if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;

            if (map[nx][ny].equals(map[x][y]) && !visited[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }
}