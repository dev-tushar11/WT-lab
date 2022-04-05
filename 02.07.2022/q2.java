class XYZ {
    int p_119, q_119;

    void get() {
        p_119 = q_119 = 10;
    }

    void display() {
        System.out.print("p = " + p_119);
        System.out.println(" q = " + q_119);
    }

    void change(XYZ x11) {
        x11.p_119 = x11.p_119 - 2;
        x11.q_119 = x11.q_119 - 5;
        p_119 = x11.p_119;
        q_119 = x11.q_119;
    }
}

class q2 {
    public static void main(String args[]) {
        XYZ x1 = new XYZ();
        x1.get();
        XYZ x2 = new XYZ();
        x2.change(x1);

        System.out.println("x1:");
        x1.display();
        System.out.println("x2:");
        x2.display();
    }
}
