package com.techelevator;

public class Scratch {

    public static void main(String[] args) {

       // int sum = 0;
       // for(int i = 10; i > 0; i -= 3) {
       //     sum += i;
      //  }

        String[] groceries = {"bread", "milk", "eggs"};

        System.out.println( groceries.length );

        //first.element
        System.out.println( groceries[0]);

        String last = groceries[ groceries.length-1 ];
        System.out.println(last);

        String element = groceries[1];
        System.out.println(element);

        // init and specified the condition
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello World " + i);

        }

        System.out.println("*****");

        for(int i = 0; i < groceries.length; i++) {
            System.out.println( groceries [i] + " is at index " + i);
        }

        System.out.println("*****");

        for(int i = groceries.length-1; i >= 0; i--) {
            System.out.println(groceries[i] + " is at index " + i);

        }

        System.out.println("*****");

        System.out.println("After the for loop");

        /*

        createArray(numOfElements 5);

        createArray(numOfElements 10);

        createArray(numOfElements 1000); */

    }

    public static void createArray(int numOfElements) {

        String[] myArray = new String[numOfElements];
        System.out.println("Length of my new array is" + myArray.length);

    }

}
