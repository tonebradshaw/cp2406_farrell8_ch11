/**
 * Created by tony on 7/09/2016.
 */
public class Fiction extends Book {

    public Fiction(String title){

        super(title);
        setPrice();
    }
    public void setPrice(){

        price = 24.99;
    }
}
