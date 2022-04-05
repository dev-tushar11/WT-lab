class X {
    int a_119, b_119, c_119;

    void getData(int i, int j, int k) {
        a_119 = i;
        b_119 = j;
        c_119 = k;
    }

    void display() {
        System.out.println("a = " + a_119);
        System.out.println("b = " + b_119);
        System.out.println("c = " + c_119);
    }

    void add(X p, X q) {
        a_119 = p.a_119 + q.a_119;
        b_119 = p.b_119 + q.b_119;
        c_119 = p.c_119 + q.c_119;
    }
}

class q3 {
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new X();
        X x3 = new X();

        x1.getData(5, 6, 7);
        System.out.println("x1: ");
        x1.display();

        x2.getData(10, 11, 12);
        System.out.println("x2: ");
        x2.display();

        x3.add(x1, x2);
        System.out.println("x3: ");
        x3.display();
    }
}