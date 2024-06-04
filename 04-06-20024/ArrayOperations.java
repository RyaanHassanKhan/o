import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        // Transpose of a Matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] transposeMatrix = transpose(matrix);
        
        System.out.println("Original Matrix:");
        displayMatrix(matrix);
        System.out.println("Transpose Matrix:");
        displayMatrix(transposeMatrix);
        
        // Operations on 1-D array
        int[] array1D = {1, 2, 3, 4, 5};
        System.out.println("1-D Array:");
        displayArray(array1D);
        
        // Operations on 2-D array
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("2-D Array:");
        displayMatrix(array2D);
        
        // Operations on 3-D array
        int[][][] array3D = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            },
            {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
            }
        };
        System.out.println("3-D Array:");
        display3DArray(array3D);
    }
    
    // Method to find transpose of a matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposeMatrix = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }
    
    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    
    // Method to display a 1-D array
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    // Method to display a 3-D array
    public static void display3DArray(int[][][] array) {
        for (int[][] matrix : array) {
            for (int[] row : matrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
