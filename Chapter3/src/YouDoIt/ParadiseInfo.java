package YouDoIt;

import java.util.Scanner;

public class ParadiseInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price;
		double discount;
		double savings = 0;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter cutoff price for discount >>");
		price = keyboard.nextDouble();
		
		System.out.println("Enter discount rate as a whole number >>");
		discount = keyboard.nextDouble();
		
		System.out.println("Special this week on any service over " + price);
		System.out.println("Discount of " + discount + "percent");
		System.out.println("That's a savings of at least $" + savings);
	}

}
