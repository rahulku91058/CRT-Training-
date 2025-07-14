import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A",80);
        map.put("B", 70);
        map.put("c", 65);
        map.put("B", 70);
        map.put("D", 60);
        map.put("E", 89);

        for(String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

    }
    
}
