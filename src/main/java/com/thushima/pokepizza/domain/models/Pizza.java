package com.thushima.pokepizza.domain.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Pizza extends Product {

    @NotBlank
    private String flavor;

    public Pizza() {

    }

    public Pizza(Long id, String name, String description, float price, String flavor) {
        super(id, name, description, price);
        setFlavor(flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}