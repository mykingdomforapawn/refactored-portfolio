package com.mykingdomforapawn.refactoredportfolio;

public class Main {
    public static void main(String[] args) {
        boolean successIndicator;

        Portfolio portfolio = new Portfolio();
        successIndicator = portfolio.depositCash(23);
        if (successIndicator) {
            System.out.println(portfolio.getCash());
        }
        System.out.println(portfolio.getCash());
        //portfolio.openPosition(position);
    }
}
