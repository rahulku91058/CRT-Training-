package com.rahul;

public class LinearSearchString {
    public static void main(String[] args) {
        String name = "Rahul";
        char target = 'u';
        System.out.println(search(name,target));

    }
    static boolean search(String name, char target){
        if(name.length()==0){
            return false;
        }
        for (int i = 0; i <name.length(); i++) {
            if(target==name.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
