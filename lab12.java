package lab1;
import java.util.Arrays;
import java.util.Scanner;

public class lab12 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Length of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        int k = 0, sm = 0;

        while (k < len) {
            arr[k] = sc.nextInt();
            sm += arr[k];
            k += 1;
        }

        System.out.println("Max: " + Arrays.stream(arr).max().getAsInt());
        System.out.println("Min: " + Arrays.stream(arr).min().getAsInt());
    }
}
