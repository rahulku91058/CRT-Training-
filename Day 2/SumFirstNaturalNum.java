
import java.util.Scanner;

public class SumFirstNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum +=i; 
        }
        System.out.println("Sum of First "+n+" Natural Number: " +sum);
    }
}
