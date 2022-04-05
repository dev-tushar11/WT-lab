interface Motor {
    int capacity = 119;
    void run();
    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing Machine is running...");
    }
    public void consume() {
        System.out.println("Washing Machine is consuming 255W per hour !");
        System.out.println("capacity: " + capacity);
    }
}

public class Q1 {
    public static void main(String[] args) {
        WashingMachine w1 = new WashingMachine();
        w1.run();
        w1.consume();
    }
}
