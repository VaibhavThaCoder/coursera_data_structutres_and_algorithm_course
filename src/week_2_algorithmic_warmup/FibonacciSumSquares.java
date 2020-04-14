package week_2_algorithmic_warmup;
import java.util.*;

public class FibonacciSumSquares {
    private static int getFibonacciSumSquaresFast(long n) {
    int sum = 0;

    n = (int) (n % 60); // pisanoLength(10) = 60

    int current = 0;
    int next = 1;

    for (int i = 0; i < n; i++) {
        int tmpCurrent = next;
        next = (current + next) % 10;
        current = tmpCurrent;
    }

    sum = (current * next) % 10;
    return sum;
}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(getFibonacciSumSquaresFast(n));
    }
}