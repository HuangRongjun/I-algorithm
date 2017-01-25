package math;

/**
 * Created by lancer on 2017/1/25.
 */
public class OneDimensionalArray {

    /**
     * 获取数组中的最大值
     *
     * @param arr
     * @return
     */
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 获取数据的平均值
     *
     * @param arr
     * @return
     */
    public double getAverage(int[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    /**
     * 拷贝当前数组到一个新的数组
     *
     * @param source
     * @return
     */
    public int[] copyArray(int[] source) {
        int[] target = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }
        return target;
    }

    /**
     * 颠倒数组的顺序
     *
     * @return
     */
    public int[] reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - i - 1] = temp;
        }
        return arr;
    }

    /**
     * TODO 两个矩阵相乘
     *
     * @param arr
     * @return
     */
    public int[] multiplied(int[] a, int[] b) {
        return null;
    }

}
