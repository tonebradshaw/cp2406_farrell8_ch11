/**
 * Created by tony on 7/09/2016.
 */
public class DebugRowboat extends DebugBoat{

    public DebugRowboat(){
        super("row");
    }
    public void setPassengers(){
        super.passengers = 2;
    }
    public void setPower(){
        super.power = "oars";
    }
}
