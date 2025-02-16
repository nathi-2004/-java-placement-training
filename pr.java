class pr {
    public static void main(String args[]) {
        int n = 123456;
        int sum = 0;
        int digit;

        while (n > 0) {
            digit = n % 10;  
            n = n / 10;      
            
            if (isPrime(digit)) {
                System.out.println(digit); 
                sum += digit;
            }
        }

        System.out.println("Sum of prime digits: " + sum);
    }

   
    static boolean isPrime(int digit) {
        return (digit == 2 || digit == 3 || digit == 5 || digit == 7);
    }
}
