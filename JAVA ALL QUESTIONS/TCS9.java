class TCS9 {
    public static void main(String args[]) {
        int a[] = {-7,1,5,2,-4,3,0};
        boolean equals = false;

        for (int i = 0; i < a.length; i++) { 
            int lsum = 0, rsum = 0;
            for (int j = 0; j < i; j++) {
                lsum =lsum+a[j];
            }
            for (int k = i + 1; k < a.length; k++) {
                rsum=rsum+a[k];
            }
            if (lsum == rsum) {
                System.out.println(i);
                equals = true;
                break;
            }
        }

        if (!equals) {
            System.out.println("-1");
        }
    }
}

