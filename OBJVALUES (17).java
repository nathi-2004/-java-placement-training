class OBJVALUES{

    private void abc() {
        System.out.println("Private Method ");
    }

    protected void cde() {
        System.out.println("Protected Method ");
    }

    public void fgh() {
        System.out.println("Public Method");
    }

     static void ijk() {
        System.out.println("Static Method ");
    }

    void lmn() {
        System.out.println("Default Methods");
    }
}

class DerivedClass extends OBJVALUES {

   
   private void abc() {
        System.out.println("Private Method ");
    }

    protected void cde() {
        System.out.println("Protected Method ");
    }
    void lmn() {
        System.out.println("Default Methods");
    }
}

public class  OBJVALUES {
    public static void main(String[] args) {
        OBJVALUES baseObj = new OBJVALUES();
        baseObj.abc();
        baseObj.cde();
        baseObj.fgh();
        baseObj.ijk();
        baseObj.lmn();

        System.out.println("--------");

        DerivedClass derivedObj = new DerivedClass();
        derivedObj.abc();
        derivedObj.cde();
        derivedObj.lmn();
        
    }
}