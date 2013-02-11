package dip.lab2.student.solution1;

/**
 * Calculates a tip for food service given a bill amount and service quality.  
 * Constants are used for good, fair, and poor service rates.  This class
 * implements all the abstract methods in TipCalculatorStrategy and adds
 * new methods for getting and setting bill.  All methods are marked final
 * so they cannot be overridden in any derived class.
 * @author Mary King
 */
public class FoodServiceTipCalculator1 implements TipCalculatorStrategy {
    static final double GOOD_RATE = 0.20;
    static final double FAIR_RATE = 0.15;
    static final double POOR_RATE = 0.10;

    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;

    private double bill;
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator1(ServiceQuality q, double billAmt) {
        this.setServiceQuality(q);
        this.setBill(billAmt);
    }

    @Override
    public final double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final double getBill() {
        return bill;
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

}
