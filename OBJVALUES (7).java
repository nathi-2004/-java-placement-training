class  book {
    String title;
    String author;
    int price;
book(String title,String author,int price)
{
    this.title=title;
    this.author=author;
    this.price=price;
}
     void display(){
         System.out.println("BOOK TITLE : "+title);
         System.out.println("AUTHOR : "+author);
         System.out.println("Book PRICE : "+price);
     }
}
class OBJVALUES{
    public static void main (String[] args) {
    {
        book  bookclass =new book("u can win","yashwant",500);
         bookclass.display();
        
    }
}
}