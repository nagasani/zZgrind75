package com.grind.misc;

public abstract class LiskovParent 
{
    protected String title;
    protected double price;

    public LiskovParent(String title, double price) 
    {
        this.title = title;
        this.price = price;
    }

    public abstract String getDescription();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) 
    {
        if (price < 0) 
        {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public String getTitle() 
    {
        return title;
    }
}
