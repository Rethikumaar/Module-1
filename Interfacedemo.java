interface one_12 {
    public void show();

    public void show1();
}

class two_12 implements one_12 {
    public void show() {
        System.out.println("Inside Show method");
        System.out.println();

    }

    public void show1() {
        System.out.println("Inside Show1 method");
        System.out.println(" ");
    }

}

public class Interfacedemo {
    public static void main(String[] args) {
        two_12 s = new two_12();
        s.show();
        s.show1();
    }
}