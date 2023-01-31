package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println("Please enter a number for which you would like to see the Fibonacci sequence below:");
		System.out.println("***********************************************************************************");

		Scanner input = new Scanner(System.in);

		String inputString = input.nextLine();

		int inputNum = Integer.parseInt(inputString);

		int firstVal = 0;
		int secondVal = 1;

		System.out.print("0, ");

		if (inputNum <= 0) {
			System.out.print("1 ");


		} else {
			for (int newVal = 1; newVal <= inputNum; newVal = firstVal + secondVal) {
				firstVal = secondVal;
				secondVal = newVal;

				System.out.print(newVal + ", ");

			}

		}
	}
}
