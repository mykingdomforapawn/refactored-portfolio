package com.mykingdomforapawn.refactoredportfolio;

public class Main {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();
        portfolio.depositCash(5800);
        portfolio.displayCash();

        portfolio.openPosition(new StockHolding("google", 34, 13));
        portfolio.displayPositions();
        portfolio.displayCash();

        portfolio.withdrawCash(3000);
        portfolio.displayCash();
    }
}
