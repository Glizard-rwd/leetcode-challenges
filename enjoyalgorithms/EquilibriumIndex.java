package enjoyalgorithms;
/*
https://www.enjoyalgorithms.com/blog/find-equilibrium-index-of-an-array/
 */
public class EquilibriumIndex {
    public static int equilibriumIndex(int[] arr, int n) {
        int total = 0;
        int s = 0;
        for (int i: arr) {
            total += i;
        }

        for (int i = 0; i < n; i++) {
            int e = total - s - arr[i]; // other = total - s - current element
            if (s == e) return i; // when start == other that is the result
            s += arr[i]; // add current number to the start
        }
        return -1; // equilibrium index does not exit
    }

    public static void equilibriumIndPrefix(int[], int n) {
        int[] prefix = new int[n]; // declare prefix array
        // add element to prefix array
        for (int i = 0; i < n; i++) {
            
        }
    }
    public static void main(String[] args) {

    }
}
