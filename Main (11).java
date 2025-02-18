class Main {
    public static void main(String[] args) {
        int a[] = {5, 1, 3};
        int b[] = {9, 7, 7, 7};
        int c[]=new int[a.length+1];
        int carry = 0;
        int num=0;int sum=0;
        
       
        int i = 0;
        while (i <a.length) {
           
            if ( a.length==b.length) 
            {
                int sum =a[i]+b[i]+carry;
                c[i]=sum%10;
                carry=sum/10;
            }
          else if(a.length>b.length) 
          {
              sum=a[i]+carry;
              c[i]=num/10;
              carry=sum/10;
          }
        
          else if(a.length<b.length) 
          {
              sum=a[i]+carry;
              c[i]=num/10;
              carry=sum/10;
          }
        
            i++;
        }
        

       c[i]=carry;
    
        
        for(int j =0;j<=i; j++) {
            System.out.print(c[j]);
        }
     
    }
}

