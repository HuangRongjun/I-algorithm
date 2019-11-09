package math.array;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fib {

    public static void main(String[] args) {
        log.info("result {}", fib(6));
    }

    public static long fib(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int[] a = new int[n + 1];
        a[0] = 0;
        a[1] = a[2] = 1;
        for (int i = 3; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];
    }
}
