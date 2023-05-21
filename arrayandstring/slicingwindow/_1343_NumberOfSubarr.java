package arrayandstring.slicingwindow;
/*
Given an array of integers arr and two integers k and threshold,
return the number of sub-arrays of size k and average greater than or equal to threshold.

Example 1:

Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3
Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively.
All other sub-arrays of size 3 have averages less than 4 (the threshold).

Example 2:
Input: arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5
Output: 6
Explanation: The first 6 sub-arrays of size 3 have averages greater than 5. Note that averages are not integers.
 */

import java.util.Arrays;
import java.util.HashSet;

public class _1343_NumberOfSubarr {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int L = 0;
        int tempSum = 0;

        for (int R = 0; R < arr.length; R++) {
            if (R - L + 1 > k) {
                 tempSum -= arr[L];
                 L++;
            }
            tempSum += arr[R];
//            if (R - L + 1 == k) {
//                double avg = (double) tempSum / k;
//                System.out.println(tempSum + " " + avg);
//                if (avg >= threshold) count++;
//            }
            if (tempSum >= threshold * k && R - L + 1 == k) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {11, 13, 17, 23, 29, 31, 7, 5, 2, 3};
        int k = 3;
        int threshold = 5;
        int result = numOfSubarrays(arr, k, threshold);
        System.out.println("Output: " + result);

        int[] arr1 = {2,2,2,2,5,5,5,8};
        System.out.println(numOfSubarrays(arr1, 3, 4));
    }

}
