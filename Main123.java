import java.util.Scanner;

class Main123{
    public static void main(String args[]) {
        
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.nextLine();

       char[] arr = input.toCharArray();

        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
               
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

      
        String sortedString = new String(arr);

       
        System.out.println("Sorted string: " + sortedString);
    }
}
