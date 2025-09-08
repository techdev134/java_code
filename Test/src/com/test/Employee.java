package com.test;

public class Employee {
    String employeeName;
    String company;
     double salary;

    public Employee(){
    }

    public Employee(String employeeName, String company, double salary) {
        this.employeeName = employeeName;
        this.company = company;
        this.salary = salary;
    }
    //method shift
    void shift(){
        System.out.println("shift method calling");
    }
    void display(){
        System.out.println("Name: "+employeeName);
        System.out.println("company: "+company);
        System.out.println("salary: "+salary);
    }

}
