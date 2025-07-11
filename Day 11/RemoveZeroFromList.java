import java.util.*;
public class RemoveZeroFromList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the number of elements in the list (enter -1 to stop):");

        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            list.add(num);
        }
        System.out.println("Original List: " + list);
        int x=list.size();

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == 0) {
                list.remove(i);
            }
        }
        System.out.println("List after removing zeros: " + list);
        for(int i=list.size();i<x;i++){
            list.add(0);
        }
        System.out.println("List after adding zeros at the end: " + list);
    }

    
}
