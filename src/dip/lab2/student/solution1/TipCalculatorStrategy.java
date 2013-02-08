package dip.lab2.student.solution1;

/**
 *
 * @author Mary King
 */
public interface TipCalculatorStrategy {

    public abstract void collect();

    public abstract double getTip();

    public abstract ServiceQuality getServiceQuality();

    public abstract void setServiceQuality(ServiceQuality q);
    
}
