interface one12345 {
    public void show();

    public void show1();

}

interface three12 {
    public void display();

}

class Two45 implements one12345, three12 {
    public void show() {
        System.out.println("Inside Show method");
    }

    public void show1() {
        System.out.println("Inside Show1 method");
    }

    public void display() {
        System.out.println("Inside display method");
    }

}

public class one_interface2 {
    public static void main(String[] args) {
        Two45 obj = new Two45();
        obj.show();
        obj.show1();
        obj.display();
    }
}