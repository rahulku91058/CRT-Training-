import java.util.*;
public class WashingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Weigth of clothes: ");
        if(sc.hasNextInt()) {
            int weight = sc.nextInt();
            if (weight < 0) {
                System.out.println("Invalid Input");
            } else if (weight == 0) {
                System.out.println("Estimated time to wash: 0 minutes");
            } else if (weight <= 2000) {
                System.out.println("Estimated time to wash: 25 minutes");
            } else if (weight <= 4000) {
                System.out.println("Estimated time to wash: 35 minutes");
            } else if (weight <= 7000) {
                System.out.println("Estimated time to wash: 45 minutes");
            }
            else if (weight > 7000) {
                System.out.println("Overload! Cannot wash more than 7000 grams");
            }
             else {
                System.out.println("Invalid Input");
            }

        }
    }
    
}
