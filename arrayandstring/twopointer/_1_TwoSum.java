package arrayandstring.twopointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum {
    // what is current value
    // what is target
    // x = target - value
    // check x in hashmap or not. if yes return the position
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        int n = nums.length;
        for (int i=0; i<n; i++) {
            int cur = nums[i];
            int x = target - cur;
            if (m.containsKey(x)) {
                return new int[] {m.get(x), i};
            }
            m.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
