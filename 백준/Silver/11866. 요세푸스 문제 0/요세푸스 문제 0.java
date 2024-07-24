import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> peopleArr = new ArrayList<>();

        for(int i=0; i<n; i++) {
            peopleArr.add(i + 1);
        }
        Josephus(peopleArr, k, sb);

        System.out.println("<" + sb + ">");
    }

    public static void Josephus(ArrayList<Integer> peopleArr, int k, StringBuilder sb) {
        Queue<Integer> queue = new LinkedList<>();
        int index = 0;
        int n = peopleArr.size();

        while (peopleArr.size() > 0) {
            index = (index + (k-1)) % n;
            queue.add(peopleArr.get(index));
            peopleArr.remove(index);
            n--;
        }
        while(!queue.isEmpty()) {
            if (queue.size() == 1) {
                sb.append(queue.poll());
            } else
                sb.append(queue.poll()).append(", ");
        }
    }

}
