class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }
}

class C extends B {
    int l;

    C(int a, int b, int c, int d) {
        super(a, b, c);
        l = d;
    }
}

class Inheritance {
    public static void main(String[] args) {
        C Obj = new C(1, 2, 3, 4);

    }
}