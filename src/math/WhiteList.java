package math;

import alg4.In;
import alg4.StaticSETofInts;
import alg4.StdIn;
import alg4.StdOut;

/**
 * Created by iCrazyTeam on 2017/3/5.
 */
public class WhiteList {
    public static void main(String[] args) {
        int[] w = In.readInts(args[0]);
        StaticSETofInts set = new StaticSETofInts(w);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            StdOut.println(key);
        }
    }
}
