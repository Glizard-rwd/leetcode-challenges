package arrayandstring.twopointer;

import java.util.Arrays;

public class _496_NextGreaterElementI {
    public static int[] nextGreaterElement(int[] n1, int[] n2) {
        int s = 0;
        int e = n2.length-1;
        int[] res = new int[n1.length];
        for (int i = 0; i < n1.length; i++) {
            while (s <= e) {
                if (n1[i] == n2[e]) {
                    res[i] = -1;
                    break;
                } else if (n1[i] == n2[s]) {
                    if (s + 1 < n2.length && n2[s] < n2[s+1]) {
                        res[i] = n2[s+1];
                    } else {
                        res[i] = -1;
                    }
                    break;
                } else {
                    s++;
                }
            }
            // Reset s for the next element in n1
            s = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        int[] nums3 = {2,4};
        int[] nums4 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
        System.out.println(Arrays.toString(nextGreaterElement(nums3, nums4)));
    }
}
