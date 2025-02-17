class reverse{
   
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5, 6};
        
       
        int temp1 = a[3];
        a[3] = a[5];
        a[5] = temp1;
        
        int temp2 = a[4];
        a[4] = a[4]; 
        
       
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
