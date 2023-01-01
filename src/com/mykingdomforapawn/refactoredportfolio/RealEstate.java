package com.mykingdomforapawn.refactoredportfolio;

public class RealEstate extends Asset {
    final private String name;
    final private int price;

    public RealEstate(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getValue() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Asset: Real Estate | Name: " + name + " | Price: " + price;
    }
}
