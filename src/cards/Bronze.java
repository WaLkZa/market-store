package cards;

public class Bronze extends Card {

    public Bronze(String ownerName, double turnover, double valueOfPurchase) {
        super(ownerName, turnover, valueOfPurchase);
    }

    @Override
    public void setDiscountRate() {
        if (super.getTurnover() < 100) {
            this.discountRate = 0;
        } else if (super.getTurnover() >= 100 && super.getTurnover() <= 300) {
            this.discountRate = 1;
        } else {
            this.discountRate = 2.5;
        }
    }
}