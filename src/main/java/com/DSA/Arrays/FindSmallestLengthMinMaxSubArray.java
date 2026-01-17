package com.DSA.Arrays;

import java.util.Arrays;

public class FindSmallestLengthMinMaxSubArray {
    public static void main(String[] args) {

        int[] arr = {2, 0, 1, 0, 6, 6, 5};

        int max = Arrays.stream(arr).max().orElseThrow();
        int min = Arrays.stream(arr).min().orElseThrow();

        int minIndex = -1;
        int maxIndex = -1;

        int lastMin = -1, lastMax = -1;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max) {
                lastMax = arr[i];
            }
            if(arr[i] == min) {
                lastMin = arr[i];
            }
            if(lastMin != -1 && lastMax != -1){
                 int length = Math.abs(max - min)+1;
                 if(length < minLength){
                     minLength = length;
                     minIndex = Math.min(lastMin, lastMax);
                     maxIndex = Math.max(lastMin, lastMax);
                 }
            }
        }
        System.out.println(minLength + " Max :" + maxIndex + " Min :" + minIndex);
    }
}