
import java.util.Scanner;

public class FirstNOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("First " + n + " Odd Numbers:");
        for ( int i = 1; i <= n; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    
}
