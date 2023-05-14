package arrayandstring.kadanealgorithms;

public class _978_LongestTurbulentSubarray {
    public static int maxTurbulenceSize(int[] arr) {
        int l = 0;
        int r = 1;
        int res = 1;
        String sign = "";
        while (r < arr.length) {
            if (arr[r-1] > arr[r] && !sign.equals(">")) {
                res = Math.max(res, r - l + 1);
                r++;
                sign = ">";
            } else if (arr[r-1] < arr[r] && !sign.equals("<")) {
                res = Math.max(res, r - l + 1);
                r++;
                sign = "<";
            } else {
                r = (arr[r-1] == arr[r])? r + 1: r;
                l = r-1;
                sign = "";
            }
        }

        return res;

    }
    public static void main(String[] args) {
        int[] arr = {9,4,2,10,7,8,8,1,9};
        System.out.println(maxTurbulenceSize(arr));
    }
}
