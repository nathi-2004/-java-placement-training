abstract class AbstractClass {
  void Abstract
    
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

class MyClass extends AbstractClass {
    void display() {
        System.out.println("Display method in MyClass.");
    }
    
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
        AbstractClass.staticMethod();
    }
}
