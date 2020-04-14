package week_4_divide_and_conquer;
import java.io.*;
import java.util.*;

public class Sorting {
    private static Random random = new Random();

    private static int[] partition3(int[] a, int lo, int hi) {
    int x = a[lo];  //
    int lt = lo, gt = hi;
    int i = lo + 1;

    while (i <= gt) {
        if      (a[i] < x)  exch(a, lt++, i++);
        else if (a[i] > x)  exch(a, i, gt--);
        else                i++;
    }
    return new int[] {lt, gt};
}

private static void randomizedQuickSort(int[] a, int lo, int hi) {
    if (lo >= hi) {
        return;
    }
    int k = random.nextInt(hi - lo + 1) + lo;
    exch(a, lo, k);

    // int m = partition2(a, lo, hi);
    int[] p = partition3(a, lo, hi);

    randomizedQuickSort(a, lo, p[0] - 1);
    randomizedQuickSort(a, p[1] + 1, hi);
}

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        randomizedQuickSort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
private static void exch(int[] a, int i, int j) {
    int swap = a[i];
    a[i] = a[j];
    a[j] = swap;
}

}