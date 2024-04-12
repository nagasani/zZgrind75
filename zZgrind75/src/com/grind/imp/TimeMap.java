package com.grind.imp;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeMap {
	
	private Map<String, TreeMap<Integer, String>> map;

    /** Initialize your data structure here. */
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new TreeMap<>());
        }
        map.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        TreeMap<Integer, String> values = map.get(key);
        Integer floorTimestamp = values.floorKey(timestamp);
        if (floorTimestamp == null) {
            return "";
        }
        return values.get(floorTimestamp);
    }
}