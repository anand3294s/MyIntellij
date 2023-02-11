package com.idea.randomstring;

import java.util.LinkedList;
import java.util.Random;

public class GenerateRandomString {

    public static final String GREEN = "\033[0;32m";
    public static final String RESET = "\033[0m";
    public static final String BLUE = "\033[0;34m";

    public GenerateRandomString() {
        System.out.println("This is constructor Block");
    }

    static {
        System.out.println("This is the static block");
    }

    public static void main(String[] args) {
        LinkedList<String> nList = new LinkedList<>();
        nList.add("Chips");
        nList.add("Cookie");
        nList.add("Muffin");
        nList.add("Chocolate");
        nList.add("Candy");
        nList.add("Mixture");
        nList.add("Kaara Sevu");

        Random rNum = new Random();

        int nListIndexRandom = rNum.nextInt(nList.size());

        System.out.println("Try eating this.... " + GenerateRandomString.BLUE + nList.get(nListIndexRandom) + GenerateRandomString.RESET);

    }
}
