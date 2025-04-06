import java.util.*;
class SORT {
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        StringBuilder s = toBinary(a);
        int i = in.nextInt();
        int j = in.nextInt();

        System.out.println(s);

        char temp = s.charAt(i - 1);
        s.setCharAt(i - 1, s.charAt(j - 1));
        s.setCharAt(j - 1, temp);

        System.out.println(s);
    }

    public static StringBuilder toBinary(int a) {
        StringBuilder s1 = new StringBuilder();
        while (a > 0) {
            int rem = a % 2;
            s1.append(rem);
            a = a / 2;
        }
        s1.reverse();

        String bins = String.format("%32s", s1.toString()).replace(' ', '0');
        return new StringBuilder(bins);
    }
}
