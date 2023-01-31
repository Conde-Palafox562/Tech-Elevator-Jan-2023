package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	// Create an input to have them tell us the temp
	// TemperatureStr.charAt(0);
	// Ask if it's celsius or fahrenheit
	// Check if the input is a C or F
	// Print out the results with System.out.println()
	// If celsius then convert to fahrenheit
	// Print out the results with System.out.println()
	// If fahrenheit then convert to celsius
	// Print out the results with System.out.println()

	public static void main(String[] args) {

		System.out.println("Please enter the temperature");

		Scanner input = new Scanner(System.in);

		String temperatureStr = input.nextLine();
		int temperatureInt = Integer.parseInt(temperatureStr);

		System.out.println("Is the temperature in (C)elsius, or (F)arenheit?\nEnter C for Celsius or F for Farenheit:");
		String optionsSelected = input.nextLine();

		if (optionsSelected.equals("C")) {
			double temperatureFahrenheit = temperatureInt * 1.8 + 32;

			System.out.println(temperatureStr + "C is " + temperatureFahrenheit + "F");

		}

		if (optionsSelected.equals("F")) {
			int temperatureCelsius = (int)((temperatureInt - 32) / 1.8);

			System.out.println(temperatureStr + "F is " + temperatureCelsius + "C");

		}

	}

}
