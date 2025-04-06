import java.util.Scanner;
 class TCS6{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

     
        System.out.print("Enter the number of elements (N): ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
   
        int pos = 0; 
      
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[pos] = arr[i]; 
                pos++;
            }
        }

       
        while (pos < n) {
            arr[pos] = 0;
            pos++;
        }

       
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
