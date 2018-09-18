package Exercises;

import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		int Total;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name? >>>");
		name = input.next();
		
	    System.out.println("Please enter a number >>>");
	    num1 = input.nextInt();
	    
	    System.out.println("Please enter a number >>>");
	    num2 = input.nextInt();
	    
	    Total = num1 + num2;
	
	    System.out.println("Your name is " + name);
        System.out.println("Please enter a number " + num1);
        System.out.println("Please enter a number " + num2);
        System.out.println("Your total is " + Total);  
	}

}
