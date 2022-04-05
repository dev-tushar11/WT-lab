class X {
    int a_119;
    static int b_119;
    void f1() {
        a_119 = a_119 + 10;
        b_119 = b_119 + 5;
    }
    X(){
        a_119 = 0;
    }
    void display(){
        System.out.println("a = " + a_119 + " b = " + b_119);
    }
}

class q2 {
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new X();

        x1.f1();
        x2.f1();

        x1.display();
        x2.display();
    }
}
