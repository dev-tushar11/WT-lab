import javax.sound.midi.Soundbank;
import java.util.Scanner;

class LessBalanceException extends Exception {
    int i;
    LessBalanceException(int i) {
        this.i = i;
    }

    public String toString() {
        return ("withdraw amount is not valid.\n" + "withdraw amount: " + i);
    }
}

class Account {
    int balance;
    Account() {
        this.balance = 500;
    }
    Account(int balance) {
        this.balance = balance;
    }

    void deposit(int bal) {
        balance += bal;
        System.out.println("deposited " + bal);
    }

    void withdraw(int bal) throws LessBalanceException {
        if (balance - bal < 500) {
            throw new LessBalanceException(bal);
        } else {
            balance -= bal;
            System.out.println("withdrawn: " + bal);
        }
    }

    void display() {
        System.out.println("Account balance: " + balance);
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if (input < 500) {
            System.out.println("min required balance: 500");
            return;
        }

        Account ac1 = new Account(input);
        ac1.deposit(1000);
        try {
            ac1.withdraw(500);
            ac1.display();
            ac1.withdraw(6000);
        } catch (LessBalanceException e) {
            System.out.println(e);
        }

        ac1.display();

    }
}
