class Super{
    static void display()
    {
        System.out.println("in super class");
        }
}
class Sub extends Super{
    static void display(){
        System.out.println("in sub");
    }
}
class Main{
    public static void main(String args[]){
        Super obj1=new Sub();
        obj1.display();
        Sub obj2=new Sub();
        obj2.display();
          
    }
}
