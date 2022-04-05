package p3;
import p1.*;
import p2.*;

public class EmployeeDetails {
    public static void main(String[] args) {
        RegularEmployee r1 = new RegularEmployee("ABC", 25000);
        ContractEmployee c1 = new ContractEmployee("EFG", 10000);

        r1.display();
        c1.display();
    }
}
