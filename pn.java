
import java.util.*;
class pn{
    public static void main (String[] args) {
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }if(count==2)
        {
            System.out.println(n+"is a prime number");
            
        }
        else{
            System.out.println(n+"is non prime number");
        }
        
}

}
}