class staticusinfffpn { 
    static void calculate() {
        factorial(5);
        fibonacci(5);
        primenumber(1, 20);
    }

    static void factorial(int a) { 
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + a + ": " + fact);
    }

    static void fibonacci(int n) {    
        int n1 = 0, n2 = 1, n3;
        System.out.print("Fibonacci Series: " + n1 + " " + n2); 
        for (int i = 2; i < n; i++) { 
            n3 = n1 + n2; 
            System.out.print(" " + n3);
            n1 = n2; 
            n2 = n3;
        }
        System.out.println();
    }

    static void primenumber(int start, int end) {
        System.out.print("Prime numbers between " + start + " and " + end + ": ");
        for (int num = start; num <= end; num++) { 
            if (num < 2)
            continue; 
            
            int count = 0; 
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) { 
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        calculate();
    }
}
