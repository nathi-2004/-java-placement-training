 class Main {
    public static void main(String[] args) {
      
        int[][] matrix = {
            {3, 2, 1},
            {4, 9, 6},
            {7, 5, 8} };
       int c[]=new int[rows*cols];
       int k=0;
       for(int i=0;i<rows;i++)
      {
          for(int j=0;j<cols;j++)
          {
              c[k]=matrix[i][j];
              k=k+1;
          }
      }
          for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
            {
                if( if (matrix[i][j] > matrix[k][l]))
                int temp = matrix[i][j];
                 matrix[i][j] = matrix[k][l];
             matrix[k][l] = temp;
                        }
                    }
                }
            
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        }
    }

    

