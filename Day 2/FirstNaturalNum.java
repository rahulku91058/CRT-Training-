
import java.util.Scanner;

public class FirstNaturalNum {
    public static void main(String[] args) {
        System.out.println("First N Natural Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <=n ; i ++){
            System.out.println(i);
        }
    }
}
