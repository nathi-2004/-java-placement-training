interface a1 {
    static void test1() {
        System.out.println("Static method in a1");
    }

    default void test2() {
        System.out.println("default method in a1");
    }

    abstract void test3();
}

interface a2 {
    static void test1() {
        System.out.println("Static method in a2");
    }

    default void test2() {
        System.out.println("default method in a2");
    }

    abstract void test3();
}

class Main implements a1, a2 {

    @Override
    public void test3() {
        System.out.println("Implemented test3 method in Main");
    }

    @Override
    public void test2() {
        a1.super.test2();  
    }

    public static void main(String args[]) {
        Main obj = new Main();
        obj.test2();   
        a1.test1();    
        a2.test1();    
        obj.test3();  
    }
}
