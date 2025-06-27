package com.rahul;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter 1st Subject Marks: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Subject Marks: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Subject Marks: ");
        int c = sc.nextInt();
        System.out.print("Enter 4th Subject Marks: ");
        int d = sc.nextInt();
        System.out.print("Enter 5th Subject Marks: ");
        int e = sc.nextInt();

        // Calculate average
        int total = a + b + c + d + e;
        double average = total / 5.0;

        // Grade logic
        if (average >= 90) {
            System.out.println("A+ Grade");
        } else if (average >= 80) {
            System.out.println("A Grade");
        } else if (average >= 70) {
            System.out.println("B+ Grade");
        } else if (average >= 60) {
            System.out.println("C Grade");
        } else if (average >= 35) {
            System.out.println("D Grade");
        } else {
            System.out.println("Fail");
        }
    }
}
