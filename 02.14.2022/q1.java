class X {
    int a_119;
    static int b_119;
}

class q1 {
    public static void main(String args[]) {
        X x1 = new X();
        X x2 = new X();

        x1.a_119 = 10;
        x1.b_119 = 20;

        x2.a_119 = 8;

        System.out.println("a: " + x1.a_119);
        System.out.println("b: " + X.b_119);
        System.out.println("a: " + x2.a_119);
        System.out.println("b: " + x2.b_119);
    }
}
