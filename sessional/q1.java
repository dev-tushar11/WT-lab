import java.util.*;

class q1 {
    static int func(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                sum += c - '0';
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        System.out.println("Sum of the digits in the string: " + func(s));
    }
}