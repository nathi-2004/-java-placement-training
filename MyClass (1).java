class A {
    static class B {
        static void display() {
            System.out.print("example");
        }
    }
}

class MyClass {
    public static void main(String args[]) {
        A.B.display();  
    }
}
