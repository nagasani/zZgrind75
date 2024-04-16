package com.grind.misc;

public class LiskovSecondChild extends LiskovParent {
    public LiskovSecondChild(String title, double price) {
        super(title, price);
    }

    @Override
    public String getDescription() {
        return "Non-Fiction Book: " + title;
    }
}
