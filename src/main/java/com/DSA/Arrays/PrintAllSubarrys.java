package com.DSA.Arrays;

public class PrintAllSubarrys {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j =i; j< n;j++){
                String arrayString = "";
                for(int k = i; k<= j;k++){
                    arrayString = arrayString.concat(String.valueOf(arr[k])+",");
                }
                System.out.println(arrayString);
            }
        }
    }
}
