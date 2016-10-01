/**
 * Created by tony on 11/09/2016.
 */
public class OutgoingPhoneCall extends PhoneCall {

    int time;

    public OutgoingPhoneCall(String phoneNumber, int time){

        super(phoneNumber);
        this.time = time;
        setCallPrice(0.04);
    }
    @Override
    public void getDisplay(){

        System.out.println("The phone number is " + getPhoneNumber() +
                " ,the rate is " + getCallPrice() +
                " ,the number of minutes is " + time +
                " and the price of the call is " + (getCallPrice() * time));
    }
    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public double getCallPrice() {
        return callPrice;
    }
}
