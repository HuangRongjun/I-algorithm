package math;

/**
 * 计算一组数据的实时平均值
 * <p>
 * Created by iCrazyTeam on 2017/2/19.
 */
public class Accumulator {
    private double total;
    private int N;

    public void addDataValue(double value) {
        N++;
        total += value;
    }

    public double mean() {
        return total / N;
    }

    @Override
    public String toString() {
        return String.format("Mean(%d Values): %7.5f", N, mean());
    }

}
