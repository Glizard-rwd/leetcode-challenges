package arrayandstring.slicingwindow;

public class _N_MinimumSubarrLargerOrEqualTarget {
    public static float minimumSubarr(int[] nums, int target) {
        int L = 0;
        int total = 0;
        float length = Float.POSITIVE_INFINITY;

        for (int R = 0; R < nums.length; R++) {
            total += nums[R];
            while (total >= target) {
                length = Math.min(length, R - L + 1);
                total -= nums[L];
                L++;
            }
        }
        return (length == Float.POSITIVE_INFINITY)? 0: length;
    }
    public static void main(String[] args) {
        System.out.println(minimumSubarr(new int[]{2, 3, 1, 2, 4, 3}, 6));
    }

}
