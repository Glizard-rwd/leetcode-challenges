package arrayandstring.twopointer;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class _881_BoatstoSavePeople {
    public static int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p);
        System.out.println(Arrays.toString(p));
        int boatNum = 0;
        int min = 0;
        int max = p.length-1;
        while (min <= max) {
            int remain = limit - p[max];
            boatNum++;
            max--; // always move max to the left
            if (min <= max && remain >= p[min]) {
                min++;
            }
        }
        return boatNum;
    }

    public static int numRescueBoats_1(int[] p, int limit) {
        Arrays.sort(p);
        System.out.println(Arrays.toString(p));
        int boatNum = 0;
        int min = 0;
        int max = p.length-1;
        while (min <= max) {
            int sumW = p[min] + p[max];
            if (sumW <= limit) {
                min++;
            }
            boatNum++;
            max--;
        }
        return boatNum;
    }
    public static void main(String[] args) {
        System.out.println(numRescueBoats(new int[]{1,2}, 3));
        System.out.println(numRescueBoats(new int[]{1,2,2,3}, 3));
        System.out.println(numRescueBoats(new int[]{1,1,2,3}, 3));
        System.out.println(numRescueBoats(new int[]{3,5,3,4}, 5));
        System.out.println(numRescueBoats(new int[]{1,1,2,2,3,3,4}, 4));
        System.out.println(numRescueBoats(new int[]{1,1,2,2,3,3,4,4}, 4));
        System.out.println("-----------------------------------------------");
        System.out.println(numRescueBoats_1(new int[]{1,2}, 3));
        System.out.println(numRescueBoats_1(new int[]{1,2,2,3}, 3));
        System.out.println(numRescueBoats_1(new int[]{1,1,2,3}, 3));
        System.out.println(numRescueBoats_1(new int[]{3,5,3,4}, 5));
        System.out.println(numRescueBoats_1(new int[]{1,1,2,2,3,3,4}, 4));
        System.out.println(numRescueBoats_1(new int[]{1,1,2,2,3,3,4,4}, 4));
    }
}
