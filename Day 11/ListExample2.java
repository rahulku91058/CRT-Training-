
import java.util.*;

public class ListExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("You want exit press -1");

        while (true) { 
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            list.add(num);
        }
        System.out.println(list);
    }    
}
