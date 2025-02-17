
import java.util.Arrays;
class max1{
    public static void main(String args[])
    {
        int arr[]={6,8,2,3,4};
        int max=arr[0];
        Arrays.sort(arr);
     System.out.println(Arrays.toString(arr));
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>max)
            max=arr[i];
            
        }
        System.out.println(max);
    }
}
        
