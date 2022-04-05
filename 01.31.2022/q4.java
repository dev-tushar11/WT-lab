class xyz {
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

    int volume() {
        return (a_119 * b_119 * c_119);
    }
}

class q4 {
    public static void main(String[] args) {
        xyz x1 = new xyz();
        xyz x2 = new xyz();

        x1.getData(3, 4, 5);
        System.out.println("x1: ");
        x1.display();

        x2.getData(20, 29, 119);
        System.out.println("x2: ");
        x2.display();

        System.out.println("Volume of x1 = " + x1.volume());
        System.out.println("Volume of x2 = " + x2.volume());
    }
}