package math;

/**
 * Created by lancer on 2017/1/25.
 */
public class OneDimensionalArray {

    public static void main(String[] args) {
        OneDimensionalArray obj = new OneDimensionalArray();

        int[] arr = {99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 13, 15, 45};
        System.out.println("getMax = " + obj.getMax(arr));

        System.out.println("getAverage = " + obj.getAverage(arr));

        int[] copyArray = obj.copyArray(arr);
        printArray(copyArray);

        int[] reverse = obj.reverse(arr);
        printArray(reverse);

        int[][] a = {
                {1, 2, 3,},
                {4, 5, 6,}
        };
        int[][] b = {
                {1, 2, 3,},
                {4, 5, 6,}
        };
        int[][] multiplied = obj.multiplied(a, b);
        printArray(multiplied);
    }

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
     * 矩阵相乘（方阵）
     *
     * @param a
     * @param b
     * @return
     */
    public int[][] multiplied(int[][] a, int[][] b) {
        int N = a.length;
        int[][] c = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    // 计算行i和列j的点乘
                    c[i][j] += a[i][k] * b[j][k];
                }
            }
        }
        return c;
    }

    /**
     * 打印一唯数组到控制台
     *
     * @param arr
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i] + "]");
            }
        }
    }

    /**
     * 打印二维数组到控制台
     *
     * @param arr
     */
    public static void printArray(int[][] arr) {
        System.out.println("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t{");
            for (int j = 0; j < arr[i].length; j++) {
                if (j != arr[i].length - 1) {
                    System.out.print(arr[i][j] + ",");
                } else {
                    System.out.println(arr[i][j] + "}");
                }
            }
        }
        System.out.println("}");
    }

}
