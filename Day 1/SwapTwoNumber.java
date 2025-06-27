package com.rahul;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        Using Third Variable
//        int temp = a;
//        a = b;
//        b = temp;

//       Using Arthmetic
//        a = a + b;
//        b = a - b;
//        a = a - b;

//       Using Bitwise XOR

        a = a ^ b;  //  0101 ^ 1010 = 1111 (15)
        b = a ^ b;  // 1111 ^ 1010 = 0101 (5)
        a = a ^ b;  //  1111 ^ 0101 = 1010 (10)

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
