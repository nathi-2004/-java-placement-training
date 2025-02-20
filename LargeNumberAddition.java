public class LargeNumberAddition {
    public static void main(String[] args) {
        String num1 = "99967879809898095434265980989875676879";
        String num2 = "56866443788986563456779898099899899043";

        int len1 = num1.length();
        int len2 = num2.length();
        int carry = 0;
        String result = "";

        while (len1 < len2) {
            num1 = "0" + num1;
            len1++;
        }
        while (len2 < len1) {
            num2 = "0" + num2;
            len2++;
        }

        for (int i = len1 - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            int digit2 = num2.charAt(i) - '0';
            int sum = digit1 + digit2 + carry;

            carry = sum / 10;
            result = (sum % 10) + result;
        }

        if (carry > 0) {
            result = carry + result;
        }

        System.out.println("Sum: " + result);
    }
}
