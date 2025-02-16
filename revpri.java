class revpri {
    public static void main(String args[]) {
        int n = 123456;
        int sum = 0;
        int digit;
        int value = 1;

        while (n > 0) {
            digit = n % 10;  
            n = n / 10;      
            
            if (isPrime(digit)) {
                System.out.print(digit); 
                sum += (digit * value);  
                value *= 10;              
            }
        }

        System.out.println("\nFinal Sum (Prime Digits as a Number): " + sum);
    }

    static boolean isPrime(int digit) {
        return (digit == 2 || digit == 3 || digit == 5 || digit == 7);
    }
}
