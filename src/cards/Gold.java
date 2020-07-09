package cards;

public class Gold extends Card {

    private double discountRate;

    public Gold(String ownerName, double turnover, double valueOfPurchase) {
        super(ownerName, turnover, valueOfPurchase);
        this.setDiscountRate();
    }

    public double getDiscountRate() {
        return this.discountRate;
    }

    public void setDiscountRate() {
        double currentDiscount = 2;

        this.discountRate = Math.min(10, currentDiscount + super.getTurnover() / 100);
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
