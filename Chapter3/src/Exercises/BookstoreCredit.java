package Exercises;

import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quartsNeeded;
		int gallonsNeeded;
		int extraQuarts;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter quarts needed>>>");
		quartsNeeded = input.nextInt();
		
		int quartsInGallons = 0;
		gallonsNeeded = quartsNeeded / quartsInGallons;
		extraQuarts = quartsNeeded % quartsInGallons;
		
		
		System.out.println("You have " + gallonsNeeded + " gallons and " 
		+ extraQuarts + " quarts left over");
		
		displayConversion(quartsNeeded);
		
		
	}	
		public static void displayConversion(int quartsNeeded) {
			final int quartsInGallons = 4;
			int gallonsNeeded;
			int extraQuarts;
			
			gallonsNeeded = quartsNeeded / quartsInGallons;
			extraQuarts = quartsNeeded % quartsInGallons;
			
			System.out.println(" You have " + gallonsNeeded + " gallons and " + extraQuarts + " quarts left over");
	}

}
