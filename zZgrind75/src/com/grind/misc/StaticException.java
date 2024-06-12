package com.grind.misc;
public class StaticException
{
    static {
        // This will throw an exception
        int x = 1 / 0;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Main method");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
