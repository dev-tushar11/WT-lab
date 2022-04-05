class volume {
    int length_119;
    int height_119;

    volume(int l, int h) {
        length_119 = l;
        height_119 = h;
    }

    void calculateVolume() {
        int volume_119 = 0;

        System.out.println("volume: " + volume_119);
    }
}

class cone extends volume {
    cone(int a, int b) {
        super(a, b);
    }

    void calculateVolume() {
        float volume_119 = 0.33f * 3.14f * length_119 * length_119 * height_119;

        System.out.println("volume: " + volume_119);
    }
}

class square_prism extends volume {
    square_prism(int a, int b) {
        super(a, b);
    }

    void calculateVolume() {
        float volume_119 = length_119 * length_119 * height_119;

        System.out.println("volume: " + volume_119);
    }
}

class q2 {
    public static void main(String[] args) {
        cone c1 = new cone(2, 3);

        c1.calculateVolume();

        square_prism s1 = new square_prism(4, 5);

        s1.calculateVolume();
    }
}
