
   
import java.util.*;
class Add{
    private int  a,b,c;
    private void get()
    {
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
         c=a+b;
        System.out.println(c);
    
    }
    public void sum()
    {
        get();
    }
}
class OBJVALUES{
    public static void main (String[] args) {
       Add obj=new Add();
       obj.sum();
  
    }
}