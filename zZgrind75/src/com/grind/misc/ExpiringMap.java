package com.grind.misc;

import java.util.concurrent.*;
import java.util.*;

public class ExpiringMap<K, V> {
    private final ConcurrentHashMap<K, V> map = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<K, Long> timeMap = new ConcurrentHashMap<>();
    private final long expiryInMillis;
    private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    public ExpiringMap(long expiryInMillis) {
        this.expiryInMillis = expiryInMillis;
        executor.scheduleAtFixedRate(this::removeExpiredEntries, this.expiryInMillis, this.expiryInMillis, TimeUnit.MILLISECONDS);
    }

    public void put(K key, V value) {
        map.put(key, value);
        timeMap.put(key, System.currentTimeMillis() + expiryInMillis);
    }

    public V get(K key) {
        Long expiryTime = timeMap.get(key);
        if (expiryTime != null && System.currentTimeMillis() < expiryTime) {
            return map.get(key);
        }
        return null; // Return null if key is expired or not found
    }

    private void removeExpiredEntries() {
        long now = System.currentTimeMillis();
        timeMap.forEach((key, value) -> {
            if (value < now) { // Check if the entry is expired
                map.remove(key);
                timeMap.remove(key);
            }
        });
    }
}
