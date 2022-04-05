import java.util.Scanner;

interface Employee {
    void earnings(double basicS);
    void deductions(double basicS);
    default void bonus(double basicS) {
        System.out.println("Bonus: " + 0);
    }
}

class Manager implements Employee {
    public void earnings(double basicS) {
        double DA = basicS * 0.8;
        double HRA = basicS * 0.15;
        System.out.println("Earnings: " + (basicS + DA + HRA));
    }
    public void deductions(double basicS) {
        System.out.println("Deductions: " + (basicS * 0.12));
    }
}

class Substaff extends Manager {
    public void bonus(double basicS) {
        System.out.println("Bonus: " + (basicS * 0.5));
    }
}

public class Q2 {
    public static void main(String[] args) {
        Substaff s1 = new Substaff();
        double basicSalary;
        System.out.print("enter basic salary: ");
        Scanner sc = new Scanner(System.in);
        basicSalary = sc.nextDouble();
        s1.earnings(basicSalary);
        s1.deductions(basicSalary);
        s1.bonus(basicSalary);
    }
}
