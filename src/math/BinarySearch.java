package math;

import java.util.Arrays;

/**
 * Created by lancer on 2017/1/24.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 99, 7, 65, 44};
        Arrays.sort(arr);
        System.out.println(rank(5,arr));
    }


    public static int rank(int key, int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (hi - lo) / 2;
            if (key < arr[mid]) {
                hi = mid - 1;
            } else if (key > arr[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
