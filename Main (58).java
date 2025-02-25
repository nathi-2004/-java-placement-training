interface a1 {
    static void test1() {
        System.out.println("Static method in a1");
    }
}
interface a2 {
   void test1();
}

class Main implements a2 {
    public void test1() {
        System.out.println("nathi");
    }

    public static void main(String args[]) {
       Main obj = new Main();
        obj.test1(); 
        a1.test1();
    }
}
