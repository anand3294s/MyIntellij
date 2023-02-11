package com.idea.readWriteFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFrmFileClass {

    public static String GREEN = "\u001B[32m";

    public static String BLACK = "\u001B[30m";

    public static String filePath;

    public static void main(String[] args) {

        filePath = "C:\\Users\\Surendra\\IdeaProjects\\MyIDEAProject\\src\\com\\idea\\readWriteFile\\file.txt";

        List<String> textToAdd = new ArrayList<>();

        textToAdd.add("The people of Wakanda fight to protect their home from intervening world powers as they mourn the death of King T'Challa.");
        textToAdd.add("Directed by Ryan Coogler");

        try {
            Files.write(Paths.get(filePath), textToAdd, StandardCharsets.UTF_8);
            System.out.println(GREEN + "Modified the file successfully..." + BLACK);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            List<String> textToRead = new ArrayList<>();

            textToRead = Files.readAllLines(Paths.get(filePath));

            for (String text : textToRead) {
                System.out.println(text);
            }

            System.out.println(GREEN + "File read successfully..." + BLACK);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
