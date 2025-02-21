class Copy
{
     String name;
     int id;
     Copy(String n,int i)
     {
         this.name=n;
         this.id=i;
     }
     Copy(Copy s)
     {
         name=s.name;
         id=s.id;
     }
     void display()
     {
         System.out.println(name+" "+id);
     }
}class Main{
    public static void main(String args[])
    
    {
        Copy a=new Copy("nathi",133);
Copy b=new Copy(a);
a.display();
b.display();
    }
}