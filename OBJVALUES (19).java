
class Supermost {
    private  void display() {
        System.out.println("supermost class");
    }
}

class Super extends Supermost {
    protected void display() {
        System.out.println("super class");
    }
}

class subclass extends Supermost {
    void display() {
        System.out.println("subclass");
    }
}

class Main {
    public static void main(String args[]) {
        Supermost obj = new subclass();
        obj.display(); 
    }
}