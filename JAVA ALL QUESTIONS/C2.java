import java.util.*;
class C2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the no of pizzas bought: ");
        int pizzas = in.nextInt();

        System.out.print("Enter the no of puffs bought: ");
        int puffs = in.nextInt();

        System.out.print("Enter the no of cool drinks bought: ");
        int coolDrinks = in.nextInt();

        int totalPrice = (pizzas * 100) + (puffs * 20) + (coolDrinks * 10);

        System.out.println("Bill Details");
        System.out.println("No of pizzas: " + pizzas);
        System.out.println("No of puffs: " + puffs);
        System.out.println("No of cooldrinks: " + coolDrinks);
        System.out.println("Total price=" + totalPrice);
        System.out.println("ENJOY THE SHOW!!!");
    }
}
