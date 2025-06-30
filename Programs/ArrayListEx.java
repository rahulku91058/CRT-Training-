package com.rahul;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        System.out.println(list);
//        list.add(0,6); //Update element
//        list.set(0,8); //Modify/Change element at index 0
//        list.remove(5);  //remove element at index 5
//        System.out.println(list);

        Scanner sc = new Scanner(System.in);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));

        }
        System.out.println(list);
    }
}
