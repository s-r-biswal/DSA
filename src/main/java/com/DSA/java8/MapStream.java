package com.DSA.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Stream;

public class MapStream {

    public static void main(String[] args) {
        record Car(String make, String model, String color) {}

        Stream<Car> cars = Stream.of(new Car("Mahindra", "2028", "Red"),
                new Car("Tata", "2025", "Blue"));
                            cars.filter(c -> c.make().equals("Mahindra"))
                            .map(c -> c.make.toUpperCase())
                            .forEach(System.out::println);
    }

}
