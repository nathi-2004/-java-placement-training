
import java.util.*;
class Add{
    public int a,b,c;
    
 
  public void sum()
  {
      System.out.println("sum"+c);
  }

    public static void main (String[] args) {
        Add obj1=new Add();
        Scanner in=new Scanner(System.in);
        obj1.a=in.nextInt();
         obj1.b=in.nextInt();
          obj1.c=obj1.a+obj1.b;
        
        obj1.sum();
   
}
}
  