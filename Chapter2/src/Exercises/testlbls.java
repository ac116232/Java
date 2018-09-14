package Exercises;

import java.util.Scanner;

public class testlbls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pounds;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your weight in lbs >>>>");
		pounds = input.nextInt();
		
		displayConversionToKilos(pounds);
	    displayConversionToOunces(pounds);
		displayConversionToMilligrams(pounds);
		
	}

	public static void displayConversionToKilos(int pounds) {
		
		double kilos; 
		kilos = pounds * (1 / 2.2);
		System.out.println("Your weight in kilos is " + kilos);

	}
	public static void displayConversionToOunces (int pounds) {
		
		int ounces;
		ounces = pounds * 16;
		System.out.println("Your weight in ounces is " + ounces);
	}
	public static void displayConversionToMilligrams(int pounds) {
		
		double milligrams;
		milligrams = pounds * 453592.37;
		System.out.println("Your weight in miligrams is " + milligrams);
			
	}

}
