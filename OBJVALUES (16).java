
 import java.util.Scanner;

class Shape {
    protected double area;

    public void cal_area() {
        System.out.println("Area of the shape");
    }
}

class Circle extends Shape {
    private int radius;

    @Override
    public void cal_area() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        radius = in.nextInt();
        area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Square extends Shape {
    private int side;

    @Override
    public void cal_area() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of the square: ");
        side = in.nextInt();
        area = side * side;
        System.out.println("Area of Square: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape;
        shape = new Circle();
        shape.cal_area();
        shape = new Square();
        shape.cal_area();
    }
}