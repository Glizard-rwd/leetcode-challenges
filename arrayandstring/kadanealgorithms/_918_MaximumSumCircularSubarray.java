package arrayandstring.kadanealgorithms;
/*
Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.

A circular array means the end of the array connects to the beginning of the array.
Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].

A subarray may only include each element of the fixed buffer nums at most once.
Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], there does not exist i <= k1, k2 <= j with k1 % n == k2 % n.
 */
public class _918_MaximumSumCircularSubarray {
    public static int maxSubarraySumCircular(int[] nums) {
        int globMax = nums[0]; // global max
        int globMin = nums[0]; // global min value
        int curMax = 0; // current max value when looping
        int curMin = 0; // current min value when looping
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            curMax = Math.max(curMax + nums[i], nums[i]);
            curMin = Math.min(curMin + nums[i], nums[i]);
            total += nums[i];
            globMax = Math.max(curMax, globMax);
            globMin = Math.min(curMin, globMin);
        }

        return (globMax > 0)? Math.max(globMax, total - globMin): globMax;
    }

    public static void main(String[] args) {
        int[] nums = {-3,-2,-3};
        int[] nums1 = {1,-2,3,-2};
        int[] nums2 = {5,-3,5};

        System.out.println(maxSubarraySumCircular(nums));
        System.out.println(maxSubarraySumCircular(nums1));
        System.out.println(maxSubarraySumCircular(nums2));
    }
}
