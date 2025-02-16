class   revodd
{
    public static void main(String args[]) {
        int n = 123456;
        int sum = 0;
        int value = 1; 
        int digit;

        while (n > 0) {
            digit = n % 10; 
            n = n / 10;   
            if (digit % 2!= 0) { 
                System.out.println(digit);
                sum = sum + (digit * value); 
                value *= 10; 
            }
        }

        System.out.println("Final Sum (even digits as a number): " + sum);
    }
}
