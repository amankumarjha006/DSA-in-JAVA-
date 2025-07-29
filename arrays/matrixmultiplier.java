package arrays;
import java.util.*;

public class matrixmultiplier {
    // Remove inputMatrix, handle input in main

    public static void printMatrices(int[][] matrix1, int[][] matrix2) {
        System.out.println("\nFirst Matrix is:");
        for (int[] row : matrix1) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Second Matrix is:");
        for (int[] row : matrix2) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix after multiplication is:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n---Welcome, this program will multiply two matrices---\n");

        System.out.println("Enter the number of rows for the first matrix:");
        int rows1 = sc.nextInt();
        System.out.println("Enter the number of columns for the first matrix:");
        int cols1 = sc.nextInt();
        System.out.println("Enter the number of rows for the second matrix:");
        int rows2 = sc.nextInt();
        System.out.println("Enter the number of columns for the second matrix:");
        int cols2 = sc.nextInt();

        if (cols1 != rows2) {
            System.out.println("---Matrix multiplication not possible. Number of columns in first matrix must equal number of rows in second matrix.--");
            sc.close();
            return;
        }

        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];

        System.out.println("Enter " + rows1 * cols1 + " Elements for the first matrix");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter " + rows2 * cols2 + " Elements for the second matrix");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        printMatrices(matrix1, matrix2);
        multiplyMatrices(matrix1, matrix2);
        sc.close();
    }
}

