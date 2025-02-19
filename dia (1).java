class dia{
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} };

        int rows = matrix.length;
        int cols = matrix[0].length;
        int upperTriangleSum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                upperTriangleSum += matrix[i][j];
            }
        }
        int lowerTriangleSum = 0;
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                lowerTriangleSum += matrix[i][j];
            }
        }
        matrix[0][0] = upperTriangleSum;  
       
        matrix[2][2] = lowerTriangleSum;  
        System.out.println("Updated Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
