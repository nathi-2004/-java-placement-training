/*class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    Child() {
        // Call to Parent class constructor
        super();
        System.out.println("Child class constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
*/
/*class Parent {
    void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {
    void display() {
        // Call the Parent class's display method
        super.display();
        System.out.println("Child class display method");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}*/
class Parent {
    int num = 100;
}

class Child extends Parent {
    int num = 200;

    void display() {
        // Accessing Parent class field
        System.out.println("Parent class num: " + super.num);
        System.out.println("Child class num: " + num);
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}

