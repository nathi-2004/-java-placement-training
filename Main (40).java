class Sum{
    private int a,b;
    public int get_a()
    {
        return a;
    }
     public int get_b()
    {
        return b;
    }
}
    class Main extends Sum{
        int c;
        public void display(){
            c=get_a()+get_b();
            System.out.println(c);
        }
         public static void main(String[] args) {
        Main obj = new Main();
        obj.display();
        
    }}
/*class Sum {
    private int a, b;

    public int get_a() {
        return a;
    }

    public int get_b() {
        return b;
    }

    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Main extends Sum {
    int c;

    public Main(int a, int b) {
        super(a, b);
    }

    public void display() {
        c = get_a() + get_b();
        System.out.println(c);
    }

    public static void main(String[] args) {
        Main obj = new Main(5, 10);
        obj.display();
    }
}*/
