package dip.lab2.student.solution1;

/**
 * Calculates a tip for baggage service given a bag count and service quality.  
 * A base tip rate of $1 per bag is used unless the field is set to another
 * value.  Constants are used for good, fair, and poor service rates.  This 
 * class implements all the abstract methods in TipCalculatorStrategy and
 * adds new methods for getting and setting bagCount & baseTipPerBag.  All
 * methods are marked final so they cannot be overridden in any derived class.
 * @author Mary King
 */
public class BaggageServiceTipCalculator1 implements TipCalculatorStrategy {
    static final double GOOD_RATE = 0.20;
    static final double FAIR_RATE = 0.15;
    static final double POOR_RATE = 0.10;

    private double baseTipPerBag;
    private int bagCount;
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator1(ServiceQuality q, int bags) {
        this.setServiceQuality(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    @Override
    public final double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
                break;
        }

        return tip;
    }

    @Override
    public final void setServiceQuality(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    @Override
    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
