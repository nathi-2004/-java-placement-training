
class LeftAngleTriangle {
    void tri() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class RightAngleTriangle {
    void tri() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Main {
    public static void main(String args[]) {
       
        LeftAngleTriangle obj1 = new LeftAngleTriangle();
        obj1.tri();
         RightAngleTriangle obj = new RightAngleTriangle();
        obj.tri();
    }
}
