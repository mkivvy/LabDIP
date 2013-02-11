package dip.lab2.student.solution1;

/**
 * This interface defines methods required by classes that calculate tips.
 * @author Mary King
 */
public interface TipCalculatorStrategy {

    public abstract double getTip();
    
    public abstract void setServiceQuality(ServiceQuality q);
    
    public abstract ServiceQuality getServiceQuality();
}
