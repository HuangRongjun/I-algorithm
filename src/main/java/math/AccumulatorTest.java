package math;

import alg4.StdRandom;
import util.StdOut;

/**
 * Created by iCrazyTeam on 2017/2/19.
 */
public class AccumulatorTest {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        Accumulator acc = new Accumulator();
        for (int i = 0; i < T; i++) {
            acc.addDataValue(StdRandom.random());
        }
        StdOut.println(acc);
    }

}
