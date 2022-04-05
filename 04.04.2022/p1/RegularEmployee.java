package p1;

public class RegularEmployee extends RegularEmployeeSalary {
    String name;

    public RegularEmployee(String name, double salary) {
        super(salary);
        this.name = name;
    }

    public void display() {
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
    }
}
