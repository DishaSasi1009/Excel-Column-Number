import java.util.Scanner;

public class SpiralMatrixTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        scanner.close();

        printSpiralOrder(matrix, n);
    }

    public static void printSpiralOrder(int[][] matrix, int n) {
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int val=1;
        StringBuilder result = new StringBuilder();

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                matrix[top][i]=val;
                val++;
            }
            top++;

  
            for (int i = top; i <= bottom; i++) {
                matrix[i][right]=val;
                val++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i]=val;
                    val++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left]=val;
                    val++;
                }
                left++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((matrix[i][j])+"  ");
            }
            System.out.println();
        }
    }
}
