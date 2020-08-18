package com.thushima.pokepizza.models;

public class Pizza extends Product {
    private String flavor;

    public Pizza(int id, String name, String description, String type, float price, String flavor) {
        super(id, name, description, type, price);
        setFlavor(flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}