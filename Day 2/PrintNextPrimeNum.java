
import java.util.Scanner;

public class PrintNextPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int next = n + 1;

        if ( n < 2){
            System.out.println(n + " is Not Prime.");
        }
        else{
            while(true){
                boolean isPrime = true;
                for(int i = 2; i < Math.sqrt(next); i++){
                    if(next % i == 0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                     System.out.println("Next Prime is " + next);
                     break;
                }
                next++;
            }
        }
    }
}
