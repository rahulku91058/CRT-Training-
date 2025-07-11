import java.util.*;
public class SetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        // HashSet is a collection that contains no duplicate elements
        Set<Integer> s = new HashSet<>();
        // Adding elements to the set
        s.add(1);
        s.add(6);
        s.add(30);
        s.add(8);
        s.add(5);
        s.add(2);
        System.err.println("Set elements: " + s);

        // Creating a TreeSet

        Set<Integer> t = new TreeSet<>();
        t.add(1);
        t.add(6);
        t.add(3);
        t.add(8);
        t.add(5);
        t.add(2);
        System.out.println("TreeSet elements: " + t);

        // Creating a LinkedHashSet

        Set<Integer> l = new LinkedHashSet<>();
        l.add(1);
        l.add(6);
        l.add(3);
        l.add(8);
        l.add(5);
        l.add(2);
        System.out.println("LinkedHashSet elements: " + l);
    }    
}
