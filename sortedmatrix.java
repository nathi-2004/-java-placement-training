class sortedmatrix{
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 2, 1},
            {4, 9, 6},
            {7, 5, 8}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int c[] = new int[rows * cols];
        int k = 0;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                c[k++] = matrix[i][j];
            }
        }

       
        
       
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - 1 - i; j++) {
                if (c[j] > c[j + 1]) {
                  
                    int temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }

       
        k = 0; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = c[k++];
            }
        }

        
        System.out.println("Sorted Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}