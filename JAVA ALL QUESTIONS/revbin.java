import java.util.Scanner;

class revbin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int rev = 0;

        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;  
            rev = rev * 10 + digit;  
            temp = temp / 10;  
        }

        int binary = 0, place = 1;
        temp = num;
        while (temp > 0) {  
            int d = temp % 2;  
            binary = binary + d * place;  
            place = place * 10;
            temp = temp / 2;
        }

        System.out.println("Reversed Number: " + rev);
        System.out.println("Binary Representation: " + binary);
    }
}
