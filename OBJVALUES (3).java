import java.util.*;

class OBJVALUES {

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
        OBJVALUES[] students = new OBJVALUES[5];  
       
        for (int i = 0; i < 5; i++) {
            students[i] = new OBJVALUES(); 
        }

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name of student: ");
            String name = in.nextLine();
            System.out.println("Enter registration number of student: ");
            int regno = in.nextInt();
            in.nextLine(); 
            students[i].get(name, regno);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Details of student: ");
            students[i].display();
        }

        
    }
}
