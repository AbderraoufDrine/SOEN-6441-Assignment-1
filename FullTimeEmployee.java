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
        System.out.println("salary: "+ getAmount());
        return "";
    }

    @Override
    public double getAmount() {
        return salary;
    }
}

