package com.idea.randomDictionaryWord;



import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandDictWordClass {

    public static String RED = "\u001b[31m";
    public static String RESET = "\u001b[30m";

//    public static Logger log = LogManager.getLogger(RandDictWordClass.class);

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Surendra\\IdeaProjects\\MyIDEAProject\\src\\com\\idea\\wordss.txt";
        Scanner scan = null;
        List<String> dictionary;

//        log.info("trying...");


        try {
            scan = new Scanner(new File(filePath));
            dictionary = new ArrayList<>();

            while (scan.hasNext()) {
                dictionary.add(scan.next());
            }

            Random random = new Random();
            int randomIndexNum = random.nextInt(dictionary.size());

            System.out.println("Random word from dictionary: " + RED + dictionary.get(randomIndexNum) + RESET);
//            log.info("printed a random word in dictionary");
            scan.close();
        } catch (Exception e) {
//            throw new RuntimeException(e);
//            e.printStackTrace();
//            log.error("File might be missing", e);

        } finally {
//            System.out.println("Tried to open the file");
//            log.info("done....");
        }


    }
}
