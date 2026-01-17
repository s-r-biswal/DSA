package com.DSA.Arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RetuenTrueIfDuplicatesExist {
    public static void main(String[] args) {
        System.out.println(checkDuplicatesExist());
    }
    public static boolean checkDuplicatesExist(){
       int[] nums = {1, 2, 3, 3};
       Set<Integer> set = Arrays.stream(nums)
               .boxed()
               .collect(Collectors.toSet());
       return set.size() == nums.length;
    }
}
