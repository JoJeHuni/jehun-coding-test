import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        double f = (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2) + Math.pow(d,2) + Math.pow(e,2)) % 10;

        System.out.println((int) f);
    }
}