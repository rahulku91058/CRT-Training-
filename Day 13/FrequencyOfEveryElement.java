import java.util.*;
public class FrequencyOfEveryElement {
    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 4, 6, 8, 3, 2, 1, 4, 5, 3, 2};

        Map<Integer,Integer> frew = new HashMap<>();

        for(int num : a){
            frew.put(num, frew.getOrDefault(num, 0) + 1);

        }
        for(int  key : frew.keySet()){
            System.out.println(key+" : " + frew.get(key));
        }
    }
}
