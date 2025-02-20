import java.util.*;

class Main {

    String name;
    int regno;

    void get(String n, int r) {
        name = n;
        regno = r;
    }

    void display() {
        System.out.println(name);
        System.out.println(regno);
    }

    public static void main(String args[]) {
        Main student1 = new Main();
        Main student2 = new Main();
        Main student3 = new Main();
        Main student4 = new Main();
        Main student5 = new Main();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter name of student 1:");
        String name1 = in.nextLine();
        System.out.println("Enter registration number of student 1:");
        int regno1 = in.nextInt();
        in.nextLine();  
        student1.get(name1, regno1);

        System.out.println("Enter name of student 2:");
        String name2 = in.nextLine();
        System.out.println("Enter registration number of student 2:");
        int regno2 = in.nextInt();
        in.nextLine();  
        student2.get(name2, regno2);

        System.out.println("Enter name of student 3:");
        String name3 = in.nextLine();
        System.out.println("Enter registration number of student 3:");
        int regno3 = in.nextInt();
        in.nextLine();  
        student3.get(name3, regno3);

        System.out.println("Enter name of student 4:");
        String name4 = in.nextLine();
        System.out.println("Enter registration number of student 4:");
        int regno4 = in.nextInt();
        in.nextLine();  
        student4.get(name4, regno4);

        System.out.println("Enter name of student 5:");
        String name5 = in.nextLine();
        System.out.println("Enter registration number of student 5:");
        int regno5 = in.nextInt();
        in.nextLine();  
        student5.get(name5, regno5);

        System.out.println("\nDetails of student 1:");
        student1.display();
        
        System.out.println("\nDetails of student 2:");
        student2.display();
        
        System.out.println("\nDetails of student 3:");
        student3.display();
        
        System.out.println("\nDetails of student 4:");
        student4.display();
        
        System.out.println("\nDetails of student 5:");
        student5.display();

         
    }
}
