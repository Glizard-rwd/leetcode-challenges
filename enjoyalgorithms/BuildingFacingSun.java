package enjoyalgorithms;
/*
https://www.enjoyalgorithms.com/blog/number-of-buildings-facing-sun/
 */
public class BuildingFacingSun {
    public static int facingSun(int[] arr) {
        int res = 1;
        int h = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > h) {
                h = arr[i];
                res++;
            }
        }
        return res; // output: a number
    }
    public static void main(String[] args) {
        System.out.println(facingSun(new int[] {7, 4, 8, 2, 9}));
    }
}