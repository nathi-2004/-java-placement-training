class insert{
    public static void main (String[] args) {
        
        int[] arr = new int[5]; 
         int index=2;
         int value=90;
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
for(int i=arr.length-1;i>index;i--)
{
    arr[i]=arr[i-1];
}
    
    arr[index]=value;
     for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    
    }
}
        