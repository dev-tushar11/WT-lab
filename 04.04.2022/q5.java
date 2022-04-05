public class q5 {
    public static void main(String[] args) {
        int a[] = new int[5];

        try {
            a[0] = 10;
            a[1] = 20;
            a[2] = 30;
            a[3] = 40;
            a[4] = 50;
            a[5] = 60;
        } catch (Exception e) {
            System.out.println("caught exception: " + e);
        }

        for (int i : a) {
            System.out.println(i);
        }
    }
}
