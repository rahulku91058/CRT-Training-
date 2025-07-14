
import java.util.*;

public class MaxFreqWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        countWord(str);
    }
    public static void countWord(String str){
        Map<String, Integer> map = new HashMap<>();
        String[] word = str.split("\\s+");
        for(String w : word) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        String maxWord = "";
        int maxCount = 0;

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
        }
        System.out.println(maxWord + " : " + maxCount);
    }
}
