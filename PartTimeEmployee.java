import java.util.Date;

public class PartTimeEmployee extends Employee{

    private int hoursPerWeek;
    private double hourlyRate;
    private int echelon;


    public PartTimeEmployee(String fName, String lName, int age, int hoursPerWeek, int echelon, double hourlyRate) {
        super(fName, lName, age);
        this.hoursPerWeek = hoursPerWeek;
        this.echelon = echelon;

        if(this.echelon == 1)
            hourlyRate = 15;
        else if(echelon == 2)
            hourlyRate = 20;
        else if(echelon == 3)
            hourlyRate = 25;
        else if(echelon == 4)
            hourlyRate = 30;
        else if(echelon == 5)
            hourlyRate = 40;

    }

    @Override
    public String toString() {
        System.out.println("Part Time Employee");
        System.out.println(super.toString());
        return "salary=" + getAmount() +
                '}';

    }

    @Override
    public double getAmount() {
        return hourlyRate * hoursPerWeek;
    }

}
