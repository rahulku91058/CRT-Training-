import java.util.*;
public class FreqChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine().toLowerCase();
        countChar(str);
    }
    public static void countChar(String str){
        Map<Character, Integer> charCount = new HashMap<>();

        for(char ch : str.toCharArray()) {
            if(ch!=' ')
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);

        }
        for(char key : charCount.keySet()) {
            System.out.println(key + " : " + charCount.get(key));
        }
    }
    
}
