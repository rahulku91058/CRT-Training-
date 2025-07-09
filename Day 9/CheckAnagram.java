
import java.util.*;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.println(isAnagram(str1, str2));
        
    }
    public static boolean isAnagram(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr1, arr2)) {
            return true;
        } else {
            return false;
        }
    }
    
}
