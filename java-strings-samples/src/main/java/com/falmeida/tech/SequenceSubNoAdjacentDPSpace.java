package com.falmeida.tech;

public class SequenceSubNoAdjacentDPSpace {

    // Constant space DP-solution to calculate maximum sum in the given
    // array with no adjacent elements considered
    public static int maxSumSubseq(int[] A)
    {
        // base case
        if (A.length == 1) {
            return A[0];
        }

        // store maximum sum till index i-2
        int prev_prev = A[0];

        // stores maximum sum till index i-1
        int prev = Integer.max(A[0], A[1]);

        // start from index 2
        for (int i = 2; i < A.length; i++) {
            // curr stores the maximum sum till index i
            int curr = Integer.max(A[i], Integer.max(prev, prev_prev + A[i]));
            prev_prev = prev;
            prev = curr;
        }

        // return maximum sum
        return prev;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 9, 4, 5, 0, 4, 11, 6 };

        System.out.println("Maximum sum is " + maxSumSubseq(A));
    }

}
