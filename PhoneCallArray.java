import java.lang.reflect.Array;

/**
 * Created by tony on 11/09/2016.
 */
public class PhoneCallArray {



    public static void main(String[] args) {

        IncomingPhoneCall income = new IncomingPhoneCall("4012345678");
        OutgoingPhoneCall outgo = new OutgoingPhoneCall("4098765432", 11);
        IncomingPhoneCall income1 = new IncomingPhoneCall("4012387654");
        OutgoingPhoneCall outgo1 = new OutgoingPhoneCall("4098723456", 15);
        IncomingPhoneCall income2 = new IncomingPhoneCall("4012348765");
        OutgoingPhoneCall outgo2 = new OutgoingPhoneCall("4098762345", 19);
        IncomingPhoneCall income3 = new IncomingPhoneCall("4012345876");
        OutgoingPhoneCall outgo3 = new OutgoingPhoneCall("4098765234", 23);
        IncomingPhoneCall income4 = new IncomingPhoneCall("4012345687");
        OutgoingPhoneCall outgo4 = new OutgoingPhoneCall("4098765423", 27);
        IncomingPhoneCall income5 = new IncomingPhoneCall("4012345674");
        OutgoingPhoneCall outgo5 = new OutgoingPhoneCall("4098765434", 31);


        PhoneCall [] calls = {income, outgo, income1, outgo1, income2, outgo2, income3, outgo3, income4, outgo4, income5, outgo5};

        for (int i = 0; i < calls.length; ++i) {

            calls[i].getDisplay();
        }
    }
}
