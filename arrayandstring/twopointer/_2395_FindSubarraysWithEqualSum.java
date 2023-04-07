package arrayandstring.twopointer;

import java.util.HashSet;
import java.util.Set;

public class _2395_FindSubarraysWithEqualSum {
    public static boolean findSubarrays(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len-1; i++) {
            if (set.contains(nums[i] + nums[i + 1])) {
                return true;
            }
            set.add(nums[i] + nums[i + 1]);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findSubarrays(new int[]{1,2,3,4,5}));
        System.out.println(findSubarrays(new int[]{0, 0, 0}));
        System.out.println(findSubarrays(new int[]{1}));
    }
}
