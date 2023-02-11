package com.idea.randomstring;

import java.util.*;

public class RandomValueHash {

    public static String RESET = "\u001B[30m";
    public static String RED = "\u001B[31m";


    public static void main(String[] args) {

        HashMap<Integer, String> days = new HashMap<>();
        days.put(1, "Sunday");
        days.put(2, "Monday");
        days.put(3, "Tuesday");
        days.put(4, "Wednesday");
        days.put(5, "Thursday");
        days.put(6, "Friday");
        days.put(7, "Saturday");

        Random random = new Random();

        List<Integer> daysKeys = new ArrayList<>(days.keySet());

        int randomNumber = random.nextInt(daysKeys.size());

        int randomDaysKey = daysKeys.get(randomNumber);

        System.out.println("Random value printed from random key: " + RED + days.get(randomDaysKey) + RESET + " From the key: " + randomDaysKey);


    }
}
