package arrayandstring.twopointer;

import java.util.*;

public class _167_TwoSum_II {
    // two pointer: start - end
    public static int[] twoSum(int[] nums, int target) {
        // nums has been sorted!
        // two-pointer technique!
        int start = 0;
        int end = nums.length-1;
        while (start < end) {
            int current = nums[start] + nums[end];
            if (current > target) {
                end--;
            } else if (current < target) {
                start++;
            } else {
                return new int[]{start+1, end+1};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
