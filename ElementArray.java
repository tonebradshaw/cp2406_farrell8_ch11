

/**
 * Created by tony on 12/09/2016.
 */
public class ElementArray {


    public static void main(String[] args) {

        Element[] elements = new Element [4];

        MetalElement metal = new MetalElement("Sodium", "Na", 11, 22.9898);
        elements[0] = metal;
        MetalElement metal1 = new MetalElement("Magnesium", "Mg", 12, 24.312);
        elements[1] = metal1;
        NonMetalElement nonMetal = new NonMetalElement("Selenium", "Se", 34, 78.96);
        elements[2] = nonMetal;
        NonMetalElement nonMetal1 = new NonMetalElement("Iodine", "I", 53, 126.9044);
        elements[3] = nonMetal1;

        for(Element element : elements){
            element.describeElement();
            System.out.println();
        }
    }
}
