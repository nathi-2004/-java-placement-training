


import java.util.Scanner;
 class pascal{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = in.nextInt(); 
        int[][] pascal = new int[n][n]; 

       
        for (int i = 0; i < n; i++) {
            pascal[i][0] = 1;
            
            for (int j = 1; j <i+1; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j]; 
            }
        }

       
        for (int i = 0; i < n; i++) {
          
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i+1; j++) {
                System.out.print(pascal[i][j]+ " ");
            }
            System.out.println();
        }

        
    }
}
