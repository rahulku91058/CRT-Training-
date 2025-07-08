
import java.util.Scanner;

public class RobotUpDownRightLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of commands (U, D, R, L):");
        String run = sc.nextLine().toUpperCase();
        int x = 0;
        int y = 0;
        for (int i = 0; i < run.length(); i++) {
            char command = run.charAt(i);
            switch (command) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                default:
                    System.out.println("Invalid command: " + command);
            }

        }
        System.err.println("Current position: (" + x + ", " + y + ")");

        double distance = Math.sqrt(x * x + y * y);
        System.out.println("Distance from origin: " + distance);

        
    }
}
