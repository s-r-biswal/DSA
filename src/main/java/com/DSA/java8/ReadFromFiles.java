package com.DSA.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFromFiles {
    public static void main(String[] args) {
        try {
            Files.lines(Path.of("D:\\IdeaProjects\\DSA\\src\\main\\resources\\empdata.csv"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
