package com.mykingdomforapawn.refactoredportfolio;

public class Main {
    public static void main(String[] args) {
        boolean successIndicatior;


        //Position position = new Position();
        Portfolio portfolio = new Portfolio();
        successIndicatior = portfolio.depositCash(23);
        if (successIndicatior) {
            System.out.println(portfolio.getCash());
        }
        System.out.println(portfolio.getCash());
        //portfolio.openPosition(position);
    }
}
