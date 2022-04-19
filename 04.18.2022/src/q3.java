import java.util.Arrays;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cities = new String[10];
        System.out.println("enter 10 cities:");
        for (int i = 0; i < 10; i++) {
            cities[i] = sc.next();
        }
        System.out.println(Arrays.toString(cities));

        for (int i = 0; i < 10; i++) {
            cities[i] = cities[i].toLowerCase();
        }
        System.out.println(Arrays.toString(cities));

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (cities[i].equals(cities[j])) {
                    System.out.println("index " + i + " and index " + j + " are equal.");
                }
            }
        }

        System.out.println("first characters of all names: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(cities[i].charAt(0) + " ");
        }
        System.out.println();
    }
}
