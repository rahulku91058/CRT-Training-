import java.util.*;
public class JarProblem {
    public static void main(String[] args) {
        int N = 10;
        int K = 5;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of candies to buy: ");
        int buy = sc.nextInt();

        if (buy <= (N - K)){
            System.out.println("Number of candies sold " + buy);
        } else {
            System.out.println("Invalid Input");
        }
    }    
}
