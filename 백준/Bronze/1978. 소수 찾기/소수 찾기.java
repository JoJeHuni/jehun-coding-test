import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int count = 0;

        for (int i =0; i < N; i++) {
            int number = Integer.parseInt(input[i]);
            for(int j = 2; j <= number; j++) {
                if(j == number) {
                    count++;
                }
                if(number % j == 0) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}