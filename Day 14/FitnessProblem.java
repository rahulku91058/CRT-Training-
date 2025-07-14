import java.util.*;
public class FitnessProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t1r1, t1r2, t1r3;
        int t2r1, t2r2, t2r3;
        int t3r1, t3r2, t3r3;

        System.out.print("Enter Oxygen level for trainee 1: ");
        t1r1 = sc.nextInt();
        t1r2 = sc.nextInt();
        t1r3 = sc.nextInt();

        System.out.print("Enter Oxygen level for trainee 2: ");
        t2r1 = sc.nextInt();
        t2r2 = sc.nextInt();
        t2r3 = sc.nextInt();

        System.out.print("Enter Oxygen level for trainee 3: ");
        t3r1 = sc.nextInt();
        t3r2 = sc.nextInt();
        t3r3 = sc.nextInt();

        int t1Avg = Math.round((t1r1 + t1r2 + t1r3) / 3.0f);
        int t2Avg = Math.round((t2r1 + t2r2 + t2r3) / 3.0f);
        int t3Avg = Math.round((t3r1 + t3r2 + t3r3) / 3.0f);

        int maxAvg = Math.max(t1Avg, Math.max(t2Avg, t3Avg));

        if (maxAvg < 70){
            System.out.println("All Trainees are unfit");
        }else {
            if (t1Avg == maxAvg) System.err.println("Trainee Number : 1");
            if (t2Avg == maxAvg) System.err.println("Trainee Number : 2");
            if (t3Avg == maxAvg) System.err.println("Trainee Number : 3");
            System.err.println("Highest Oxygen Level: " + maxAvg);
        }
    }
    // public static int validInput(Scanner sc) {
    //     int value;
    //     while (true) {
    //         System.out.print("Enter a value between 0 and 100: ");
    //         value = sc.nextInt();
    //         if (value >= 0 && value <= 100) {
    //             break;
    //         } else {
    //             System.out.println("Invalid input. Please try again.");
    //         }
    //     }
    //     return value;
    // }
    
}
