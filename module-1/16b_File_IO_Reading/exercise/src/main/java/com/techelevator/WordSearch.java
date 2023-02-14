package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

    // Use this scanner for all user input. Don't create additional Scanners with System.in
    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        WordSearch wordSearch = new WordSearch();
        wordSearch.run();
    }

    public void run() {
        /* Your code goes here */

        Scanner consoleInput = new Scanner(System.in);

        System.out.println("Please enter the file:");
        String fileName = consoleInput.nextLine();

        System.out.println("What is the search word you are looking for");
        String wordSearched = consoleInput.nextLine();

        //Case Sensitive:
        //Ask the user if it's case sensitive after the "wordSearched" consoleInput (see line 26)
        //"Should the search be case sensitive? (Y/N)" and then store it in a string
        System.out.println("Should the search be case sensitive? (Y/N)");
        String isCaseSensitive = consoleInput.nextLine();

        //Step 1: Create file object in Java
        File file = new File(fileName);

        //Step 2: Open a try with resources with a scanner
        try (Scanner fileScanner = new Scanner(file)) {
            //create a counter and start it at index 0
            int lineNumber = 0;


            //Step 3: read from the file as long as there is a new line to read
            //while loop to scan each line of text - check if there is a next line
            while (fileScanner.hasNextLine()) {

                //Step 4: read the line from the file and save it as a string
                //"string line" to store the next line
                String line = fileScanner.nextLine();
                //line counter ++ - increment line counter for each line that it loops through
                lineNumber++;

                //Now, in the while loop, we want to make a condition
                //for the program to continue scanning line by line

                if (isCaseSensitive.equalsIgnoreCase("N")) {
                    String lowercaseLine = line.toLowerCase(); // inside here, we don't care about case sensitivity

                    //this will automatically return what lowercase "wordsearched"
                    String lowercaseWordSearched = wordSearched.toLowerCase();

                    // now both lowercaseLine and lowercaseWordSearched Strings have been stored as lowercase

                    //if statement - search the line of text to see the word we are searching for is in there.
                    if (lowercaseLine.contains(lowercaseWordSearched)) {
                        //print out the line number
                        System.out.println(lineNumber + ") " + line);
                    }

                }

                //Step 5: implement an if or whatever business logic- we want to print
                // need an explanation for this
                else if (line.contains(wordSearched)) {
                    System.out.println(lineNumber + ") " + line);
                }

            }
            // I believe if the program fails or if the program couldn't find any words based on case sensitivity,
            // it will display the error "file was not found"
        } catch (FileNotFoundException ex) {
            System.out.println("File was not found");
        }

    }

}
