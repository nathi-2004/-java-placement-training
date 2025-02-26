abstract class OuterClass {
    abstract void abstractMethod();
    void concreteMethod() {
        System.out.println("Concrete method in OuterClass.");
    }
    abstract class InnerAbstractClass {
        abstract void innerAbstractMethod();
        void innerConcreteMethod() {
            System.out.println("Concrete method in InnerAbstractClass.");
        }
    }
    class ConcreteInnerClass extends InnerAbstractClass {
        void innerAbstractMethod() {
            System.out.println("Implemented innerAbstractMethod in ConcreteInnerClass.");
        }
    }
}
class ConcreteOuterClass extends OuterClass {
    void abstractMethod() {
        System.out.println("Implemented abstractMethod in ConcreteOuterClass.");
    }
    public static void main(String[] args) {
        ConcreteOuterClass outerObj = new ConcreteOuterClass();
        outerObj.concreteMethod();
        ConcreteInnerClass innerObj = outerObj.new ConcreteInnerClass();
        innerObj.innerConcreteMethod();
        innerObj.innerAbstractMethod();
        outerObj.abstractMethod();
    }
}
