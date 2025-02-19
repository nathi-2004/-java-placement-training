import java.util.*;
class scanner{
    public static void main (String[] args) {
    {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER UR NAME");
         String a=in.nextLine();
         System.out.println("ENTER number");
         int  b=in.nextInt();
         System.out.println("Enter a word:");
        String word = in.next();  
        char firstChar = word.charAt(0);  
        System.out.println("The first character is: " + firstChar);
            int[] d = new int[10];
         for (int i = 0; i < 10; i++) 
         {
              System.out.println("ENTER number");
            d[i] = in.nextInt(); 
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println( d[i]);
        }
    }
        }
    }
          
         
    