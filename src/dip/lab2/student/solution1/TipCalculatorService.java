package dip.lab2.student.solution1;

/**
 * This class calls the appropriate tip calculation class based on the 
 * TipCalculatorStrategy passed as an argument.
 * @author Mary King
 */
public class TipCalculatorService {
    
    public final double calculateTip(TipCalculatorStrategy tipStratety) {
        return tipStratety.getTip();
    }
}
