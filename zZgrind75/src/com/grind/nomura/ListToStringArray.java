package com.grind.nomura;
import java.util.ArrayList;
import java.util.List;

public class ListToStringArray {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        // Convert the list to a string array
        String[] stringArray = listToArray(stringList);

        // Print the string array
        for (String str : stringArray) {
            System.out.println(str);
        }
    }

    public static String[] listToArray(List<String> list) {
        // Convert the list to a string array
        return list.toArray(new String[0]);
    }
}
