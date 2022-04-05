class X {
    int r_119;
    void setData(int i) {
        r_119 = i;
    }
}

class circle extends X {
    float area_119;
    void calcArea() {
        setData(20);
        area_119 = 3.14f * r_119 * r_119;
        System.out.println("area of circle = " + area_119);
    }
}

class sphere extends X {
    float volume_119;
    void calcSphereVol() {
        setData(29);
        volume_119 = (4 / 3.0f) * 3.14f * r_119 * r_119 * r_119;
        System.out.println("volume of sphere = " + volume_119);
    }
}

class cube extends X {
    float volume_119;
    void calcCubeVol() {
        setData(119);
        volume_119 = r_119 * r_119 * r_119;
        System.out.println("volume of cube = " + volume_119);
    }
}

class q4 {
    public static void main(String args[]) {
        circle c1 = new circle();
        sphere s1 = new sphere();
        cube cub1 = new cube();

        c1.calcArea();
        s1.calcSphereVol();
        cub1.calcCubeVol();
    }
}