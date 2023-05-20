package arrayandstring.slicingwindow;

import java.util.HashSet;
import java.util.Set;
/*
Slicing window fixed
Given an integer array nums and an integer k,
return true if there are two distinct indices i and j in the array
such that nums[i] == nums[j] and abs(i - j) <= k.
 */
public class _219_ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        /*
        Your code is slow because it uses a hash set to store the elements in the window. Hash sets are a good data structure
        for storing a large number of unique elements, but they are not very efficient for storing a small number of elements
        that are updated frequently.
         */
        Set<Integer> window = new HashSet<>();
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (r - l > k) {
                window.remove(nums[l]);
                l++;
            }
            if (window.contains(nums[r])) {
                return true;
            }
            window.add(nums[r]);
        }

        return false;
    }

    public static boolean containsNearbyDuplicateFaster(int[] nums, int k) {
        int l = 0;
        int r = 0;
        Set<Integer> window = new HashSet<>();
        while (r < nums.length) {
            if (window.contains(nums[r])) {
                return true;
            }
            window.add(nums[r]);
            r++;
            if (r - l > k) {
                window.remove(nums[l]);
                l++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        int[] nums1 = {1,0,1,1};
        int k1 = 1;
        int[] nums2 = {1,2,3,1,2,3};
        int k2 = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
        System.out.println(containsNearbyDuplicate(nums1, k1));
        System.out.println(containsNearbyDuplicate(nums2, k2));
        System.out.println("---------------------------------");
        System.out.println(containsNearbyDuplicateFaster(nums, k));
        System.out.println(containsNearbyDuplicateFaster(nums1, k1));
        System.out.println(containsNearbyDuplicateFaster(nums2, k2));
    }
}
