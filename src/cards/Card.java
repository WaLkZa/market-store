package cards;

import static validation.ValidationMessagesConstants.*;

public abstract class Card {

    private String ownerName;
    private double turnover;
    private double valueOfPurchase;

    protected Card(String ownerName, double turnover, double valueOfPurchase) {
        this.setOwnerName(ownerName);
        this.setTurnover(turnover);
        this.setValueOfPurchase(valueOfPurchase);
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

    protected abstract double getDiscountOfTheCurrentPurchase();
    protected abstract double getTotalDiscount();
}
