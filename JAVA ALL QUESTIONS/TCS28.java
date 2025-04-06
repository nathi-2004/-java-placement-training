import java.util.*;

class TCS28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the weight of clothes (in grams): ");
        int weight = in.nextInt();

      if (weight < 0 || weight > 7000) {
            System.out.println("INVALID INPUT");
        } else if (weight == 0) {
            System.out.println("Time Estimated: 0 minutes");
        } else if (weight <= 2000) {
            System.out.println("Time Estimated: 25 minutes");
        } else if (weight <= 4000) {
            System.out.println("Time Estimated: 35 minutes");
        } else if (weight <= 7000) {
            System.out.println("Time Estimated: 45 minutes");
        }
    }
}
