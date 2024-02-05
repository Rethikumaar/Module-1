enum Apple35 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;

    Apple35(int p) {
        price = p;
        System.out.println("price" + p);
    }

    int getPrice() {
        return price;
    }
}

class EnumDemo3 {
    public static void main(String args[]) {

        System.out.println("Winesap costs " +
                Apple35.Winesap.getPrice() + " cents.\n");

        System.out.println("All Apple35 prices:");
        for (Apple35 a : Apple35.values())
            System.out.println(a + " costs " + a.getPrice() + "cents.");
    }
}