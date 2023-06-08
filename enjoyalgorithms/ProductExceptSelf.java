package enjoyalgorithms;

import java.util.Arrays;

/*
no division
first solution: O(1)
second solution: O(n);
 */
public class ProductExceptSelf {
    static int[] productExceptSelf(int[] X, int n) {
        int[] product = new int[n];
        Arrays.fill(product, 0);
        product[0] = 1;
        for (int i = 1; i < n; i++) {
            product[i] = product[i-1] * X[i-1];
        }

        int suffix = 1;
        for (int i = n-1; i >= 0 ; i--) {
            product[i] *= suffix;
            suffix *= X[i];
        }
        return product;
    }

    static int[] productExceptSelfPreSuf(int[] X, int n) {
        int[] product = new int[n];
        int[] prefix = new int[n];
        int[] postfix = new int[n];

        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] * X[i-1];
        }

        postfix[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            postfix[i] = postfix[i+1] * X[i+1];
        }

        for (int i = 0; i < n; i++) {
            product[i] = prefix[i] * postfix[i];
        }
        return product;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr, arr.length)));
        System.out.println(Arrays.toString(productExceptSelfPreSuf(arr, arr.length)));
    }
}
