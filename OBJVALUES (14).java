class OBJVALUES{
    
  
    static class abc {
        static void area(int a) {
            int square = a * a;
            System.out.println("Area of square: " + square);
        }

        static void area(int r, float pi) {
            float circle = pi * r * r;  
            System.out.println("Area of circle: " + circle);
        }

        static void area(int l, int b) {
            int rectangle = l * b;
            System.out.println("Area of rectangle: " + rectangle);
        }
    }

    public static void main(String args[]) {
        OBJVALUES.abc.area(2);              
        OBJVALUES.abc.area(5, 3.14f);        
       OBJVALUES.abc.area(1, 2);             
    }
}