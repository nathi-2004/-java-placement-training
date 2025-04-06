import java.util.*;
class TCS2{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number of rows (m): ");
        int m = in.nextInt();
        
        System.out.println("Enter number of columns (n): ");
        int n = in.nextInt();
        
        int matrix[][] = new int[m][n];
        System.out.println("Enter matrix elements (0s and 1s): ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int large = 0; 
        int ind = -1;  
        for (int i = 0; i < m; i++) { 
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > large) {

                large = count;
                ind = i;
            }
        }

        System.out.println("Row with maximum 1s: " + ind);
    }
}
