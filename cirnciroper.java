class cirnciroper
{
    public static void main(String args[])
    {
        int a=50;
        int b=30;
        int c=10;
        //using relational operator
       System.out.println(a==b);
       System.out.println(a!=b);
       System.out.println(a>=b);
       System.out.println(a<=b);
       System.out.println(a>b);
       System.out.println(a<b);
       // using shortcircuit operator
       if((a>b)&&(a>c))
       {
           System.out.println("a is greatest");
       }
       // using non circuit operator
       if(a>b||a>c)
       {
            System.out.println("a is greatest");
       }
}
}