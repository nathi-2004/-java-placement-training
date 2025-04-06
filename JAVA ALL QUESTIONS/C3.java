import java.util.Scanner;
class C3{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
 System.out.print("Enter the digits: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
 char s1 = (char) num1;
        char s2 = (char) num2;
        char s3 = (char) num3;
        char s4 = (char) num4;

        System.out.println(num1 + "-" + s1);
        System.out.println(num2 + "-" + s2);
        System.out.println(num3 + "-" + s3);
        System.out.println(num4 + "-" + s4);
    }
}
