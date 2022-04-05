class rational {
    int num_119, denum_119;

    rational(){
        num_119 = 1;
        denum_119 = 1;
    }

    rational(int i, int j) {
        num_119 = i;
        denum_119 = j;
    }

    void show() {
        System.out.println(num_119 + "/" + denum_119);
    }

    rational add(rational r) {
        rational tmp = new rational();

        tmp.denum_119 = denum_119 * r.denum_119;
        tmp.num_119 = (num_119 * r.denum_119) + (r.num_119 * denum_119);

        return tmp;
    }

    rational addition(rational r1, rational r2) {
        rational tmp = new rational();

        tmp.denum_119 = r1.denum_119 * r2.denum_119;
        tmp.num_119 = (r1.num_119 * r2.denum_119) + (r2.num_119 * r1.denum_119);

        return tmp;
    }

    rational sub(rational r) {
        rational tmp = new rational();

        tmp.denum_119 = denum_119 * r.denum_119;
        tmp.num_119 = (num_119 * r.denum_119) - (r.num_119 * denum_119);

        return tmp;
    }

    boolean equal(rational r) {
        if ((num_119 * r.denum_119) == (r.num_119 * denum_119)) {
            return true;
        }

        return false;
    }
}

class q3 {
    public static void main(String[] args) {
        rational r1 = new rational(5,6);
        rational r2 = new rational(25, 30);

        System.out.print("r1: ");
        r1.show();
        System.out.print("r2: ");
        r2.show();

        rational r3 = r1.add(r2);
        System.out.print("r1 + r2: ");
        r3.show();

        rational r4 = r1.sub(r2);
        System.out.print("r1 - r2: ");
        r4.show();

        rational r5 = new rational();
        r5 = r5.addition(r1, r2);
        System.out.print("r1 + r2: ");
        r5.show();

        System.out.println(r1.equal(r2));
    }
}
