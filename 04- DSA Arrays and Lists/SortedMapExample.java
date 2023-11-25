package com.example.DSA;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        // Create a SortedMap to store temperature data
        SortedMap<Integer, Double> temperatureData = new TreeMap<>();

        // Adding entries to the sorted map
        temperatureData.put(9, 25.5);
        temperatureData.put(12, 28.2);
        temperatureData.put(15, 30.0);
        temperatureData.put(18, 27.8);

        // Accessing values using keys
        int hour = 15;
        if (temperatureData.containsKey(hour)) {
            double temperature = temperatureData.get(hour);
            System.out.println("Temperature at " + hour + " o'clock: " + temperature + "°C");
        } else {
            System.out.println("No temperature data available for " + hour + " o'clock.");
        }

        // Iterating through the sorted map entries
        System.out.println("Temperature data:");
        for (Integer key : temperatureData.keySet()) {
            double temperature = temperatureData.get(key);
            System.out.println("Hour: " + key + " - Temperature: " + temperature + "°C");
        }

        // Getting the first and last entry (lowest and highest key)
        Integer firstHour = temperatureData.firstKey();
        Integer lastHour = temperatureData.lastKey();
        System.out.println("First hour: " + firstHour);
        System.out.println("Last hour: " + lastHour);

        // Getting a view of the entries within a specified range
        SortedMap<Integer, Double> subMap = temperatureData.subMap(10, 17);
        System.out.println("Temperature data from 10 o'clock to 17 o'clock:");
        for (Integer key : subMap.keySet()) {
            double temperature = subMap.get(key);
            System.out.println("Hour: " + key + " - Temperature: " + temperature + "°C");
        }

        // Removing an entry from the sorted map
        temperatureData.remove(12);

        // Checking if the sorted map is empty
        if (temperatureData.isEmpty()) {
            System.out.println("The sorted map is empty.");
        } else {
            System.out.println("The sorted map is not empty.");
        }
    }
}
