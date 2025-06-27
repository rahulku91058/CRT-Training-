package com.rahul;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if (a % 2 == 0){
            System.out.println(a+" is Even");
        }else{
            System.out.println(a+" is Odd");
        }
    }
}
