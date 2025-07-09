
import java.util.Scanner;

public class StirngQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(isAscending(str));
    }
    public static boolean isAscending(String str) {
        String[] words = str.split("\\s+");
        int prev = -1;

        for (String word : words) {
            if(isNumeric(word)) {
                int num = Integer.parseInt(word);
                if (num < prev) {
                    return false;
                }
                prev = num;
            }
        }
        return true;
    }
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
