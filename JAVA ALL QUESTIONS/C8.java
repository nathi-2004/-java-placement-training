import java.util.*;
 class C8 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (num < 0) {
            System.out.println("Invalid Input");
        } else {
            int rev = 0;
            int temp = num;
            while (temp != 0) {
                int rem= temp% 10;
                rev = rev* 10 + rem;
                temp/= 10;
            }
            if (num== rev) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }
    }
}
