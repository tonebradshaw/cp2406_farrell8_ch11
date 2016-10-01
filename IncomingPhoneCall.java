/**
 * Created by tony on 11/09/2016.
 */
public class IncomingPhoneCall extends PhoneCall {

    public IncomingPhoneCall(String phoneNumber){

        super(phoneNumber);
        setCallPrice(0.02);
    }
    @Override
    public void getDisplay(){

        System.out.println("The phone number is " + getPhoneNumber() +
            " the rate is " + getCallPrice() +
            " and the price of the call is " + getCallPrice());
    }
    public String getPhoneNumber(){

        return super.phoneNumber;
    }
    public double getCallPrice(){

        return super.callPrice;
    }
}
