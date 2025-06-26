package com.rahul;

import javax.xml.stream.events.StartDocument;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,8,5,65,12,52,11};
        int target = 9;
        System.out.println(search(arr, target, 1,4));
    }
    static boolean search(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return false;
        }
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if(element==target){
                return true;
            }
        }
        return false;
    }
}
