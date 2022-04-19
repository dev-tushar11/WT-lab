import java.util.Arrays;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter String: ");
        String s1 = sc.nextLine();
        String s2 = args[0] + s1;
        System.out.println(s2);

        String[] strings = s2.split(" ");
        System.out.println(Arrays.toString(strings));
    }
}
