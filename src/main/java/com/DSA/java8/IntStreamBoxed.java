package com.DSA.java8;

import java.util.stream.IntStream;

public class IntStreamBoxed {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,20)
                .boxed()
                .map(i -> i*i)
                .forEach(System.out::print);

        IntStream.rangeClosed(1,20)
                .map(x -> x*x)
                .forEach(System.out::println);
    }
}
