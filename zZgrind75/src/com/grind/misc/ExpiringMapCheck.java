package com.grind.misc;
public class ExpiringMapCheck {
    public static void main(String[] args) throws InterruptedException {
        ExpiringMap<String, String> map = new ExpiringMap<>(5000); // Keys expire after 5 seconds
        map.put("key1", "value1");

        System.out.println(map.get("key1")); // Should print "value1"
        Thread.sleep(6000); // Wait for key to expire
        System.out.println(map.get("key1")); // Should print null
    }
}
