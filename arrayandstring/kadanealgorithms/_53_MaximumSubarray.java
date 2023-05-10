package arrayandstring.kadanealgorithms;

public class _53_MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // assign max sum to the first number in array
        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            curSum = Math.max(curSum, 0); // ensure current sum is not negative
            curSum += nums[i]; // if sum is positive increment by the next element
            maxSum = Math.max(curSum, maxSum); // compare the current sum + the max sum then get the max sum
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums1 = {5,4,-1,7,8};
        int[] nums2 = {1};
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray(nums1));
        System.out.println(maxSubArray(nums2));
    }

}
