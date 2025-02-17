 class duparr {
    public static void main(String[] args) {
        
        int[] arr = {3,2,3,1,2,9};
        int newLength = arr.length;

        for (int i = 0; i < newLength; i++) {
            for (int j = i + 1; j < newLength; j++) {
                if (arr[i] == arr[j]) {
                    
                    for (int k = j; k < newLength - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                   newLength--;
                    j--; 
                }
            }
        }
        
       
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

     