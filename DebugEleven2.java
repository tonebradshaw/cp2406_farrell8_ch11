/**
 * Created by tony on 7/09/2016.
 */
public class DebugEleven2 {

    public static void main(String[] args){

        DebugBoat[] ref = new DebugBoat[3];
        DebugRowboat blueBoat = new DebugRowboat();
        DebugRowboat redBoat = new DebugRowboat();
        DebugOceanLiner bigBoat = new DebugOceanLiner();

        ref[0] = redBoat;
        ref[1] = blueBoat;
        ref[2] = bigBoat;

        for(int x = 0; x < ref.length; ++x){

            ref[x].setPassengers();
            ref[x].setPower();
            System.out.println(ref[x].toString());
        }
    }
}
