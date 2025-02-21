
import java.util.*;
class Main{
    static class abc{
       
        static void area(){
             Scanner in=new Scanner(System.in);
           
              int a=in.nextInt();
            int square=a*a;
            System.out.println(square);
        }
        static void area(int r,float pi){
         
            float circle= pi *r*r;
            System.out.println(circle);
            
        }
        static void area(int a,int b)
        {
            int rectangle=a*b;
            System.out.println(rectangle);
        }
        
    }
    public static void main(String args[])
    {
        Main.abc.area();
        Main.abc.area(5,3.14f);
        Main.abc.area(1,2);
    }
}
