import java.util.Scanner;

public class palindrome
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); 
        
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            
           
            while (true) {
                num++;  
                
                int temp = num, rev = 0;
                
                
                while (temp > 0) {
                    rev = rev * 10 + temp % 10;
                    temp /= 10;
                }
                
               
                if (rev == num) {
                    System.out.println(num);
                    break;
                }
            }
        }
        
      
    }
}
