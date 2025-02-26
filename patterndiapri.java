
class NumberPattern2 {

    public void printPattern2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               
                if ((i == 0 && j == 0) || (i == 0 && j == 2) || (i == 0 && j == 4)) {
                    System.out.print((j == 0 ? "5 " : j == 2 ? "2 " : "1 "));
                } else if ((i == 1 && j == 1) || (i == 1 && j == 3)) {
                    System.out.print((j == 1 ? "4 " : "2 "));
                } else if ((i == 2 && j == 0) || (i == 2 && j == 2) || (i == 2 && j == 4)) {
                    System.out.print((j == 0 ? "3 " : j == 2 ? "3 " : "5 "));
                } else if ((i == 3 && j == 1) || (i == 3 && j == 3)) {
                    System.out.print((j == 1 ? "2 " : "4 "));
                } else if ((i == 4 && j == 0) || (i == 4 && j == 2) || (i == 4 && j == 4)) {
                    System.out.print((j == 0 ? "1 " : j == 2 ? "7 " : "5 "));
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
    }
}


public class patterndiapri {
    public static void main(String[] args) {
      
        NumberPattern2 np = new NumberPattern2();

        np.printPattern2();
    }
}
