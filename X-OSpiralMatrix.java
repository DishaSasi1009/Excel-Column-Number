import java.util.Scanner;

public class SpiralMatrixTraversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        char[][] matrix = new char[n][n];

        printSpiralOrder(matrix, n);
    }

    public static void printSpiralOrder(char[][] matrix, int n) {
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        char ch='X';

        while (top <= bottom && left <= right) {
            
            for (int i = left; i <= right; i++) {
              matrix[top][i]=ch;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right]=ch;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i]=ch;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left]=ch;
                }
                left++;
            }
             if(ch=='X'){
                ch='O';
            }
            else{
                ch='X';
            }
        }

         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
