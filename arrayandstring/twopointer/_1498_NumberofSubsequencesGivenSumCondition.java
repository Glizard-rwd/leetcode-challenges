package arrayandstring.twopointer;

import java.util.Arrays;

public class _1498_NumberofSubsequencesGivenSumCondition {
    public static int numSubseq(int[] nums, int target) {
        // sort the array
        Arrays.sort(nums);
        int result = 0;
        int mod = 10^9 + 7;
        
        int right = nums.length - 1;
        for (int left = 0; left < right; left++) {
            while (nums[left] + nums[right] > target && left <= right) {
                // if sum is greater than target, move right pointer to left
                right--;
            }
            if (left <= right) {
                // else find the number of subsequences
                result += Math.pow(2, right - left) % mod;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numSubseq(new int[]{3,5,6,7}, 9));
        System.out.println(numSubseq(new int[]{3, 3, 6, 8}, 10));

    }
}
