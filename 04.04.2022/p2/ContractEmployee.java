package p2;

public class ContractEmployee extends ContractEmployeeSalary{
    String name;

    public ContractEmployee(String name, double salary) {
        super(salary);
        this.name = name;
    }

    public void display() {
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
    }
}
