/**
 * Created by tony on 12/09/2016.
 */
public abstract class Element {

    protected String name;
    protected String symbol;
    protected int atomicNumber;
    protected double atomicWeight;

    public Element(String name, String symbol, int atomicNumber, double atomicWeight){

        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }
    public String getSymbol(){

        return symbol;
    }
    public int getAtomicNumber(){

        return atomicNumber;
    }
    public double getAtomicWeight(){

        return atomicWeight;
    }
    public abstract void describeElement();
}
