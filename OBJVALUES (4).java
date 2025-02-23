class bookClass
{
    
    String booktitle;
    double bookprice;
    bookClass()
    {
        booktitle="Java Programming";
        bookprice=100.0;
    }
    void display()
    {
        System.out.println("BOOK TILE :"+ booktitle);
         System.out.println("BOOK PRICE :"+ bookprice);
        
    }
}
class OBJVALUES{
    
public static void main(String args[])
    {
    bookClass a = new bookClass();
  
    a.display();
}

}