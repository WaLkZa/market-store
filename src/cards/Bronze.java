package cards;

public class Bronze extends Card {

    private double discountRate;

    public Bronze(String ownerName, double turnover, double valueOfPurchase) {
        super(ownerName, turnover, valueOfPurchase);
        this.setDiscountRate();
    }

    public double getDiscountRate() {
        return this.discountRate;
    }

    public void setDiscountRate() {
        if (super.getTurnover() < 100) {
            this.discountRate = 0;
        } else if (super.getTurnover() >= 100 && super.getTurnover() <= 300) {
            this.discountRate = 1;
        } else {
            this.discountRate = 2.5;
        }
    }

    @Override
    public double getDiscountOfTheCurrentPurchase() {
        return (super.getValueOfPurchase() * this.discountRate) / 100;
    }

    @Override
    public double getTotalDiscount() {
        return super.getValueOfPurchase() - this.getDiscountOfTheCurrentPurchase();
    }

    @Override
    public String toString() {
        return String.format("Purchase value: $%.2f\n" +
                        "Discount rate: %.1f%%\n" +
                        "Discount: $%.2f\n" +
                        "Total: $%.2f",
                super.getValueOfPurchase(),
                this.discountRate,
                this.getDiscountOfTheCurrentPurchase(),
                this.getTotalDiscount());
    }
}