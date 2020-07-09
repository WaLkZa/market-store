package cards;

public class Gold extends Card {

    public Gold(String ownerName, double turnover, double valueOfPurchase) {
        super(ownerName, turnover, valueOfPurchase);
    }

    @Override
    public void setDiscountRate() {
        double currentDiscount = 2;

        this.discountRate = Math.min(10, currentDiscount + super.getTurnover() / 100);
    }
}
