import java.util.*;
public class ListExample1 {
    public static void main(String[] args) {

// Creating a List 1 of Integer type using ArrayList

        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        // System.out.println("List l1: " + l1);

// Creating a List 2 of Integer type using LinkedList
        List<Integer> l2 = new LinkedList<>();
        l2.add(100);
        l2.add(200);
        l2.add(300);
        l2.add(400);
        l2.add(500);
        // System.out.println("List l2: " + l2);

// Printing the list

        System.out.println("Printing all elements using for loop:");
        for (int i = 0; i < l1.size(); i++) {
            System.out.println("Element at index " + i + ": " + l1.get(i));
        }

// Printing all elements using for-each loop

        System.out.println("Printing all element using for-each loop:");
        for (Integer i : l1) {
            System.out.println("Element: " + i);
        }

// Removing Element at a specific index

        System.out.println("Removing element at index 2:");
        l1.remove(2);
        System.out.println("List after removal: " + l1);

// Removing a specific element

        System.out.println("removing element 40:");
        l1.remove(Integer.valueOf(40));
        System.out.println("List after removal: " + l1);

// Adding an element at a specific index

        System.out.println("Adding element 60 at index 2:");
        l1.add(2, 60);
        System.out.println("List after addition: " + l1);
      

// Adding List 1 and List 2
        System.out.println("Adding List 1 and List 2:");
        l1.addAll(l2);
        System.out.println("List after addition: " + l1);

    }

}
