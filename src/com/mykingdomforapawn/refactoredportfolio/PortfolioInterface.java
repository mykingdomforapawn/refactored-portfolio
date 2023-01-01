package com.mykingdomforapawn.refactoredportfolio;

public interface PortfolioInterface {

    void openPosition(Asset asset);
    void depositCash(int amount);
    void withdrawCash(int amount);
    void displayPositions();
    void displayCash();
}
