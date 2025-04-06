import java.util.Scanner;

public class TCS25 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (s[i].equals(s[j])) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                System.out.println(s[i]); 
                return ;
            }
        }

        System.out.println("All are even"); 
        
    }
}











