class OuterClass {
    void display() {
        System.out.println("OuterClass display");
    }

    class InnerClass {
        void display() {
            System.out.println("InnerClass display");
        }
    }
}

public class Mainclass1 {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        outerObj.display();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.display();
    }
}