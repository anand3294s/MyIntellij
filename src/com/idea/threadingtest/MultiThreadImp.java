package com.idea.threadingtest;

public class MultiThreadImp {
    public static void main(String[] args) throws InterruptedException {
        HomeClass hClass = new HomeClass();
        EndClass eClass = new EndClass();

        Thread tOne = new Thread() {

            public void run() {
//                hClass.homeRun();
                hClass.printVal(5);
            }
        };

        Thread tTwo = new Thread() {

            public void run() {
//                eClass.endRun();
                hClass.printVal(6);
            }
        };

        tOne.start();
        tTwo.start();

        tOne.join();
        tTwo.join();



        System.out.println("End of Code");

    }


}
