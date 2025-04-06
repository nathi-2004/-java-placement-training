import java.util.Scanner;

public class TCS210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of interior walls: ");
        int interiorWalls = scanner.nextInt();

        System.out.print("Enter the number of exterior walls: ");
        int exteriorWalls = scanner.nextInt();

        double interiorCost = 0;
        double exteriorCost = 0;

        if (interiorWalls > 0) {
            for (int i = 0; i < interiorWalls; i++) {
              
                double area = scanner.nextDouble();
 exteriorCost += area * 18;
                
            }
        }

        if (exteriorWalls > 0) {
            for (int i = 0; i < exteriorWalls; i++) {
                
                double area = scanner.nextDouble();

                exteriorCost += area * 12;
            }
        }

        double totalCost = interiorCost + exteriorCost;

        System.out.println("Total estimated Cost: " + totalCost + " INR");

        
   
}
}