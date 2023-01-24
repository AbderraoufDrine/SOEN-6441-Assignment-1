import java.util.Date;

public class Employee implements Paid{

    private String fName;
    private String lName;
    private int age;

    public Employee(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public double getAmount() {
        return 0;
    }

}
