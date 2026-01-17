//package com.design.DSA;
//
//public class TappingRainWaterProbelm {
//    public int trap(int[] height) {
//        if(height==null || height.length==0)
//            return 0;
//        if(height.length==1)
//            return height[0];
//        if(height.length==2)
//            return Math.min(height[0],height[1]);
//
//        int left =0;int right = height.length-1;
//        int leftMax=0;int rightMax = 0;
//        while(left<right){
//            if(height[left]<height[right]){
//                left = Math.max(left,leftMax);
//            }
//        }
//
//    }
//
//
//}
