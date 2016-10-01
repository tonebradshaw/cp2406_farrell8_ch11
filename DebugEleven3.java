/**
 * Created by Tony on 7/09/2016.
 */
public class DebugEleven3 {

    public static void main(String args[]){

        DebugRowboat redBoat = new DebugRowboat();
        DebugRowboat blueBoat = new DebugRowboat();

        redBoat.setPassengers();
        redBoat.setPower();
        blueBoat.setPassengers();
        blueBoat.setPower();

        System.out.print("The two boats are");
        Boolean answer = redBoat.equals(blueBoat);
        if(answer)
            System.out.println(" equal");
        else
            System.out.println(" not equal");
    }
}
