package com.falmeida.tech;

public class SequenceSubNoAdjacent {

    public static int maxSumSubseq(int[] arr, int i, int n, int prev) {
        // base case: all elements are processed
        if (i == n) {
            return 0;
        }

        // recur by excluding current element
        int excl = maxSumSubseq(arr, i + 1, n, prev);

        int incl = 0;

        // include current element only if it is not adjacent
        // to previous element considered
        if (prev + 1 != i) {
            incl = maxSumSubseq(arr, i + 1, n, i) + arr[i];
        }

        // return maximum sum we get by including or excluding
        // current item
        return Integer.max(incl, excl);
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 9, 4, 5, 0, 4, 11, 6 };
        System.out.print("Maximum sum is "
                + maxSumSubseq(A, 0, A.length, Integer.MIN_VALUE));
    }

}
