package Exercises;

import java.util.Scanner;

public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		  final int INCHES_IN_FOOT = 12;
		     int inches;
		     int feet;
		     int inchesLeft;
		     Scanner input = new Scanner(System.in);
		     System.out.print("Enter inches >> ");
		     inches = input.nextInt();
		     feet = inches / INCHES_IN_FOOT;
		     inchesLeft = inches % INCHES_IN_FOOT;
		     System.out.println(inches + " inches is " +
		        feet + " feet and " + inchesLeft + " inches ");
		
			
		
		
		
		
	}

}
