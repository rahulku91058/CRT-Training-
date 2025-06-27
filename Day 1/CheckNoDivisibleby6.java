package com.rahul;

import java.util.Scanner;

public class CheckNoDivisibleby6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if (a % 6 == 0){
            System.out.println("a is divisible by 6");
        }else{
            System.out.println("a is not divisible by 6");
        }
    }
}
