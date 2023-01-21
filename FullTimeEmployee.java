import java.util.Date;

public class FullTimeEmployee extends Employee {

    private double salary;

    public FullTimeEmployee(String fName, String lName, int age, double salary) {
        super(fName, lName, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        System.out.println("Full Time Employee");
        System.out.println(super.toString());
        return "salary=" + salary +
                '}';
    }

    @Override
    public double getAmount() {
        return salary;
    }

    @Override
    public Date dueDate() {
        return super.dueDate();
    }
}
