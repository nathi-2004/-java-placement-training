
import java.util.*;
class Add{
    private int  a,b,c;
    private void get()
    {
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
         
    
    }
    public void sum()
    {
        get();
        c=a+b;
        System.out.println(c);
    }
}
class Main{
    public static void main (String[] args) {
       Add obj=new Add();
       obj.sum();
  
    }
}
