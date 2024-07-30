import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int sharkSize = 2;
    static int count = 0;
    static int eatingCount = 0;
    static int N, nx, ny;
    static HashMap<Integer, Integer> fishSize;
    static int[][] space;
    static int[][] dist;
    static int minDist, minX, minY;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        space = new int[N][N];
        fishSize = new HashMap<>();
        int nowX = 0, nowY = 0;

        for (int i = 0; i < N; i++) {
            String[] parts = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                int size = Integer.parseInt(parts[j]);

                if (size > 0 && size <= 6 && !fishSize.containsKey(size)) {
                    fishSize.put(size, 1);
                } else if (fishSize.containsKey(size) && size != 0) fishSize.put(size, fishSize.get(size) + 1);
                space[i][j] = size;
                if (space[i][j] == 9) {
                    nowX = i;
                    nowY = j;
                    space[i][j] = 0; // 상어의 위치는 0으로 변경
                }
            }
        }

        while (true) {
            dist = new int[N][N];
            minX = Integer.MAX_VALUE;
            minY = Integer.MAX_VALUE;
            minDist = Integer.MAX_VALUE;
            bfs(nowX, nowY);

            if(minX != Integer.MAX_VALUE && minY != Integer.MAX_VALUE) {
                eatingCount++;
                space[minX][minY] = 0;
                nowX = minX;
                nowY = minY;
                count += dist[minX][minY];

                if(eatingCount == sharkSize) {
                    sharkSize++;
                    eatingCount = 0;
                }
            } else {
                break;
            }
        }
        System.out.println(count);
    }

    private static void bfs(int nowX, int nowY) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];
        queue.add(new int[]{nowX, nowY});
        visited[nowX][nowY] = true;

        while (!queue.isEmpty()) {
            int[] t = queue.poll();
            int x = t[0];
            int y = t[1];

            for (int i = 0; i < 4; i++) {
                nx = x + dx[i];
                ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
                if (visited[nx][ny]) continue;

                if (space[nx][ny] > sharkSize) continue;

                visited[nx][ny] = true;
                dist[nx][ny] = dist[x][y] + 1;

                if (space[nx][ny] < sharkSize && space[nx][ny] > 0) {
                    if(minDist > dist[nx][ny]) {
                        minDist = dist[nx][ny];
                        minX = nx;
                        minY = ny;
                    } else if(minDist == dist[nx][ny]) {
                        if(minX == nx) {
                            if(minY > ny) {
                                minX = nx;
                                minY = ny;
                            }
                        } else if(minX > nx) {
                            minX = nx;
                            minY = ny;
                        }
                    }
                }
                queue.add(new int[]{nx, ny});
            }
        }
    }
}
