package com.DSA.Arrays;

public class EvenOddIndex {

    public static void main(String[] args) {

        int[] arr = {2, 1, 6, 4};

        int[] evenPrefix = prefixSumEven(arr);
        int[] oddPrefix = prefixSumOdd(arr);

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int leftEven = (i > 0) ? evenPrefix[i - 1] : 0;
            int leftOdd  = (i > 0) ? oddPrefix[i - 1] : 0;

            int rightEven = evenPrefix[n - 1] - evenPrefix[i];
            int rightOdd  = oddPrefix[n - 1] - oddPrefix[i];

            if (i % 2 == 0) {
                if (leftEven + rightOdd == leftOdd + rightEven) {
                    System.out.println("Equilibrium index exists at: " + i);
                }
            } else {
                if (leftOdd + rightEven == leftEven + rightOdd) {
                    System.out.println("Equilibrium index exists at: " + i);
                }
            }
        }
    }

    private static int[] prefixSumEven(int[] arr) {
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0]; // index 0 is even

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1];
            if (i % 2 == 0) {
                prefix[i] += arr[i];
            }
        }
        return prefix;
    }

    private static int[] prefixSumOdd(int[] arr) {
        int[] prefix = new int[arr.length];

        prefix[0] = 0; // index 0 is even

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1];
            if (i % 2 != 0) {
                prefix[i] += arr[i];
            }
        }
        return prefix;
    }
}