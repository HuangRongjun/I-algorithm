package math;

import util.StdIn;
import util.StdOut;

/**
 * Compilation:  javac Average.java
 * Execution:    java Average < data.txt
 * Dependencies: StdIn.java StdOut.java
 * <p>
 * Reads in a sequence of real numbers, and computes their average.
 * <p>
 * % java Average
 * 10.0 5.0 6.0
 * 3.0 7.0 32.0
 * [Ctrl-d]
 * Average is 10.5
 * <p>
 * Note [Ctrl-d] signifies the end of file on Unix.
 * On windows use [Ctrl-z].
 * <p>
 * Created by iCrazyTeam on 2017/1/30.
 */
public class Average {
    public static void main(String[] args) {
        double sum = 0.0;
        int cnt = 0;
        while (!StdIn.isEmpty()) {
            sum += StdIn.readDouble();
            cnt++;
        }
        double avg = sum / cnt;
        StdOut.printf("Average is %.5f\n", avg);
    }
}
