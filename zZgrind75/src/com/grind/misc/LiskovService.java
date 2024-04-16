package com.grind.misc;

public class LiskovService 
{
    public String printBookDetails(LiskovParent ll) {
        return ll.getDescription() + " costs $" + ll.getPrice();
    }
}
