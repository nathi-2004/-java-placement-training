class Main {
    
    
    static int Count = 0;
    
   
     Main() {
        Count++;
    }
    
    public static void main(String[] args) {
      
        Main obj1 = new Main();
        Main obj2 = new Main();
        Main obj3 = new Main();

      
        System.out.println("Total number of objects created: " + Count);
    }
}
