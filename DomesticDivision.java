/**
 * Created by tony on 12/09/2016.
 */
public class DomesticDivision extends Division{

    public String state;

    public DomesticDivision (String state){

        this.state = state;
    }
    public void setDivisionName(String divisionName){

        super.divisionName = divisionName;
    }
    public void setAccountNumber(int accountNumber){

        super.accountNumber = accountNumber;
    }
    @Override
    public void display(){

        System.out.println("The Division Name is " + super.divisionName +
                ", the account number is " + super.accountNumber +
                " and the state is " + state);
    }
}
