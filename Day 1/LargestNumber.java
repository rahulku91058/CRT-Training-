package com.rahul;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.print("Enter c:");
        int c = sc.nextInt();

        if (a>b && b>c){
            System.out.println("a is greater");
        }
        else if (b>a && a>c) {
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }
    }
}
