package arrayandstring.slicingwindow;

public class _209_MinimumSizeSubarraySum {
    /*
    review
     */
    public static int minSubArrayLen(int target, int[] nums) {
        float length = Float.POSITIVE_INFINITY;
        int total = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];
            while (total >= target) {
                length = Math.min(length, right - left + 1); // update length of subarray
                total -= nums[left]; // substract left value
                left++; // increment by 1
            }
        }
        return (length == Float.POSITIVE_INFINITY)? 0: (int) length;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,1,2,4,3};
        int[] arr2 = {1, 4, 4};
        int[] arr3 = {1,1,1,1,1,1,1,1};
        System.out.println(minSubArrayLen(7, arr1));
        System.out.println(minSubArrayLen(1, arr2));
        System.out.println(minSubArrayLen(11, arr3));
    }

}
