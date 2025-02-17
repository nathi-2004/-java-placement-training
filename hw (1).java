class hw {
    public static void main(String args[]) {
        int x = 7; 
        int n = 5; 
        int sum = 0;
        int num = 0;

        for (int i = 1; i <= n; i++) {
            num = num * 10 + x; 
            System.out.println(num);
            sum += num; 
        }

        System.out.println("Sum: " + sum);
    }
}
