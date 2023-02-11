package com.idea.threadingtest;

public class EndClass {

    void endRun() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("End printing...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
