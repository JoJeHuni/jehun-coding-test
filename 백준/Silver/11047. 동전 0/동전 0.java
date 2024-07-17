import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total = in.nextInt();

        int count = 0;
        List<Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        
        while (total > 0) {
            if (total >= list.get(n-1)) {
                total -= list.get(n-1);
                count++;
            } else {
                n--;
            }
            if (total == 0) break;
        }
        System.out.println(count);
    }
}
