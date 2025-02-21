import java.util.*;
class Calculator{
    void add()
    {
        int a=10;
        int b=20;
        int c=a+b;
       System.out.println(c); 
    }
     int sub()
    
    {
        int d=23;
        int e=45;
        int f=d-e;
        return f;
       
    }
    void mutli(int a,int b)
    { int result=a*b;
      System.out.println(result);
        
    }
    int div(int f,int g)
    {
        int result=f/g;
        return result;
    }

    
}
class  Main{
    public static void main(String args[])
    {
        Calculator obj=new Calculator();
        obj.add();
      int result=obj.sub();
      System.out.println(result);
      obj.mutli(2,3);
     int divi= obj.div(10,5);
     System.out.println(divi);
      
    }
}