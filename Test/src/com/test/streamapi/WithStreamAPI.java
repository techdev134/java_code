package com.test.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamAPI {
    public static  void main (String args[]){
        ArrayList<Integer> al =new ArrayList<Integer>();
        al.add(10);
        al.add(45);
        al.add(48);
        al.add(24);
        System.out.println("Total Number is: " +al);
        List<Integer> al1= al.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Even Number after filter :" +al1);

    }
}
