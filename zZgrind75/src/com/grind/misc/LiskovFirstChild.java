package com.grind.misc;
public class LiskovFirstChild extends LiskovParent 
{
    public LiskovFirstChild(String title, double price) {
        super(title, price);
    }

    @Override
    public String getDescription() {
        return "Fiction Book: " + title;
    }
}

