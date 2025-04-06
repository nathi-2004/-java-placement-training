public class LONGADD {
    public static void main(String[] args) {
        String a = "111";
        String b = "11";

        int len1 = a.length();
        int len2 = b.length();
        String result = "";
        int carry = 0;

        while (len1 > len2) {
            b = "0" + b;
            len2++;
        }
        while (len1 < len2) {
            a = "0" + a;
            len1++;
        }

        for (int i = len1-1; i >=0; i--) {  
            int digit1 = a.charAt(i) - '0';
            int digit2 = b.charAt(i) - '0';
            int sum = digit1 + digit2 + carry;

            carry = sum / 2;
            result = (sum % 2)+ result;
        }

        if (carry >= 0) {
            result = carry+result;
        }

        System.out.println("Sum: " + result);
    }
}
