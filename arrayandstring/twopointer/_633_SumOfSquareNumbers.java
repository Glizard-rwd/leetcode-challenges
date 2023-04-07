package arrayandstring.twopointer;

import java.util.Arrays;

public class _633_SumOfSquareNumbers {
    public static boolean judgeSquareSum(int c) {
        if (c<0) return false; // sum of square number cannot smaller than 0
        long start = 0; // sum of large integer can exceed the range of integer therefore we will use long type
        long end = (long) Math.sqrt(c); // if a, b < c therefore a^2 + b^2 < c^2
        while (start <= end) {
            long current = start*start + end*end;
            if (current < c) start++;
            else if (current > c) end--;
            else return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
        System.out.println(judgeSquareSum(3));
        System.out.println(judgeSquareSum(2));
        System.out.println(judgeSquareSum(1));
        System.out.println(judgeSquareSum(-1));
    }
}
