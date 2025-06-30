
import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

        }
        int largest = -1;
        int secondlargest = -1;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        System.out.println("The second largest element in the array is: " + secondlargest);
    }
    
}
