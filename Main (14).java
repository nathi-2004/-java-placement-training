 class Main{
    public static void main(String[] args) {
        char[] a = "abc abc abc".toCharArray();
        int count = 0;
        for (int i = 0; i < a.length - 2; i++) {
         
            if (a[i] == 'a' && a[i + 1] == 'b' && a[i + 2] == 'c') {
                count++;  
                i += 2;   
            }
        }
        System.out.println(count);
}
}
