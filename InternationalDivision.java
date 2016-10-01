/**
 * Created by tony on 11/09/2016.
 */
public class InternationalDivision extends Division {

    String country;
    String language;

    public InternationalDivision(String country, String language){

        this.country = country;
        this.language = language;
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
            ", the country is " + country +
            " and the language is " + language);
    }
}
