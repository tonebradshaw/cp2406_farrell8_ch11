/**
 * Created by tony on 11/09/2016.
 */
public abstract class Division {

    protected String divisionName;
    protected int accountNumber;

    public Division(){

    }
    public Division(String divisionName, int accountNumber){

        this.divisionName = divisionName;
        this.accountNumber= accountNumber;
    }
    public abstract void display();
}
