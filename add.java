import java.util.*;
public class MatrixAddition {
    public static void main(String[] args) {
        System.out.println("Matrix Addition");
 
        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{5, 6}, {7, 8}};
 
        System.out.println("First Matrix:\n");
        displayMatrix(firstMatrix);
 
        System.out.println("Second Matrix:\n");
        displayMatrix(secondMatrix);
 
        sum(firstMatrix, secondMatrix);
    }
 
    private static void sum(int[][] first, int[][] second) {
        int row = first.length;
        int column = first[0].length;
        int[][] sum = new int[row][column];
 
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                sum[r][c] = first[r][c] + second[r][c];
            }
        }
 
        System.out.println("\nSum of Matrices:\n");
        displayMatrix(sum);
    }
 
    private static void displayMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }
    }
}
