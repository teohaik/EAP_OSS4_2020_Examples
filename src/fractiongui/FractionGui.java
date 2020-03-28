
package fractiongui;

/**
 *
 * @author tchaikalis
 */
public class FractionGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4,5);
        System.out.println(f1);
        System.out.println(f1.getValue());
        
        CalcFrame frame = new CalcFrame();
    }
    
}
