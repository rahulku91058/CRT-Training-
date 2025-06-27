package com.rahul;

import java.util.Scanner;

public class TernaryOperatorEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2st Number: ");
        int b = sc.nextInt();
        boolean result = (a < b) ? true : false;
        System.out.println(result);
    }
}
