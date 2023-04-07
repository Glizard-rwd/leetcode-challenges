package arrayandstring.twopointer;

import java.util.*;

public record _11_ContainerWithMostWater() {
    public static int maxArea(int[] hs) {
        // formula: min(left, right) * (right - left)
        // technique: two pointer;
        int max = 0; // max value
        int left = 0; // left pointer
        int right = hs.length-1; // right pointer
        while (left < right) {
            // loop the array from left to right
            int curWater = Math.min(hs[left], hs[right]) * (right - left);
            max = Math.max(max, curWater); // compare max and current value and take the higher
            if (hs[left] < hs[right]) {
                // if the value of left pointer is smaller that the right pointer
                // move left pointer to the right
                left++;
            } else {
                // vice versa
                right--;
            }
        }
        return max; // return max at the end
    }
    public static void main(String[] args) {
        int[] heights = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(heights));
    }
}
