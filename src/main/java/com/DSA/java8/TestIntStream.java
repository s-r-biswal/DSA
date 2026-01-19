package com.DSA.java8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestIntStream {
     public static void main(String[] args) {
         String var = null;
         Stream.ofNullable(var).forEach(System.out::println);
         IntStream.of(1,3,5,8,5)
                 .filter(x->x%2==0)
                 .forEach(System.out::println);
         IntStream.range(1,41)
                 .filter(x->x%2==0)
                 .mapToObj(String :: valueOf)
                 .forEach(v -> System.out.print(v+"-"));
     }
}
