package math;

import util.StdOut;
import util.StdRandom;

/**
 * Counter测试用例，用于模拟T次投硬币
 * <p>
 * Created by iCrazyTeam on 2017/2/2.
 */
public class Flips {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for (int i = 0; i < T; i++) {
            if (StdRandom.bernoulli(0.5)) {
                heads.increment();
            } else {
                tails.increment();
            }
        }
        StdOut.println(heads);
        StdOut.println(tails);
        int d = heads.tally() - tails.tally();
        if (d == 0) {
            StdOut.println("Tie");
        } else {
            StdOut.println(max(heads, tails) + " wins");
        }
    }

    /**
     * 将对象作为参数 & 返回值的例子
     *
     * @param x
     * @param y
     * @return
     */
    public static Counter max(Counter x, Counter y) {
        if (x.tally() > y.tally()) {
            return x;
        } else {
            return y;
        }
    }
}
