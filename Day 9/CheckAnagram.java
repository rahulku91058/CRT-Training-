
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();
        
    }
    public static boolean isAnagram(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }

    }
    
}
