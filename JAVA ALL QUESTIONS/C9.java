import java.util.*;
class C9 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Enter the salary: ");
        double salary = in.nextDouble();

        System.out.print("Enter the Performance appraisal rating: ");
        double rating = in.nextDouble();

        if (salary <= 0 || rating < 1 || rating > 5) {
            System.out.println("Invalid Input");
        } else {
            double increment = 0;
            if (rating >= 1 && rating <= 3) {
                increment = salary * 0.10;
            } else if (rating >= 3.1 && rating <= 4) {
                increment = salary * 0.25;
            } else if (rating >= 4.1 && rating <= 5) {
                increment = salary * 0.30;
            }
            double incrementedSalary = salary + increment;
            System.out.println(incrementedSalary);
        }
    }
}
