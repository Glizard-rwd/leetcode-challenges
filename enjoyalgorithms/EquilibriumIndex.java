package enjoyalgorithms;

import java.util.Arrays;

/*
https://www.enjoyalgorithms.com/blog/find-equilibrium-index-of-an-array/
 */
public class EquilibriumIndex {
    public static int equilibriumIndex(int[] arr, int n) {
        int total = 0;
        int s = 0;
        for (int i: arr) {
            total += i;
        }

        for (int i = 0; i < n; i++) {
            int e = total - s - arr[i]; // other = total - s - current element
            if (s == e) return i; // when start == other that is the result
            s += arr[i]; // add current number to the start
        }
        return -1; // equilibrium index does not exit
    }

    public static int equilibriumIndPrefix(int[] arr, int n) {
        int[] prefix = new int[n]; // declare prefix array
        Arrays.fill(prefix, 0);
        // add element to prefix array
        for (int i = 0; i < n; i++) {
            if (i == 0) prefix[0] = arr[i];
            else prefix[i] = arr[i] + prefix[i-1];
        }
        int total = prefix[n-1];
        for (int i = 0; i < n; i++) {
            int leftSum = prefix[i] - arr[i];
            int rightSum = total - prefix[i];
            if (leftSum == rightSum) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = new int[]{-7, 1, 5, 2, -4, 3, 0};
        System.out.println(equilibriumIndex(A, A.length));
        System.out.println(equilibriumIndPrefix(A, A.length));
    }
}
