public class q4 {
    public static void main(String[] args) {
        int a = 10, b;
        try {
            b = a / 0;
            System.out.println(b);
        } catch (Exception e) {
            System.out.println("caught an exception " + e);
        }

        System.out.println("rest of the code");
    }
}
