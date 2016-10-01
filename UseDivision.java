/**
 * Created by tony on 11/09/2016.
 */
public class UseDivision {

    public static void main(String[] args) {

        InternationalDivision inter = new InternationalDivision("Australia", "English");
        DomesticDivision dom = new DomesticDivision("Queensland");

        inter.setAccountNumber(12345);
        inter.setDivisionName("Asia");

        dom.setAccountNumber(98765);
        dom.setDivisionName("Sales");

        inter.display();
        dom.display();
    }
}
