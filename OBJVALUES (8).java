
    import java.util.*;
class Add{
    private int a,b,c;
    public void set()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a");
        a=in.nextInt();
        System.out.println("Enter b");
        b=in.nextInt();
    }
    public void sum()
    {
        c=a+b;
    }
    public void get()
    {
        System.out.println("sum"+c);
    }
}
class OBJVALUES{
    public static void main(String args[])
    
    
    {
        Add d=new Add();
        d.set();
        d.sum();
        d.get();
    }
}