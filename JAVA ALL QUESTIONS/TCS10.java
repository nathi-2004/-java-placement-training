import java.util.*;
import java.util.*;
class TCS10 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter N (size of array):");
        int n = in.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter K (number of rotations):");
        int k = in.nextInt();
        in.close();

        k = k % n;

        for (int i = 0; i < k; i++) {
            int temp = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }

        System.out.println("Right rotated array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
