package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
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
    public double getTip() {
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

    @Override
    public final void setServiceQuality(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    @Override
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    @Override
    public void collect() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
