package com.idea.enumClass;

import java.util.Scanner;

public class enumIMPClass {

    enum myENUM {
        CUSTOMER_SERVICE, RIVO, INSIDE_SALES

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Case Record Type:");

        String recordType = scan.nextLine();

        switch (myENUM.valueOf(recordType)) {

            case CUSTOMER_SERVICE: {
                System.out.println("This is  Customer Service case");
                break;
            }

            case INSIDE_SALES: {
                System.out.println("This is Inside Sales case");
                break;
            }
            case RIVO: {
                System.out.println("This is Rivo case");
                break;
            }

            default: System.out.println("No record type was found");
        }

    }
}
