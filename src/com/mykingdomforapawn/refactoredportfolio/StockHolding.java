package com.mykingdomforapawn.refactoredportfolio;

public class StockHolding extends Asset {
    private String ticker;
    private int shares;
    private int price;

    public StockHolding(String ticker, int shares, int price) {
        this.ticker = ticker;
        this.shares = shares;
        this.price = price;
    }

    @Override
    public int getBuyInValue() {
        return this.shares * this.price;
    }

    @Override
    public int getCurrentValue() {
        return 0;
    }
}
