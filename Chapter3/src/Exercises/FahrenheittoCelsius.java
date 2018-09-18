package Exercises;

import java.util.Scanner;

public class FahrenheittoCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double temp;
		
		System.out.println("What temp is it at 8 a.m.? >>>");
		temp = input.nextDouble();
		
		displayTemp(temp, 8);
		
		System.out.println("What temp is it at 12 p.m.? >>>");
		temp = input.nextDouble();
		
		displayTemp(temp, 12);
		
		System.out.println("What temp is it at 5 p.m.? >>>");
		temp = input.nextDouble();
		
		displayTemp(temp, 5);
		
		
		
	}
	public static void displayTemp (double temp, int time)	
	{	
		
	double celsius;
	celsius = (temp - 32) * 5/9;
	System.out.println("The temp in celsius at " + time + " is " + celsius);

		
	}

}
