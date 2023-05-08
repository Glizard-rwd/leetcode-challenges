package arrayandstring.twopointer;

public class _125_ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String regex = "[^a-zA-Z0-9]";
        s = s.replaceAll(regex, "").toLowerCase();
        int l = 0;
        int r = s.length()-1;
        boolean isPali = true;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                isPali = false;
            }
            l++;
            r--;
        }
        return isPali;
    }

    public static boolean isPalindromeFaster(String s) {
        /*
        Check character is ASCII or not: letter or digit
        Only when left < right and right > left (avoid out of bound)
        If yes then check equal
         */
        int l = 0;
        int r = s.length()-1;
        while (l < r) {
            while ((l < r) && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while ((r > l) && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        String s1 = "race a car";
        System.out.println(isPalindrome(s1));
        String s2 = "0P";
        System.out.println(isPalindrome(s2));
        System.out.println("--------------------------");
        System.out.println(isPalindromeFaster(s));
        System.out.println(isPalindromeFaster(s1));
        System.out.println(isPalindromeFaster(s2));
    }
}
