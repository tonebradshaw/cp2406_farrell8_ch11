/**
 * Created by tony on 12/09/2016.
 */
public class MetalElement extends Element {

    private String name;
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;

    public MetalElement(String name, String symbol, int atomicNumber, double atomicWeight){

        super(name, symbol, atomicNumber, atomicWeight);
    }
    @Override
    public void describeElement(){

        System.out.println("The name is " + super.name +
            ", the symbol is \"" + super.symbol  +
            "\", the atomic number is " + super.atomicNumber +
            " and the atomic weight is " + super.atomicWeight +
            "\nMetals are good conductors of electricity, ductile and malleable.");
    }
}
