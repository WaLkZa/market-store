package cards;

import static validation.ValidationMessagesConstants.*;

public abstract class Card {

    private String ownerName;
    private double turnover;
    private double valueOfPurchase;
    protected double discountRate;

    protected Card(String ownerName, double turnover, double valueOfPurchase) {
        this.setOwnerName(ownerName);
        this.setTurnover(turnover);
        this.setValueOfPurchase(valueOfPurchase);
        this.setDiscountRate();
    }

    protected String getOwnerName() {
        return this.ownerName;
    }

    protected void setOwnerName(String ownerName) {
        if (null == ownerName || ownerName.trim().isEmpty()) {
            throw new NullPointerException(NAME_NULL);
        }

        this.ownerName = ownerName;
    }

    protected double getTurnover() {
        return this.turnover;
    }

    protected void setTurnover(double turnover) {
        if (turnover < 0) {
            throw new IllegalArgumentException(NEGATIVE_TURNOVER);
        }

        this.turnover = turnover;
    }

    protected double getValueOfPurchase() {
        return this.valueOfPurchase;
    }

    protected void setValueOfPurchase(double valueOfPurchase) {
        if (valueOfPurchase < 0) {
            throw new IllegalArgumentException(NEGATIVE_PURCHASE_VALUE);
        }

        this.valueOfPurchase = valueOfPurchase;
    }

    protected double getDiscountRate() {
        return this.discountRate;
    }

    protected abstract void setDiscountRate();

    protected double getDiscountOfTheCurrentPurchase() {
        return (this.getValueOfPurchase() * this.getDiscountRate()) / 100;
    }

    protected double getTotalDiscount() {
        return this.getValueOfPurchase() - this.getDiscountOfTheCurrentPurchase();
    }

    @Override
    public String toString() {
        return String.format("Purchase value: $%.2f\n" +
                        "Discount rate: %.1f%%\n" +
                        "Discount: $%.2f\n" +
                        "Total: $%.2f\n",
                this.getValueOfPurchase(),
                this.getDiscountRate(),
                this.getDiscountOfTheCurrentPurchase(),
                this.getTotalDiscount());
    }
}
