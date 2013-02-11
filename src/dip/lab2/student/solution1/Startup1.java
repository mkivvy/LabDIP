package dip.lab2.student.solution1;

// An useful import if you need it.
//import java.text.NumberFormat;
//// Another useful import if you need it.
//import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * This class tests the tip calculation classes accessed through the interface
 * TipCalculatorStrategy and the class TipCalculatorService.
 * @author Mary King
 */
public class Startup1 {
    public static void main(String[] args) {
        
        TipCalculatorStrategy[] tcs = 
            { new BaggageServiceTipCalculator1(ServiceQuality.FAIR,5), 
            new BaggageServiceTipCalculator1(ServiceQuality.POOR,3), 
            new BaggageServiceTipCalculator1(ServiceQuality.GOOD,7), 
            new FoodServiceTipCalculator1(ServiceQuality.POOR, 29.95),
            new FoodServiceTipCalculator1(ServiceQuality.FAIR, 44.88),
            new FoodServiceTipCalculator1(ServiceQuality.GOOD, 50.00)};
        
        TipCalculatorService tipCalc = new TipCalculatorService();
        for (int i = 0; i < tcs.length; i++) {
            System.out.println("The calculated tip is: "
                    + tipCalc.calculateTip(tcs[i]));
        }
        
//        for (TipCalculatorStrategy tips : tcs) {
//            System.out.println("The calculated tip is: " + tips.getTip());
            
//        }
        
    }

}
