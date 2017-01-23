package math;

/**
 * Created by lancer on 2017/1/23.
 */
public class util {
    public static void main(String[] args) {
        System.out.println(abs(-5.5));
        System.out.println(isPrime(3));
    }

    public static int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    public static double abs(double x) {
        if (x < 0.0) {
            return -x;
        } else {
            return x;
        }
    }

    public static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        } else {
            for (int i = 2; i * i <= N; i++) {
                if (N % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

