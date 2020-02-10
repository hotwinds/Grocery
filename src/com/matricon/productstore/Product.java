package com.matricon.productstore;

import java.util.Date;

public class Product {
    private String name;
    private double price, cost;
    private String expirydate;
    private String description;
    private int qty;

    public Product() {}

    public Product(String name, double cost, double price, String expirydate, String description, int qty){
        this.name = name;
        this.cost = cost;
        this.price = price;
        this.expirydate = expirydate;
        this.description = description;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }
    public double getCost() {
        return cost;
    }
    public double getPrice() {
        return price;
    }
    public String getExpirydate() {
        return expirydate;
    }
    public String getDescription() {
        return description;
    }
    public int getQty() {return qty; }

    @Override
    public String toString() {
        return "Name = " + name + "; Cost = " + cost + "; Price = " + price + "; Expirydate = "
                + expirydate + "; Description = " + description;
    }
}
