class Shape {
    int l, b;
    Shape(int l, int b) {
        this.l = l;
        this.b = b;
    }
    void area() {
        System.out.println("Area of Shape: " + (l * b));
    }
}

class Rectangle extends Shape {
 
    Rectangle(int l, int b) {
        super(l, b);
    }

  
    void area() {
        System.out.println("Area of Rectangle: " + (l * b));
    }

    public static void main(String args[]) {
        Rectangle abc = new Rectangle(2, 4);
        abc.area();  
    }
}
