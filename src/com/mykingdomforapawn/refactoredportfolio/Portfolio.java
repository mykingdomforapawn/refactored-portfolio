package com.mykingdomforapawn.refactoredportfolio;

import java.util.ArrayList;

public class Portfolio implements PortfolioInterface{
    final private ArrayList<Position> investments;
    private int cash;

    public Portfolio (){
        investments = new ArrayList<>();
        cash = 0;
    }

    @Override
    public boolean depositCash(int amount) {
        if (amount >= 0) {
            this.cash += amount;
        }
        return amount >= 0;
    }

    public int getCash() {
        return cash;
    }
}
