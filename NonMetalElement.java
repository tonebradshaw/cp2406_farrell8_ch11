/**
 * Created by tony on 12/09/2016.
 */
public class NonMetalElement extends Element {

    private String name;
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;

    public NonMetalElement(String name, String symbol, int atomicNumber, double atomicWeight){

        super(name, symbol, atomicNumber, atomicWeight);
    }
    @Override
    public void describeElement(){

        System.out.println("The name is " + super.name +
                ", the symbol is \"" + super.symbol  +
                "\", the atomic number is " + super.atomicNumber +
                " and the atomic weight is " + super.atomicWeight +
                "\nNonmetals are poor conductors of electricity and brittle.");
    }
}
