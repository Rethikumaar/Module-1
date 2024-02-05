abstract class animal {
    void legs() {
        System.out.println("All Animals have 4 legs");

    }

    abstract void sound();

    abstract void eat();
}

class Dog extends animal {
    void sound() {
        System.out.println("Bow Bow");
    }

    void eat() {
        System.out.println("Meat eating");
    }
}

class Cow extends animal {
    void sound() {
        System.out.println("Amba Amba");
    }

    void eat() {
        System.out.println("Grass Eating");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cow c = new Cow();
        d.sound();
        d.eat();
        d.legs();
        c.sound();
        c.eat();
        c.legs();
    }
}