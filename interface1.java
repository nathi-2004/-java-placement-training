abstract class OuterAbstract {
    abstract void outerMethod();


    static abstract class InnerAbstract {
        abstract void innerMethod();
    }
}


class TotalClass extends OuterAbstract.InnerAbstract {
    @Override
    void innerMethod() {
        System.out.println("Implemented abstract method from OuterAbstract");
    }


   /* class InnerTotal extends InnerAbstract {
        @Override
        void innerMethod() {
            System.out.println("Implemented abstract method from InnerAbstract");
        }
    */
}

public class interface1{
    public static void main(String[] args) {
        TotalClass outerObj = new TotalClass();
        outerObj.innerMethod();

        //TotalClass.InnerTotal innerObj = outerObj.new InnerTotal();
       // innerObj.innerMethod();
    }
}