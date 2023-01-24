import java.util.ArrayList;

public class Company {

    private ArrayList<Paid> list;

    public Company(){
        list = new ArrayList<>();
    }

    public void addBill(Bill obj){
        list.add(obj);
    }
    public void removeBill(Bill obj){
        list.remove(obj);
    }
    public void addEmployee(Employee obj){

    }
    public void removeEmployee(Employee obj){

    }

    public void issueCheques(){

    }
}
