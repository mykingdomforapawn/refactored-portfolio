package com.mykingdomforapawn.refactoredportfolio;

import java.util.ArrayList;

public class Portfolio implements PortfolioInterface{
    final private ArrayList<Asset> positions;
    private int cash;

    public Portfolio (){
        positions = new ArrayList<>();
        cash = 0;
    }

    @Override
    public void openPosition(Asset asset) {
        if (asset.getBuyInValue() > this.cash) {
            System.out.println("Transaction not successful: Not enough cash available.");
        } else {
            this.cash -= asset.getBuyInValue();
            this.positions.add(asset);
            System.out.println("Transaction successful.");
        }
    }

    @Override
    public void closePosition(Asset asset) {

    }

    @Override
    public void displayPositions() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Asset asset:positions) {
            stringBuilder.append(asset.toString());
            stringBuilder.append("\n");
        }

        if (stringBuilder.length() == 0) {
            System.out.println("There are no open positions in your portfolio.");
        } else {
            System.out.println(stringBuilder);
        }
    }

    @Override
    public void depositCash(int amount) {
        if (amount < 0) {
            System.out.println("Transaction not successful: The input needs to be greater or equal to zero.");
        } else {
            this.cash += amount;
            System.out.println("Transaction successful.");
        }
    }

    @Override
    public void withdrawCash(int amount) {
        if (amount < 0) {
            System.out.println("Transaction not successful: The input needs to be greater or equal to zero.");
        } else if (amount > this.cash) {
            System.out.println("Transaction not successful: Not enough cash available.");
        } else {
            this.cash += amount;
            System.out.println("Transaction successful.");
        }
    }

    @Override
    public void displayCash() {
        System.out.println("Current cash balance: " + this.cash);
    }
}
