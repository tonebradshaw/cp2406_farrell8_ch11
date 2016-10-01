/**
 * Created by tony on 11/09/2016.
 */
public class DemoPhoneCalls {

    public static void main(String[] args) {

        IncomingPhoneCall income = new IncomingPhoneCall("4012345678");
        OutgoingPhoneCall outgo = new OutgoingPhoneCall("4098765432", 11);

        income.getDisplay();
        outgo.getDisplay();
    }
}
