public class q7 {
    public static void main(String[] args) {
        int a[] = new int[4];

        try {
            a[4] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
