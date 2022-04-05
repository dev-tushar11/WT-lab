/* in a right ange triangle,the square of the length of one side is equal to the sum of the squares of the lengths of the other two sides.
write a program that prompts the user to enter the length of 3 sides of a triangle  and then output a message indicating whether the triangle is a right angle.
*/

import java.util.*;

class q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a_119, b_119, c_119;

        a_119 = sc.nextInt();
        b_119 = sc.nextInt();
        c_119 = sc.nextInt();

        int largest_119;
        if (a_119 >= b_119) {
            if (a_119 >= c_119) {
                largest_119 = a_119;
            } else {
                largest_119 = c_119;
            }
        } else {
            if (b_119 >= c_119) {
                largest_119 = b_119;
            } else {
                largest_119 = c_119;
            }
        }

        if ((largest_119 * largest_119) == ((a_119 * a_119) + (b_119 * b_119) + (c_119 * c_119) - (largest_119 * largest_119))) {
            System.out.println("right angle triangle");
        } else {
            System.out.println("not right angle triangle");
        }

        sc.close();
    }
}
