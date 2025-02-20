import java.util.*;

class Mainnew{
    
    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        
        while (num >0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        
        return originalNum == reversedNum;
    }

    static int reverse(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int num1 = in.nextInt();
        
        System.out.println("Enter the second number:");
        int num2 = in.nextInt();

        num1 += reverse(num1);
        num2 += reverse(num2);
        
        System.out.println("Output after incrementing by reverse:");
        System.out.println(num1);
        System.out.println(num2);
        
        if (isPalindrome(num1)) {
            System.out.println(num1 + " is a palindrome.");
        } else {
            System.out.println(num1 + " is not a palindrome.");
        }

        if (isPalindrome(num2)) {
            System.out.println(num2 + " is a palindrome.");
        } else {
            System.out.println(num2 + " is not a palindrome.");
        }
        
       
    }
}
