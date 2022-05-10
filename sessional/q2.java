/* Design a class to represent BankAccount details as base class and BankProcess as sub class. The BankAccount class contains the data members like name of the account holder, account number, type of account, balance and methods are getDetails() and printDetails(). Then create BankProcess class which is the subclass of BankAccount which contails amount as instance variables and methods are withdraw() and deposit(). Create an object of BankProcess class and call the methods. */

import java.util.*;

class BankAccount {
    String name;
    int accno;
    String type;
    double balance;

    void getDetails(String name, int accno, String type, double balance) {
        this.name = name;
        this.accno = accno;
        this.type = type;
        this.balance = balance;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accno);
        System.out.println("Account Type: " + type);
        System.out.println("Balance: " + balance);
    }
}

class BankProcess extends BankAccount {
    double amount;

    void withdraw() {
        if (balance - amount < 0) {
            System.out.println("can't withdraw");
        } else {
            balance -= amount;
            System.out.println("Balance: " + balance);
        }
    }

    void deposit() {
        balance += amount;
        System.out.println("Balance: " + balance);
    }
}

class q2 {
    public static void main(String[] args) {
        BankProcess bp = new BankProcess();
        bp.getDetails("Tushar", 12345, "Savings", 0);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        bp.amount = sc.nextDouble();
        bp.withdraw();

        System.out.print("Enter amount to deposit: ");
        bp.amount = sc.nextDouble();
        bp.deposit();

        System.out.print("Enter amount to withdraw: ");
        bp.amount = sc.nextDouble();
        bp.withdraw();

        System.out.println();
        bp.printDetails();
    }
}