import java.util.*;
public class MaxRowColSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows  =  sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int maxRowSum = Integer.MIN_VALUE;
        int maxColSum = Integer.MIN_VALUE;
        for(int i = 0; i < rows; i++){
            int rowSum = 0;
            for(int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
            }
        }
        for(int j = 0; j < cols; j++){
            int colSum = 0;
            for(int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            if (colSum > maxColSum) {
                maxColSum = colSum;
            }
        }
        int luckyNumber = maxRowSum + maxColSum;
        System.err.println(luckyNumber);
    }
}
