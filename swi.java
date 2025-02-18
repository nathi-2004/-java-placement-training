 class swi{
    public static void main(String[] args) {
       
        String input = "abc abc abc";
        String[] a = input.split(" ");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            switch (a[i]) {
                case "abc":
                    count++;
                    break;
                default:
                  
                    break;
            }
        }
        
       
        System.out.println(count);  
    }
}
