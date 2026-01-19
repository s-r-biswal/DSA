package com.DSA.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class SummingStream {

    public static void main(String[] args) {

    }

    private void fetchSumOfEmployeeSalary() {
        try {
            Stream<String> employees = Files.lines(Path.of("D:\\IdeaProjects\\DSA\\src\\main\\resources\\empdata.csv"));
            employees.map(line -> line.split(","));

                 

        }
        catch(IOException exp) {
            exp.printStackTrace();
        }
    }
}
