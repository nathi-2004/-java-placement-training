class one{
    void display()
    {
        System.out.println("i am nathi");
    }
    
}
class two extends one{
    void t(){
        System.out.println("i am iniya");
    }
}
class multilevel extends two{
    void f(){
        System.out.println(" i am iniyan");
    }
    public static void main(String args[]){
        multilevel cd=new multilevel();
        cd.display();
        cd.t();
        cd.f();
    }
}
