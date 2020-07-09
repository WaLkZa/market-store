package cards;

public class Silver extends Card {

    private double discountRate;

    public Silver(String ownerName, double turnover, double discountRate) {
        super(ownerName, turnover, discountRate);
        this.setDiscountRate();
    }

    public double getDiscountRate() {
        return this.discountRate;
    }

    public void setDiscountRate() {
        double currentDiscount = 2;

        if (super.getTurnover() > 300) {
            currentDiscount = 3.5;
        }

        this.discountRate = currentDiscount;
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
