package math;

import util.StdOut;
import util.StdRandom;

/**
 * Compilation:  javac RandomSeq.java
 * Execution:    java RandomSeq n lo hi
 * Dependencies: StdOut.java
 * <p>
 * Prints N numbers between lo and hi.
 * <p>
 * % java RandomSeq 5 100.0 200.0
 * 181.25
 * 182.08
 * 143.29
 * 178.50
 * 169.79
 * <p>
 * Created by lancer on 2017/1/29.
 */
public class RandomSeq {
    public static void main(String[] args) {
        //打印(lo, hi)之间的随机值
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);

        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n", x);
        }
    }
}
