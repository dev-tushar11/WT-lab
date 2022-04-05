// write a program that inputs 3 integers from the user and displays the sum,average,product,smallest and largest of the numbers

import java.util.*;

class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum_119 = num1 + num2 + num3;
        System.out.println("sum = " + sum_119);

        float average_119 = sum_119 / 3.0f;
        System.out.println("average = " + average_119);

        int product_119 = num1 * num2 * num3;
        System.out.println("product = " + product_119);

        int smallest_119;
        if (num1 <= num2) {
            if (num1 <= num3) {
                smallest_119 = num1;
            } else {
                smallest_119 = num3;
            }
        } else {
            if (num2 <= num3) {
                smallest_119 = num2;
            } else {
                smallest_119 = num3;
            }
        }

        System.out.println("smallest = " + smallest_119);

        int largest_119;
        if (num1 >= num2) {
            if (num1 >= num3) {
                largest_119 = num1;
            } else {
                largest_119 = num3;
            }
        } else {
            if (num2 >= num3) {
                largest_119 = num2;
            } else {
                largest_119 = num3;
            }
        }

        System.out.println("largest = " + largest_119);

        sc.close();
    }
}
