import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = in.nextInt();
        int temp = decimal;
        String binary = "";

        while (temp > 0) {
            int rem = temp % 2;
            binary = rem + binary;
            temp = temp / 2;
        }

        System.out.println("Binary: " + binary);
        temp = decimal;
         String octal= "";

        while (temp > 0) {
            int rem = temp % 8;
            octal = rem + octal;
            temp = temp / 8;
        }

        System.out.println("octal: " + octal);
         temp = decimal;
         String hex= "";

        while (temp > 0) {
            int rem = temp % 16;
            hex = rem + hex;
            temp = temp /16;
        }

        System.out.println("hex: " + hex);
       
       
       
    }
}
