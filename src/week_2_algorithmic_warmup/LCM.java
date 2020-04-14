package week_2_algorithmic_warmup;
import java.util.*;

public class LCM {

    private static long lcmFast(int a, int b) {
    int gcd = gcdFast(a, b);
    return ((long) a * b ) / gcd;
}

private static int gcdFast(int a, int b) {
    if (b <= 0)
        return a;
    return gcdFast(b, a % b);
}

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(lcmFast(a, b));
    }
}