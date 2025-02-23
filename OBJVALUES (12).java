class OBJVALUES{
    
    
    static int Count = 0;
    
   
      OBJVALUES() {
        Count++;
    }
    
    public static void main(String[] args) {
      
       OBJVALUES a=new OBJVALUES();
        OBJVALUES b=new OBJVALUES();
         OBJVALUES c=new OBJVALUES();
          OBJVALUES d=new OBJVALUES();

      
        System.out.println("Total number of objects created: " + Count);
    }
}