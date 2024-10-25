import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();

            if (!input.equals("0")) {
                if (input.length() == 1) {
                    System.out.println("yes");
                    continue;
                }
                int[] result = new int[input.length()];
                for (int i = input.length() -1; i >= 0 ; i--) {
                    result[i] = Integer.parseInt(input) % 10;
                    input = String.valueOf(Integer.parseInt(input) / 10);
                }

                int number = 0;
                while (true) {
                    if (number == result.length - 1) {
                        System.out.println("yes");
                        break;
                    }
                    if (result[number] == result[result.length - (number + 1)]) number++;
                    else if (result[number] != result[result.length - (number + 1)]) {
                        System.out.println("no");
                        break;
                    }
                }
            } else break;
        }
    }
}
