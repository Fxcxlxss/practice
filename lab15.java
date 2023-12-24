package lab1;

public class lab15 {
    public static long fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    public static void main (String[] args) {
        long res = fact(5);
        System.out.println(res);
    }
}
