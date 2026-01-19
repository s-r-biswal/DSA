package com.DSA.java8;
public class Employee {
    private String name;
    private String location;
    private int salary;
    private String dob;
    private String jobType;
    private int orgSize;

    public Employee(String name, String location, int salary, String dob, String jobType, int orgSize) {
        this.name = name;
        this.location = location;
        this.salary = salary;
        this.dob = dob;
        this.jobType = jobType;
        this.orgSize = orgSize;
    }
    private void createEmployee(Employee emp) {
        this.name = emp.name;
        this.location = emp.location;
        this.salary = emp.salary;
        this.dob = emp.dob;
        this.jobType = emp.jobType;
        this.orgSize = emp.orgSize;
    }


 }
