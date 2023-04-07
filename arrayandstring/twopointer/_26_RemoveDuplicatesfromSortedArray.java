package arrayandstring.twopointer;

import java.util.Arrays;

public class _26_RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.print(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
