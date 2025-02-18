class home{
    public static void main(String[] args) {
         int a[] = new int[10];
        int Count = 0;
int num=112233;
        while (num > 0) {
            int digit = num % 10; 
            if (a[digit] == 0) {
                Count++;
            }
            a[digit] = 1;
            num /= 10;
        }

        System.out.println(Count); 
    }
}
