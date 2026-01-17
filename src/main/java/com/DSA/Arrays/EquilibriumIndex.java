package com.DSA.Arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int [] arr = { -7, 1, 5, 0,2 , -4, 3,0} ;
        int[] prefixSum = new int[arr.length];
        prefixSum(arr,prefixSum);
        for(int i=1;i<arr.length-1;i++){
            if(prefixSum[i-1] == prefixSum[arr.length-1] - prefixSum[i]) {
                System.out.println("Equilibrium index exist :" + i);
                break;
            }
            System.out.println("Equilibrium does not index exist :");
        }
    }

    private static void prefixSum(int[] arr, int[] prefixSum) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            prefixSum[i] = sum;
        }
    }
}
