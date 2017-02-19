package math;

import util.StdDraw;

/**
 * 计算一组数据的实时平均值（可视化版本）
 * <p>
 * Created by iCrazyTeam on 2017/2/19.
 */

public class VisualAccumulator {
    private double total;
    private int N;

    public VisualAccumulator(int trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(.005);
    }

    public void addDataValue(double value) {
        N++;
        total += value;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N, value);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N, total / N);
    }

    public double mean() {
        return total / N;
    }

    @Override
    public String toString() {
        return String.format("Mean(%d Values): %7.5f", N, mean());
    }
}
