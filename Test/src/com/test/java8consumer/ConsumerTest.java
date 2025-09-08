package com.test.java8consumer;

import java.util.function.Consumer;
//consumer is functional interface it has single abstract method that is accept method
//it never returns anything's consumer is always takes input it always going to accept and
// do some activity
public class ConsumerTest {
    public static void main (String args[]){
        Consumer<String> c = s-> System.out.println(s);
        c.accept("Hello Deepak");
        c.accept("Pls test this method");


    }
}
