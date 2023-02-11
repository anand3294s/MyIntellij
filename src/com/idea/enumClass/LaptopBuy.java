package com.idea.enumClass;

import java.util.Scanner;

public class LaptopBuy {

    public static String RESET = "\u001B[30m";
    public static String RED = "\u001B[31m";

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the laptop brand you want to buy: ");
        String laptop = scan.nextLine();
        switch (myLaptopEnums.valueOf(laptop.toUpperCase())) {
            case HP -> {
                System.out.println("I'm going to buy HP");
                break;
            }
            case DELL -> {
                System.out.println("I'm going to buy Dell");
                break;
            }
            case LENOVO -> {
                System.out.println("I'm going to buy Lenovo");
                break;
            }
            case ASUS -> {
                System.out.println("I'm going to buy Asus");
                break;
            }
            case APPLE -> {
                System.out.println("I'm going to buy Apple");
                break;
            }
            default -> {
                System.out.println("I don't have money");
            }

        }
    }
}
