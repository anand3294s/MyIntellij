package com.idea.home;

import java.util.HashMap;

public class HashmapTestClass {

    public static void main(String[] args) {

        HashMap<Integer,String> caseDetails = new HashMap<>();

        caseDetails.put(11,"Customer Service");
        caseDetails.put(12,"ACC-Inside Sales");
        caseDetails.put(13,"Rivo");
        caseDetails.put(14, "Rivo Customer Service");

        caseDetails.entrySet().forEach(entry-> System.out.println(entry.getKey()+"#"+entry.getValue()));

        caseDetails.replace(13,"US Sales");

        caseDetails.entrySet().forEach(entry-> System.out.println(entry.getValue()));

    }




}
