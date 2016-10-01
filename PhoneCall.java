/**
 * Created by tony on 11/09/2016.
 */
public abstract class PhoneCall {

    public String phoneNumber;
    public double callPrice;

    public PhoneCall(String phoneNumber){

        this.phoneNumber = phoneNumber;
        callPrice = 0.0;
    }
    public void setCallPrice(double callPrice){
         this.callPrice = callPrice;
    }
    public abstract String getPhoneNumber();
    public abstract double getCallPrice();
    public abstract void getDisplay();
}
