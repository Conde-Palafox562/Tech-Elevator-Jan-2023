package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		System.out.println("Please enter the temperature");

		// Create an input to have them tell us the temp
		Scanner input = new Scanner(System.in);

		String temperatureStr = input.nextLine();
		int temperatureInt = Integer.parseInt(temperatureStr);
		//temperatureStr.charAt(0);

		// Ask if it's celsius or fahrenheit
		System.out.println("Is the temperature in (C)elsius, or (F)arenheit?");
		String optionsSelected = input.nextLine();

		// Check if the input is a C or F
		if (optionsSelected.equals("C")) {
			double temperatureFahrenheit = temperatureInt * 1.8 + 32;

			//print.out the results with the
			System.out.println(temperatureStr + "C is " + temperatureFahrenheit + "F");

		}

		// If Celsius then convert to fahrenheit
		if (optionsSelected.equals("F")) {
			int temperatureCelsius = (int)((temperatureInt - 32) / 1.8);

			//print.out the results with the
			System.out.println(temperatureStr + "F is " + temperatureCelsius + "C");

		}
		// If F then convert to Fahrenheit

		// Print out the results with the
		// System.out.print.ln



	}

}
