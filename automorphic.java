import java.util.Scanner;

public class automorphic{
    public static void main(String args[]) {
        for (int n = 1; n <= 1000; n++){
            int temp = n, check = 1, digit = 0;
            while (temp > 0) {
                temp = temp / 10;
                digit++;
            }
            for (int i = 1; i <= digit; i++) {
                check = check * 10;
            }
            temp = (n * n) % check;
            if (n == temp) {
                System.out.println(n);
            }
        }
    }
}

