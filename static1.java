class static1
{ 
    static void calculate()
{
        add(2);
        subtract(3,4);
        multiply(8);
        division(10,2);
}
   static  void add(int a)
    {
    
       int  result=a+a;
        System.out.println("Addition"+result);
    }
    static void subtract(int l,int b)
    {     int result=l-b;
        System.out.println("subtraction"+result);
        
    }
    static void multiply(int c)
    {
    
      int  result=c*c;
        System.out.println("Multiplication"+result);
    }
     static void division(int d,int e)
    { int result=d/e;
        System.out.println("Division"+result);
        
    }
    

    public static void main(String args[])
{
    calculate();
    
   
  
}
}