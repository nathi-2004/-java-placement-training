
class pattern5 {
    public static void main(String args[]) {
        int n = 5;

        for (int i = 0; i < n; i++, System.out.println()) {
            for (int j = 0; j < n - i ; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }

            for (int k = 1; k < i + 1; k++) {
                System.out.print("*");
            }

           
        }

        for (int i = 1; i < n; i++,System.out.println()) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < n - i; k++) {
                System.out.print("*");
            }

            for (int k = 1; k < n - i; k++) {
                System.out.print("*");
            }

            
        }
    }
}

