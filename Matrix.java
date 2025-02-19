import java.util.*;
class Matrix {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r = in.nextInt();  
        System.out.println("Enter number of columns:");
        int c = in.nextInt();  
        int matrix[][] = new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter element for position [" + i + "][" + j + "]:");
                matrix[i][j] = in.nextInt(); 
            }
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");  
            }
            System.out.println();
        }
    }
}
