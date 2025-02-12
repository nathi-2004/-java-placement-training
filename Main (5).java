import java.util.*;
class Main {
    public static void main (String[] args) {
        for (int n = 1; n <= 100; n++) {
            int count = 0;
            int i = 1;
            do {
                if (n % i == 0) {
                    count++;
                }
                i++;
            } while (i <= n);
            if (count == 2) {
                System.out.println(n + " is a prime number");
            }
        }
    }
}
