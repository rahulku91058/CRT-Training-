package com.rahul;

public class LinearSearch1 {
    public static void main(String[] args) {
        int[] arr = {45,8,6,99,145,56,24,16,14,34};
        int target = 56;
        boolean ans = linearSearch3(arr, target);
        System.out.println(ans);

    }

    static boolean linearSearch3(int[] arr, int target){
        if(arr.length==0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element==target){
                return true;
            }
        }
        return false;
    }

//////////////////////////////////////////////////////////////////////
//    static int linearSearch1(int[] arr, int target){
//        if(arr.length==0){
//            return -1;
//        }
//        for (int element : arr) {
//            if (element == target) {
//                return element;
//            }
//        }
//        return -1;
//    }

/////////////////////////////////////////////////////////////////////
//    static int linearSearch2(int[] arr, int target){
//        if(arr.length==0){
//            return -1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            int element = arr[i];
//            if(element==target){
//                return i;
//            }
//        }
//        return -1;
//    }

}
