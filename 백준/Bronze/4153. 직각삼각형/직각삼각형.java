import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;

        List<Integer> list = new ArrayList<>();

        while (true) {
            int number = in.nextInt();
            list.add(number);
            count++;
            if (number == 0) {
                if (list.get(count - 3).equals(list.get(count - 2)) && list.get(count - 2).equals(list.get(count - 1))) {
                    break;
                }
            }
        }

        for (int i = 0; i < list.size(); i = i + 3) {
            if (list.get(i).equals(0) && list.get(i+1).equals(0) && list.get(i+2).equals(0)) break;
            else if (Math.pow(list.get(i),2) + Math.pow(list.get(i + 1),2) == Math.pow(list.get(i + 2),2)) System.out.println("right");
            else if (Math.pow(list.get(i + 1),2) + Math.pow(list.get(i + 2),2) == Math.pow(list.get(i),2)) System.out.println("right");
            else if (Math.pow(list.get(i + 2),2) + Math.pow(list.get(i),2) == Math.pow(list.get(i + 1),2)) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
