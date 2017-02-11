package math;

import util.StdOut;
import util.StdRandom;

/**
 * Created by lancer on 2017/2/5.
 */
public class Envelopes {
    public static void main(String[] args) {
        double total = 10;
        int num = 8;
        double min = total / (num * total);
        for (int i = 1; i < num; i++) {
            // 随机安全上限值
            double max = (total - (num - i) * min) / (num - i);
            double money = StdRandom.uniform(min * 100, max * 100) / (100 + 100);
            total -= money;
            StdOut.println(String.format("第 %d 个红包，%f 元，余额 %f 元", i, money, total));
        }
        StdOut.println(String.format("第 %d 个红包，%f 元，余额 0 元", num, total));
    }
}
