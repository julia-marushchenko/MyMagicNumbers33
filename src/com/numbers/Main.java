package com.numbers;// Java program to find numbers can be divided by 3

// com.numbers.Main class
public class Main {

    // com.numbers.Main method to run java program
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Magic Numbers Representation:");

        // Creating and initialising array with numbers
        int [] arr = {7, 18, 12, 4, 3, 21};

        // Iterate through loop 6 times
        for (int index = 0; index < 6; index++) {

            // Checking if number are dividable by 3
            if (arr[index] % 3 == 0) {

                // Printing out the result
                System.out.println(arr[index] + " is dividable by 3.");

            } else {

                // Printing out the result
                System.out.println(arr[index] + " is not dividable by 3.");

            }
        }
    }
}