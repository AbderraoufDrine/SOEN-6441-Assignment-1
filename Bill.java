import java.util.Date;

public class Bill implements Paid{

    private String name;
    private String month;
    private int day;
    private int year;
    private double amount;

    public Bill(String name, String month, int day, int year, double amount) {
        this.name = name;
        this.month = month;
        this.day = day;
        this.year = year;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "name='" + name + '\'' +
                ", month='" + month + '\'' +
                ", day=" + day +
                ", year=" + year +
                ", amount=" + amount +
                '}';
    }

    @Override
    public double getAmount() {
        return amount;
    }

}
