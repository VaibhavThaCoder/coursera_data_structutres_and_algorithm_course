package week_3_greedy_algorithms;
import java.util.Scanner;

public class Change {
	private static int getChangeGreedy(int m) {
	    int changes = 0, count = 0;
	    int[] denominations = {1, 5, 10};
	    int max = denominations.length - 1; // index pointing to next max denominations

	    while (changes < m) {
	        while (changes <= m && (m - changes) >= denominations[max]) {
	            changes += denominations[max];
	            count++;
	        }
	        max = max - 1;
	    }
	    return count;
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChangeGreedy(m));
    }
}