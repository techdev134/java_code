package com.test.streamapi;

import java.util.ArrayList;

public class WithoutStreamsEvenNum {
    public static void main(String args[]){
    ArrayList<Integer> l1 = new ArrayList<Integer>();
    l1.add(10);
    l1.add(20);
    l1.add(13);
    l1.add(15);
    l1.add(16);
    l1.add(19);
    l1.add(13);
    ArrayList<Integer> L2 = new ArrayList<Integer>();

    //now i want even number
        for (Integer I:l1){
            if (I%2==0){
                L2.add(I);

            }
        }
        System.out.println("Even number :"+ L2);
    }
}
