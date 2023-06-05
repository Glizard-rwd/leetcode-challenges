package enjoyalgorithms;

import java.util.Arrays;
/*
https://www.enjoyalgorithms.com/blog/find-the-minimum-and-maximum-value-in-an-array/
 */
public class MinAndMaxInArray {
    public static int[] findMinMax(int[] arr, int n) {
        // n is odd or even?
        // initialize min, max in the first step
        // pointer i
        int max = 0;
        int min = 0;
        int i = 0;
        if (n % 2 != 0) {
            min = arr[0];
            max = arr[0];
            i = 1;
        } else {
            if (arr[0] > arr[1]) {
                min = arr[1];
                max = arr[0];
            } else {
                min = arr[0];
                max = arr[1];
            }
            i = 2;
        }

        while (i < n) {
            if (arr[i] < arr[i+1]) {
                if (arr[i] < min) min = arr[i];
                if (arr[i+1] > max) max = arr[i+1];
            } else {
                if (arr[i+1] < min) min = arr[i+1];
                if (arr[i] > max) max = arr[i];
            }
            i += 2;
        }
        return new int[] {max, min}; // output
    }
    public static int[] findMinMaxNormal(int[] arr, int n) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        return new int[]{max, min};
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(findMinMax(new int[]{4, 2, 0, 8, 20, 9, 2}, 7)));
        System.out.println(Arrays.toString(findMinMax(new int[]{-8, -3, -10, -32, -1}, 5)));

        System.out.println(Arrays.toString(findMinMaxNormal(new int[]{4, 2, 0, 8, 20, 9, 2}, 7)));
        System.out.println(Arrays.toString(findMinMaxNormal(new int[]{-8, -3, -10, -32, -1}, 5)));

        long t1 = System.nanoTime();
        System.out.println(Arrays.toString(findMinMax(new int[]{-8, -3, -10, -32, -1}, 5)));
        long t1_1 = System.nanoTime();
        long d1 = (t1_1 - t1) / 1_000_000;
        System.out.println(d1);

        long t2 = System.nanoTime();
        System.out.println(Arrays.toString(findMinMaxNormal(new int[]{-8, -3, -10, -32, -1}, 5)));
        long t2_2 = System.nanoTime();
        long d2 = (t2_2 - t2) / 1_000_000;
        System.out.println(d2);
    }
}
