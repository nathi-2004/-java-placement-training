class SUMSPLIT
{
    public static void main(String[] args) {
        String a= "8,10,1";  
         String numbers[]= a.split(",");
         int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);  
            
        }
        System.out.println(sum);
        int digit = 0;
        int temp = sum; 
        
        for (int i = temp; i > 0; i /= 10) {
            digit+= i % 10;  
        }
        
        
        System.out.println(digit);
    }
}
