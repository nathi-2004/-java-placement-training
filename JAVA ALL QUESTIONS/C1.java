import java.util.Scanner;
class C1{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
System.out.print("Enter the no of liters to fill the tank: ");
        double liters = in.nextDouble();
        System.out.print("Enter the distance covered: ");
        double distance = in.nextDouble();
if (liters <= 0 || distance <= 0) {
            if (liters <= 0) {
                System.out.println(liters + " is an Invalid Input");
            } else {
                System.out.println(distance + " is an Invalid Input");
            }
        } else {
            double litersPer100km = (liters / distance) * 100;
            double miles = distance * 0.6214;
            double gallons = liters * 0.2642;
            double milesPerGallon = miles / gallons;

            System.out.printf("Liters/100KM: %.2f%n", litersPer100km);
            System.out.printf("Miles/gallons: %.2f%n", milesPerGallon);
        }
    }
}
