package com.idea.indexfind;

public class GetIndexClass {
    public static String RESET = "\u001B[30m";
    public static String RED = "\u001B[31m";

    public static void main(String[] args) {
        String sentence = "This is Berk";
        int indexVal = sentence.indexOf('s', 4);
        System.out.println("The index of the character is: " + RED + indexVal + RESET);
    }

}
