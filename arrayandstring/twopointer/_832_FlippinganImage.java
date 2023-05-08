package arrayandstring.twopointer;

import java.util.Arrays;

public class _832_FlippinganImage {
    public static void flip(int[] m) {
        /*
        flip and invert at the same time: beat 50%
         */
        int s = 0;
        int e = m.length-1;
        while (s < e) {
            int temp = m[s];
            m[s] = 1 - m[e];
            m[e] = 1 - temp;
            s++;
            e--;
        }
        if (s == e) {
            m[s] = 1 - m[s];
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] i: image) {
            flip(i);
        }
        return image;
    }
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
}
