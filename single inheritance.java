class ini{
    void add(int a)
    {
       
        int sum=a+a;
        System.out.println(a);
    }
}
class Main extends ini{
    void sub()
    {
       
        int b=12345;
        System.out.println(b);
    }

public static void main(String args[]){
    Main c=new Main();
    c.add(3);
    c.sub();
}
}