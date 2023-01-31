package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	// Create an input to have them tell us unit of measurement M(eter) or (F)eet
	// Use Double.parseDouble to allow decimals when people enter their values
	// Check if the input is M or F
	// Print out the results
	// If M(eter) then convert to (F)eet
	// Print.out the results
	// If F then convert to Fahrenheit
	// Print out the results

	public static void main(String[] args) {

		System.out.println("*** Welcome to the Linear Conversion Calculator ***");

		System.out.println("___________________________________________________");

		System.out.println("Please enter the length:");

		Scanner input = new Scanner(System.in);

		String length = input.nextLine();
		double unitOfMeasurement = Double.parseDouble(length);

		System.out.println("Use M for Meters or F for Feet!\nPlease enter your unit of measurement below:");
		String optionSelected = input.nextLine();

		if (optionSelected.equals("M")) {
			double uOMMeters = unitOfMeasurement * 3.2808399;

			System.out.println(length + " meters is " + uOMMeters + " feet");

		}

		if (optionSelected.equals("F")) {
			double uOMFeet = unitOfMeasurement * 0.3048;

			System.out.println(length + " feet is " + uOMFeet + " meters");

		}

	}

}
