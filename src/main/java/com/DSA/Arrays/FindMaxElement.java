package com.DSA.Arrays;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int[] rightMax = new  int[arr.length];
        for(int i = 0; i < n ; i++){
            rightMax[i] = findMax(arr,i,n);
        }
    }

    public static int  findMax(int[] arr, int start, int end){
        for(int j = start; j < end; j++){

        }
        return 0;
    }
}
