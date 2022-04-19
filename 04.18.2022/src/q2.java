import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter String: ");
        String s = sc.nextLine();
        System.out.println("entered String: " + s);

        s = s.replace('i', 'a');
        System.out.println("after replacing all 'i' with 'a': " + s);

        s = s.trim();
        System.out.println("after removing white spaces from beginning and end: " + s);

        String[] strings = s.split(" ");
        System.out.println("after splitting in two parts: " + Arrays.toString(strings));

        System.out.println("Character at 7: " + s.charAt(7));

        String subS1 = s.substring(5);
        System.out.println("Substring from index 5 to end: " + subS1);

        String subS2 = s.substring(5, 9);
        System.out.println("Substring from index 5 to 9: " + subS2);
    }
}
