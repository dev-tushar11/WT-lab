class ABC {
    int i_119, j_119;

    ABC(int x, int y) {
        i_119 = x;
        j_119 = y;
    }

    ABC(int p) {
        i_119 = p;
        j_119 = i_119 + p;
    }

    ABC(ABC a33) {
        i_119 = i_119 + a33.i_119;
        j_119 = j_119 + a33.j_119;
    }

    void display() {
        System.out.print("i = " + i_119);
        System.out.println(" j = " + j_119);
    }
}

class q1 {

    public static void main(String args[]) {
        ABC a1 = new ABC(2029, 119);
        ABC a2 = new ABC(2029119);
        ABC a3 = new ABC(a2);

        System.out.println("a1:");
        a1.display();
        System.out.println("a2:");
        a2.display();
        System.out.println("a3:");
        a3.display();
    }
}