import java.util.*;
 class TCS7{
    public static void main(String[] args) { 
Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();     
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] =in.nextInt();
        }

        
        for (int i = 0; i < arr.length; i++) {
            int count = 0;  
          
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

     
            if (count == 1) {
                System.out.println("non repeating element"+arr[i]);
                break;
            }
        }
    }
}

