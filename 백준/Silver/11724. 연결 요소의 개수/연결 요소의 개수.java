import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] graph = new int[1001][1001];
    static int N;
    static int M;
    static boolean[] visited = new boolean[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int start;
        int end;

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            graph[start][end] = graph[end][start] = 1;
        }

        int result = 0;

        for (int i = 1; i <= N; i++) {
            if(visited[i] == false) {
                dfs(i);
                result++;
            }
        }

        System.out.println(result);

        br.close();
        return;
    }

    public static void dfs(int index) {
        if(visited[index] == true)
            return;
        else {
            visited[index] = true;
            for(int i = 1; i <= N; i++) {
                if(graph[index][i] == 1) {
                    dfs(i);
                }
            }
        }
    }
}