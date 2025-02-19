class transpose {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 2, 1},
            {4, 9, 6},
            {7, 5, 8}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

       
        System.out.println("Original Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

       
        System.out.println("\nTranspose of Matrix:");
        for (int i = 0; i < cols; i++) {  // Iterate over columns
            for (int j = 0; j < rows; j++) {  // Iterate over rows
                System.out.print(matrix[j][i] + " ");  // Swap rows and columns
            }
            System.out.println();
        }
    }
}
