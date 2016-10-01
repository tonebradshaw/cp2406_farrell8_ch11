/**
 * Created by tony on 7/09/2016.
 */
public class NonFiction extends Book {

    public NonFiction(String title){

        super(title);
        setPrice();
    }
    public void setPrice(){

        price = 37.99;
    }
}
