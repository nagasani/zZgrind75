package com.grind.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableClass {
    private final int immutableField;
    private final String immutableString;
    private final List<String> immutableList;

    public ImmutableClass(int immutableField, String immutableString, List<String> immutableList) {
        this.immutableField = immutableField;
        this.immutableString = immutableString;
        this.immutableList = new ArrayList<>(immutableList); // Perform defensive copying
    }

    public int getImmutableField() {
        return immutableField;
    }

    public String getImmutableString() {
        return immutableString;
    }

    public List<String> getImmutableList() {    	
        return Collections.unmodifiableList(immutableList); // Return read-only view of the list
    }
}
