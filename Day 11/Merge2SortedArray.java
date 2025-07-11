import java.util.*;
public class Merge2SortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        //Method 1: Using for loop
        
        // for (int i = 0; i < list2.size(); i++) {
        //     int val = list2.get(i);
        //     boolean inserted = false;

        //     for (int j = 0; j < list1.size(); j++) {
        //         if (val < list1.get(j)) {
        //             list1.add(j, val); 
        //             inserted = true;
        //             break;
        //         }
        //     } 
        //     if (!inserted) {
        //         list1.add(val);
        //     }
        // }
        // System.out.println("Merged Sorted List: " + list1);


        //Method 2: Using While loop

        // int i = 0, j = 0;

        // while(j < list2.size()) {
        //     while(i < list1.size() && list1.get(i) <= list2.get(j)){
        //         i++;
                
        //     }
        //     list1.add(i, list2.get(j));
        //     i++;
        //     j++;
        // }
        // System.out.println("Merged Sorted List: " + list1);

        //Method 3: Using New ArrayList

        ArrayList<Integer> list3 = new ArrayList<>();

        int i = 0, j = 0;

        for (i = 0; i < list1.size(); i++){
            for (j = 0; j < list2.size(); j++){
                if(list1.get(i) <= list2.get(j)){
                    list3.add(list1.get(i));
                }
                else{
                    list3.add(list2.get(j));
                }
            }
        }

    }
    
}
