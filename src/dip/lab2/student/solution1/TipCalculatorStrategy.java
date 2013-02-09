package dip.lab2.student.solution1;

/**
 *
 * @author Mary King
 */
public interface TipCalculatorStrategy {

    public abstract double getTip();
    
    public abstract void setServiceQuality(ServiceQuality q);
    
    public abstract ServiceQuality getServiceQuality();
}
