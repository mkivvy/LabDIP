package dip.lab2.student.solution1;

/**
 *
 * @author Mary King
 */
public interface TipCalculatorStrategy {

    static final double GOOD_RATE = 0.20;
    static final double FAIR_RATE = 0.15;
    static final double POOR_RATE = 0.10;

    public abstract double getTip();

    public abstract ServiceQuality getServiceQuality();

    public abstract void setServiceQuality(ServiceQuality q);
    
}
