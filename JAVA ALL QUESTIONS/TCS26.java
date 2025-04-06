import java.util.Scanner;
 class TCS26{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the capacity of the jar: ");
        int capacity = scanner.nextInt();
System.out.print("Enter the minimum number of candies required: ");
        int threshold = scanner.nextInt();
        int candies = capacity;
        while (true) {
            System.out.println("JAR at counter with available number of candies: " + candies);
            System.out.print("Enter the number of candies to purchase (0 to exit): ");
            int numCandies = scanner.nextInt();
            if (numCandies == 0) {
                break;
            }
            if (numCandies > candies) {
                System.out.println("INVALID INPUT");
            } else {
                System.out.println("NUMBER OF CANDIES SOLD : " + numCandies);
                candies -= numCandies;
                System.out.println("NUMBER OF CANDIES LEFT : " + candies);

                if (candies <= threshold) {
                    candies = capacity;
                    System.out.println("JAR refilled. NUMBER OF CANDIES LEFT : " + candies);
                }
            }
        }
    }
}