package arrayandstring.twopointer;

import java.util.Arrays;

public class _344_ReverseString {
    public static void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        char[] s1 = {'h','e','l','l','o'};
        reverseString(s);
        reverseString(s1);
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(s1));
    }
}
