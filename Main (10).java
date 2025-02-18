class Main {
    public static void main(String[] args) {
        int a[] = {5, 1, 3};
        int b[] = {9, 7, 7, 7};
        int carry = 0;
        int sum = 0;
        int maxLength = Math.max(a.length, b.length);
        int[] c = new int[maxLength + 1]; 
        int i = 0;
        while (i < maxLength || carry != 0) {
            sum = carry; 
            if (i < a.length) sum += a[i];
            if (i < b.length) sum += b[i];

            c[i] = sum % 10;  
            carry = sum / 10; 
            i++;
        }

       
        System.out.print("Result: ");
        for (int j = 0; j < c.length-1; j++) {
            System.out.print(c[j]);
        }
    }
}
