package enjoyalgorithms;

import java.util.HashSet;

/*
Given an integer array of size n, write a program to find all the Leaders in the array. An element is a Leader if it is
strictly greater than all the elements to its right side. The last element of an array is a Leader by default.
The largest element of an array is also a Leader by default. Suppose all the array elements are unique.
Ordering in the output doesn’t matter.

Important note: before moving on to the solutions,
we recommend trying this problem on paper for at least 15 or 30 minutes.

Example 1: Input: [16, 17, 4, 3, 5, 2] Output: [17, 5, 2]
 */
public class FindLeader {
    public static HashSet<Integer> findLeader(int[] arr) {
        HashSet<Integer> res = new HashSet<>();
        int max = arr[arr.length-1];
        res.add(max);

        for (int r = arr.length-2; r >= 0; r--) {
            if (arr[r] > max) {
                max = arr[r];
                res.add(max);
            }
        }
        return res; // output is nothing or arr of int
    }

    public static void main(String[] args) {
        System.out.println(findLeader(new int[] {16,17,4,3,5,2}));
        System.out.println(findLeader(new int[] {6,5,4,3,2,1}));
        System.out.println(findLeader(new int[] {1,2,3,4,5,6}));
    }
}