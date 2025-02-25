public class InterfaceClass{
    public static void main(String args[])
    {
        interfaceEx obj=new interfaceEx();
        obj.test1();
    }
}
    interface a1{
        void test1();
    }
    interface a2{
        void test1();
    }
    class interfaceEx implements a1,a2{
        public void test1(){
            System.out.println("nathi");
    }
    }