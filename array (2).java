class array{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        for(int i:arr)
        {
           i++;
           System.out.println(i);
        }
        for(int i=0;i<arr.length;i++)
        {
             System.out.print(arr[i]);
        }
    }
}