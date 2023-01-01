package com.mykingdomforapawn.refactoredportfolio;

public class StockHolding extends Asset {
    final private String ticker;
    final private int shares;
    final private int price;

    public StockHolding(String ticker, int shares, int price) {
        this.ticker = ticker;
        this.shares = shares;
        this.price = price;
    }

    @Override
    public int getValue() {
        return this.shares * this.price;
    }

    @Override
    public String toString() {
        return "Asset: Stock Holding | Ticker: " + ticker + " | Shares: " + shares + " | Price: " + price;
    }
}
