package com.thushima.pokepizza.models;

public class Pizza extends Product {
    private String flavor;

    public Pizza() {
        super();
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}