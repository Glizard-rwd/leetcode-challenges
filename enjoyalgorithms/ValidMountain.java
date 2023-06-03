package enjoyalgorithms;

public class ValidMountain {
    public static boolean validMountain(int[] arr, int n) {
        // input: array and (length n of array)
        // output: boolean
        int l = 0; // left
        int r = n-1; // right
        while (l < n-1 && arr[l] < arr[l+1]) l++; // move left pointer to right
        while (r > 0 && arr[r] < arr[r-1]) r--; // move right pointer to left

        if (l > 0 && r < n-1 && l == r)
            return true; // left + right matching
        else
            return false; // no match or n < 3
    }
    public static void main(String[] args) {
        System.out.println(validMountain(new int[] {1, 2, 6, 5, 3}, 5));
        System.out.println(validMountain(new int[] {5, 8, 8}, 3));
    }
}
