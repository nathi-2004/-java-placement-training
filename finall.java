class finall {
    static class InnerClass {
        static void abc() {
            final int q = 10;
            System.out.println(q);
        }
    }
  
    public static void main(String[] args) {
        
        finall.InnerClass.abc(); 
    }
}
