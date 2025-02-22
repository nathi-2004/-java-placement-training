class Supermost {
    private void display1() {
        System.out.println("supermost class");
    }
    public void get()
    {
        display1();
    }
}

class Super extends Supermost {
    protected void display2() {
        System.out.println("super class");
    }
}

class subclass extends Supermost {
    void display3() {
        System.out.println("subclass");
    }
}

class Main {
    public static void main(String args[]) {
        Supermost obj = new subclass();
        obj.get();
        Super obj2=new subclass();
        obj2.display2();
        
        subclass obj1=new subclass();
        obj1.display3();
    }
}
