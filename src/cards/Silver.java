package cards;

public class Silver extends Card {

    public Silver(String ownerName, double turnover, double discountRate) {
        super(ownerName, turnover, discountRate);
    }

    @Override
    public void setDiscountRate() {
        double currentDiscount = 2;

        if (super.getTurnover() > 300) {
            currentDiscount = 3.5;
        }

        this.discountRate = currentDiscount;
    }
}
