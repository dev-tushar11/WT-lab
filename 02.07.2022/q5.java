import java.util.*;

class complex {
    int real_119, img_119;

    complex() {
        real_119 = 0;
        img_119 = 0;
    }

    complex(int i, int j) {
        real_119 = i;
        img_119 = j;
    }

    void display() {
        System.out.println(real_119 + " + " + img_119 + "i");
    }

    void add(complex x, complex y) {
        real_119 = x.real_119 + y.real_119;
        img_119 = x.img_119 + y.img_119;
    }

    complex add(complex a) {
        complex tmp = new complex();
        tmp.real_119 = real_119 + a.real_119;
        tmp.img_119 = img_119 + a.img_119;

        return tmp;
    }
}

class q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();

        complex c2 = new complex(i, j);

        i = sc.nextInt();
        j = sc.nextInt();

        complex c3 = new complex(i, j);

        complex c1 = new complex();

        c1.add(c2, c3);

        System.out.print("c2: ");
        c2.display();
        System.out.print("c3: ");
        c3.display();
        System.out.print("c1: ");
        c1.display();

        complex c4 = new complex();
        c4 = c1.add(c2);
        System.out.print("c4: ");
        c4.display();

        sc.close();
    }
}
