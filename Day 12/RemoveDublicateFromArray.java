
import java.util.*;

public class RemoveDublicateFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        };
    
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            s.add(arr[i]);
        }
        System.out.println(s);
    }    
}
