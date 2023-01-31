package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	// Prompt the user for a series of integers values separated by spaces
	// Separate each integer along with its equivalent binary value



	public static void main(String[] args) {


		System.out.println("**************************************************");

		System.out.println("*** Welcome to the Decimal to Binary Converter ***");

		System.out.println("**************************************************");

		System.out.println("Provide a series of numbers you would like to convert provided by spaces.\nExample: 460 8218 1 31313 987654321\nEnter your numbers below:");

		Scanner input = new Scanner(System.in);

		String inputString = input.nextLine();

		String[] decimalToBin = inputString.split(" ");


		for (int i = 0; i < decimalToBin.length; i++) {

			int binNo = Integer.parseInt(decimalToBin[i]);

			String resultOfDecToBin = Integer.toBinaryString(binNo);

			System.out.println("--------------------------------------------------");

			System.out.println("The number " + binNo + " in " + "binary is " + resultOfDecToBin);


		}

	}

}