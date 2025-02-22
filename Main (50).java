class Super{
    int x;
    public Super()
    {
        x=10;
        
    }
    void display()
    {
        System.out.println(x);
    }
}
class Sub extends Super
{
    int x;
    public Sub()
    {
        super();
        x=100;
    }
    void display()
    {
        System.out.println(x);
        System.out.println(super.x);
      super.display();
    }
}
class Main{
    public static void main (String[] args) {
    
        Super obj=new Sub();
        obj.display();
}
}