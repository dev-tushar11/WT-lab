// Write a program to create user defined exceptions called HrsException,
//MinException and SecException. Create a class Time which contains data
//members hours, minutes, seconds and throw the user defined exceptions if
//hours (>24 & <0),minutes(>60 & <0),seconds(>60 & <0)

import java.util.Scanner;

class HrsException extends Exception {
    int hrs;
    HrsException(int hrs) {
        this.hrs = hrs;
    }

    public String toString() {
        return ("Hours can't be " + hrs);
    }
}

class MinException extends Exception {
    int min;
    MinException(int min) {
        this.min = min;
    }

    public String toString() {
        return ("Minutes can't be " + min);
    }
}

class SecException extends Exception {
    int sec;
    SecException(int sec) {
        this.sec = sec;
    }

    public String toString() {
        return ("Seconds can't be " + sec);
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hrs, min, sec;
        int in;

        try {
            System.out.print("enter hours: ");
            in = input.nextInt();
            if (in > 24 || in < 0) {
                throw new HrsException(in);
            } else {
                hrs = in;
                System.out.println("Hours: " + hrs);
            }
        } catch (HrsException e) {
            System.out.println(e);;
        }

        try {
            System.out.print("enter minutes: ");
            in = input.nextInt();
            if (in > 60 || in < 0) {
                throw new MinException(in);
            } else {
                min = in;
                System.out.println("Minutes: " + min);
            }
        } catch (MinException e) {
            System.out.println(e);;
        }

        try {
            System.out.print("enter seconds: ");
            in = input.nextInt();
            if (in > 60 || in < 0) {
                throw new SecException(in);
            } else {
                sec = in;
                System.out.println("Seconds: " + sec);
            }
        } catch (SecException e) {
            System.out.println(e);;
        }

        System.out.println("main terminates");
    }
}
