package math;

import util.StdOut;
import util.StdRandom;

/**
 * 模拟投掷T次骰子，每边出现的次数
 * <p>
 * 主要用于测试对象数组在移动的时候主要是操作 引用 ，而非对象本身
 * </p>
 * Created by iCrazyTeam on 2017/2/4.
 */
public class Rolls {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int SIDES = 6;
        Counter[] rolls = new Counter[SIDES + 1];
        for (int i = 1; i <= SIDES; i++) {
            rolls[i] = new Counter(i + "'s");
        }

        for (int i = 0; i < T; i++) {
            int result = StdRandom.uniform(1, SIDES + 1);
            rolls[result].increment();
        }

        for (int i = 1; i < SIDES; i++) {
            StdOut.println(rolls[i]);
        }
    }
}
