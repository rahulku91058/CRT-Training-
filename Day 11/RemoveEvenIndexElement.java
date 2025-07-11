
import java.util.*;

public class RemoveEvenIndexElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the number of elements in the list:");

        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            list.add(num);
            
        }
        System.out.println("Original List: " + list);

        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                list.remove(i);
            }           
        }
        System.out.println("List after removing elements at even indices: " + list);
    }
    
}
