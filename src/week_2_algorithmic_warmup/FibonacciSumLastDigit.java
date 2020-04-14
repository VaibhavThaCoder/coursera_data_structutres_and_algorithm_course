package week_2_algorithmic_warmup;
import java.util.*;

public class FibonacciSumLastDigit {
    private static int getFibonacciSumFast(long n) {
    if (n <= 1)
        return (int) n;

    int limit = (int) (n % 60); // pisanoLength(10) = 60

    int previous = 0;
    int current  = 1;
    int sum      =-1;

    for (int i = 0; i <= limit; ++i) {
        int tmpPrevious = previous;
        previous = current;
        current = (tmpPrevious + current) % 10;
    }

    sum = current != 0 ? current - 1 : 9; // safety guard if last digit of sum(fib(n + 2)) is 0
    return sum;
}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(getFibonacciSumFast(n));
    }
}