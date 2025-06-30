
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        // boolean isPrime = true;

        // if (num <= 1){
        //     isPrime = false;
        // }
        // else{
        //     for (int i = 2; i < Math.sqrt(num); i++) {
        //         if(num % i == 0){
        //             isPrime = false;
        //             break;
        //         }
        //     }
        // }
        // if(isPrime){
        //     System.out.println(num + " is a Prime Number");
        // }else{
        //     System.out.println(num + " is not a Prime Number");
        // }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        

        // if (num <= 1) {
        //     System.out.println(num + " is NOT Prime.");
        // } else {
        //     int count = 0;
        //     for (int i = 2; i < num; i++) {
        //         if (num % i == 0) {
        //             count++;
        //             break; // no need to check further
        //         }
        //     }
        //     if (count == 0) {
        //         System.out.println(num + " is Prime.");
        //     } else {
        //         System.out.println(num + " is NOT Prime.");
        //     }
        // }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        int i;
        for (i = 2; i < Math.sqrt(num); i++) {
            if(num %i==0){
                System.out.println(num + " is Not Prime.");
                break;
            }
        }
        if(i==num){
            System.out.println(num + " is Prime.");
        } 
    }
}