import java.util.*;
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text to encrypt: ");
        String input = sc.nextLine();
        System.out.print("Enter the shift value (1-25): ");
        int key = sc.nextInt();
        if (key < 1 || key > 25) {
            System.err.println("Invalid shift value, between 1 and 25.");
            return;
        }
        StringBuilder encryptedText = new StringBuilder();
        

    }
}
