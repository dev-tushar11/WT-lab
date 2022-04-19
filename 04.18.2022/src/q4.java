import java.util.Arrays;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = new String[5];
        System.out.println("enter 5 names:");
        for (int i = 0; i < 5; i++) {
            strings[i] = sc.next();
        }
        System.out.println(Arrays.toString(strings));

        for (int i = 0; i < 5; i++) {
            System.out.print(strings[i].substring(2) + " ");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            if (strings[i].charAt(0) == 'S') {
                strings[i] = strings[i].replace('e','a');
            }
        }
        System.out.println(Arrays.toString(strings));
    }
}
