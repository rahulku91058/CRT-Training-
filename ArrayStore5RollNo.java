package com.rahul;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStore5RollNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [] rollno = new int[5];
//        int [] rollno = {1,2,3,4,5};

//        String[] marks = new String[5];
//        System.out.println(marks[2]);   //[null,null,null,null,null]

        int [] arr;
        arr = new int[5];
//        arr[1] = 32;
//        arr[2] = 54;
//        arr[2] = 654;
//        arr[3] = 354;
//        arr[4] = 45;
//        System.out.println(arr[4]);  //[0,0,0,0,0]

        //input using for loop
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
//            System.out.print(arr[i] + " ");
        }
        System.out.println(Arrays.toString(arr));

    }
}
