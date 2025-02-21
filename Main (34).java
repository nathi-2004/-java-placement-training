class Main {
    static class Inner {
        static int n = 5;

        static void display() {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Main.Inner.display();
    }
}
