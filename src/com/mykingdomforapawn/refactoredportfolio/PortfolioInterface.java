package com.mykingdomforapawn.refactoredportfolio;

public interface PortfolioInterface {
    void openPosition(Asset asset);
    void closePosition(Asset asset);
    void depositCash(int amount) throws InvalidInputException;
    void withdrawCash(int amount);
    void displayPositions();
    void displayCash();
}
