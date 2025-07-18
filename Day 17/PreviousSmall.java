import java.util.*;
public class PreviousSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }   
            // result[i] = stack.isEmpty() ? -1 : stack.peek();
            if(stack.isEmpty()) {
                result[i] = -1; // No previous smaller element
            } else {
                result[i] = stack.peek(); // Previous smaller element
            }
            stack.push(arr[i]);
        }

        System.out.println("Previous smaller elements:");
        for (int res : result) {
            System.out.print(res + " ");
        }
    }
    
}
