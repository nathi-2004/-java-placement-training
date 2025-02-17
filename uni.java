class uni{
    public static void main(String args[])
    {
        int a[]={3,2,3,1,2,9};
       
        
       
        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            
           
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    found = true;
                    break;
                }
            }
            
            
            if (!found) {
                int count = 1;
                for (int k = i + 1; k < a.length; k++) {
                    if (a[i] == a[k]) {
                        count++;
                    }
                }
                
                System.out.println(a[i] + ": " + count);
            }
        }
    }
}
   

    

