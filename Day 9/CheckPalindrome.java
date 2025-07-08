
import java.util.Scanner;

public class CheckPalindrome {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a string to check if it is a palindrome:");

    //     String str = sc.nextLine();
    //     str = str.toLowerCase(); 
    //     String reversedStr = "";
    //     for (int i = str.length() - 1; i >= 0; i--) {
    //         reversedStr += str.charAt(i);
    //     }
    //     if (str.equals(reversedStr)) {
    //         System.out.println(str + " is a palindrome.");
    //     } else {
    //         System.out.println(str + " is not a palindrome.");
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String str = sc.nextLine();
        str = str.toLowerCase(); 

        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

}