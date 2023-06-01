package arrayandstring.twopointer2;

import java.util.Arrays;

/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that
they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2]
where 1 <= index1 < index2 < numbers.length.
Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 */
public class _167_TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int total = numbers[l] + numbers[r];
            if (total < target)
                l++;
            else if (total > target)
                r--;
            else {
                return new int[] { l + 1, r + 1 };
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{-1, 0}, -1)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,3,4}, 6)));

    }
}
