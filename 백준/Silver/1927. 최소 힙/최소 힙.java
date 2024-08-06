import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    static int n;
    static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] number = new int[n];

        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(br.readLine());
            if (current == 0) size++;
            number[i] = current;
        }

        int result = size;

        for (int i = 0; i < n; i++) {
            int current = number[i];

            if (current == 0) {
                if (queue.isEmpty()) System.out.println(0);
                else System.out.println(queue.poll());
                result--;
            } else queue.add(current);

            if (result == 0) break;
        }

        br.close();
    }
}