import java.util.*;
class Calculator{
    Scanner in=new Scanner(System.in);
    void add()
    {
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        
       System.out.println(a+b); 
    }
     int sub()
    
    {
        int d,e;
        d=in.nextInt();
        e=in.nextLnt();
       
        return (a-b);
       
    }
    void mutli(int a,int b)
    { 
      System.out.println(a*b);
        
    }
    int div(int f,int g)
    {
       
        return (f/g);
    }

    
}
class  OBJVALUES{
    public static void main(String args[])
    {
        Calculator obj=new Calculator();
        obj.add();
      System.out.println(obj.sub());
      obj.mutli(2,3);
        System.out.println(obj.multi());
      
     
     System.out.println(div);
      
    }
}