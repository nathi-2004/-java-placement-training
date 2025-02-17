import java.util.Arrays;
class max3
{
    public static void main(String args[]) {
        int arr[] = {6, 8, 2, 3, 4};
        Arrays.sort(arr);
         System.out.println("Sorted Array: " + Arrays.toString(arr));

        if (arr.length >= 3) {
            
            int thirdMax = arr[arr.length - 2];
            System.out.println( + thirdMax);
        } 
    }
}
