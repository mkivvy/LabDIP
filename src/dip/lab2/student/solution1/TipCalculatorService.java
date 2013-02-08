package dip.lab2.student.solution1;

/**
 *
 * @author Mary King
 */
public class TipCalculatorService {
    
    public final double dosomething(TipCalculatorStrategy tipStrategy, 
            ServiceQuality quality) {
        return tipStrategy.calculateTip(quality);
    }
}
