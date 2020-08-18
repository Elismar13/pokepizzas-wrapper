package com.thushima.pokepizza.models;

public class Product {
    private int id;
    private String name;
    private String description;
    private String type;
    private float price;

    public Product() {
        
    }

    public Product(int id, String name, String description, String type, float price) {
        setId(id);
        setName(name);
        setDescription(description);
        setType(type);
        setPrice(price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
