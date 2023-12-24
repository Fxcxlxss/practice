package lab1;
import java.util.Scanner;

public class lab11 {
    public static void main(String[] args) {
        int len = 10;
        int sm = 0;
        int[] a = new int[len];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < len; i++) {
            a[i] = sc.nextInt();
            sm += a[i];
        }

        System.out.println("Sum: " + sm + "\nAvg: " + (float)sm/len);
    }
}
