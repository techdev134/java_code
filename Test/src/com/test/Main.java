package com.test;

public class Main {
    public static void main(String[] args) {
        //object1
        Employee e1 = new Employee("Deepak","TCS",90000);

        //object 2
        Employee e2 = new Employee("Daksh","Infosys",80000);

        //object 3
        Employee e3 = new Employee("Sachin","TechM",780000);

        e1.shift();
        e1.display();
        e2.shift();
        e2.display();
        e3.shift();
        e3.display();
    }
}
