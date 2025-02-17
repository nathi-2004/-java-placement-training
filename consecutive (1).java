class consecutive
{
    public static void main(String[] args) {
        int c = 0;
        int prev = 0; 
        int arr[] = {1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0};

       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                c++; 
            } else {
                prev = Math.max(prev, c); 
                c = 0; 
            }
        }prev = Math.max(prev, c);
    

         System.out.println( prev);
    }
}
