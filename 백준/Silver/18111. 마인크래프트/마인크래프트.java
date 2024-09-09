import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int block = Integer.parseInt(st.nextToken());

        int[][] ground = new int[n][m];
        int min = 256;
        int max = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                ground[i][j] = Integer.parseInt(st.nextToken());
                if (ground[i][j] < min) {
                    min = ground[i][j];
                }
                if (ground[i][j] > max) {
                    max = ground[i][j];
                }
            }
        }

        int solutionTime = 1000000000;
        int solutionHeight = 0;

        for (int height = min; height <= max; height++) {
            int deleteBlock = 0;
            int insertBlock = 0;
            int tempBlock = block;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (ground[i][j] < height) {
                        insertBlock += height - ground[i][j];
                        tempBlock -= height - ground[i][j];
                    } else if (ground[i][j] > height) {
                        deleteBlock += ground[i][j] - height;
                        tempBlock += ground[i][j] - height;
                    }
                }
            }
            if (tempBlock < 0) {
                continue;
            }
            int time = deleteBlock * 2 + insertBlock;
            if (time <= solutionTime && height >= solutionHeight) {
                solutionTime = time;
                solutionHeight = height;
            }
        }

        System.out.println(solutionTime + " " + solutionHeight);
    }
}
