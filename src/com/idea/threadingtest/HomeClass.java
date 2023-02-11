package com.idea.threadingtest;

public class HomeClass {

    void homeRun() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("HomeClass printing...");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    synchronized void printVal(int a){
        for (int i = 2; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Value is: "+a*i);
        }
    }


}
