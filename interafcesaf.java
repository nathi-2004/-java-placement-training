interface a1 {
    static void test1() {
        System.out.println("Static method in a1");
    }
    default void test2(){
        System.out.println("default method");
    }
    abstract void test3();
       
    
}
interface a2  extends  a1{
    
    default void test2(){
        System.out.println("default method");
    }
    abstract void test3();
         
   
}

class Main implements a2 {
 
  public   void test3() {
        System.out.println("nathi");
    }

    public static void main(String args[]) {
       Main obj = new Main();
        obj.test2(); 
        a1.test1();
         obj.test3(); 
    }
}