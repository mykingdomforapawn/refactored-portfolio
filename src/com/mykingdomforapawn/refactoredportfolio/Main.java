package com.mykingdomforapawn.refactoredportfolio;

public class Main {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();
        portfolio.depositCash(5800);
        portfolio.displayCash();

        portfolio.openPosition(new StockHolding("google", 34, 13));
        portfolio.openPosition(new StockHolding("aapl", 10, 10));
        portfolio.openPosition(new StockHolding("aapl", 10, 10));
        portfolio.openPosition(new RealEstate("Summer Lodge", 100000));
        portfolio.openPosition(new RealEstate("Winter Lodge", 1000));
        portfolio.displayPositions();
        portfolio.displayCash();

        portfolio.withdrawCash(3000);
        portfolio.displayCash();
    }
}
