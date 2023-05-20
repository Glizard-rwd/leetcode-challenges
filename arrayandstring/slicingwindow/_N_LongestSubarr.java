package arrayandstring.slicingwindow;

public class _N_LongestSubarr {
    /*
    Find the length of the longest
    subarray, with the same value in
    each position.
     */
    public static int lengthOfLongestSubArr(int[] nums) {
        int length = 0;
        int L = 0;
        for (int R = 0; R < nums.length; R++) {
            if (nums[R] != nums[L]) {
                L = R;
            }
            length = Math.max(length, R - L + 1); // compare old length vs new length
        }
        return length;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubArr(new int[]{4, 2, 2, 3, 3, 3}));
    }
}
