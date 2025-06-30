import java.util.Scanner;
public class ArrayProg1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.print(arr[i] + " ");
            }
        System.out.println();
        System.out.println("Sum of the elements in the array: " + sum);
        }         
}