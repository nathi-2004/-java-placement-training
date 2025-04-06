 class m{
    public static void main(String[] args) {
        int[] arr = {9,4,9,6,7,4}; 
       
        for (int i = 0; i < arr.length-1; i++) {
            int count = 0;  
          
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

       
            if (count == 1) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

