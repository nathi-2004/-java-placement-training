class Shape
{   double  l;
double  b;
Shape(double l,double b){
        this.l=l;
        this.b=b;
        
    }
    void area(){
        double  res=l*b;
        System.out.println(res);
    }
}
class RectangleN extends Shape
{  
    double l;
    double b;
    
RectangleN(double  l,double  b){
       super(l,b);
       this.l=l;
       this.b=b;
        
    }
    void area(){
        double  res=l*b;
        System.out.println(res);
    }
    public static void main(String args[]){
        RectangleN ab=new RectangleN(12.0,13.0);
       
        ab.area();
        
    }
}
