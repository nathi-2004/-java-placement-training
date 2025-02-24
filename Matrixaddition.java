import java.util.Scanner;
public class Matrixaddition {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
  System.out.println("Enter number of rows:");
        int r = in.nextInt();  
 System.out.println("Enter number of columns:");
        int c = in.nextInt();  
        int[][] matrix1 = new int[r][c];
        int[][] matrix2 = new int[r][c];
        int[][] resultMatrix = new int[r][c]; 
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter element for matrix1 position [" + i + "][" + j + "]:");
                matrix1[i][j] = in.nextInt();
            }
        }
         System.out.println("The matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix1[i][j] +" ");  
            }
            System.out.println();
        }
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter element for matrix2 position [" + i + "][" + j + "]:");
                matrix2[i][j] = in.nextInt();
            }
        }
         System.out.println("The matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix2[i][j] +" ");  
            }
            System.out.println();
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];  
            }
        }

        System.out.println("The resulting matrix after addition is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(resultMatrix[i][j] + " "); 
            System.out.println(); 
        }
    }
}
}