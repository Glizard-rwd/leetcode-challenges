package arrayandstring.slicingwindow;

import java.util.HashSet;
import java.util.Set;

public class _3_LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> chars = new HashSet<>();
        int l = 0;
        int res = 0;

        for (int r = 0; r < s.length(); r++) {
            while (chars.contains(s.charAt(r))) {
                chars.remove(s.charAt(l));
                l++;
            }
            chars.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    public static int secondSolution(String s) {
        int res = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            if (s.charAt(l) == s.charAt(r)) {
                l = r;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        String str1 = "bbbbb";
        String str2 = "pwwkew";
        String str3 = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(str1));
        System.out.println(lengthOfLongestSubstring(str2));
        System.out.println(lengthOfLongestSubstring(str3));

        System.out.println(secondSolution(str1));
        System.out.println(secondSolution(str2));
        System.out.println(secondSolution(str3));

    }
}
