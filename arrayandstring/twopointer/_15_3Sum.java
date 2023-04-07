package arrayandstring.twopointer;
import javax.imageio.stream.ImageInputStream;
import java.util.*;

public class _15_3Sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // sort the array
        for (int a = 0; a < nums.length; a++) {
            if (a > 0 && nums[a] == nums[a-1]) {
                continue;
            }
            int b = a+1;
            int c = nums.length-1;
            while (b < c) {
                int current = nums[a] + nums[b] + nums[c];
                if (current > 0) {
                    c--; // move element at c to the left
                } else if (current < 0) {
                    b++; // move element at b to the right
                } else {
                    result.add(Arrays.asList(nums[a], nums[b], nums[c]));
                    b++;
                    while (nums[b] == nums[b-1] && b < c) {
                        // element at b cannot be duplicated and must be smaller than c
                        // if not increment b by one
                        b++;
                    }
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }


}
