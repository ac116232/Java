package Exercises;

public class NumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int z = 12;
				
		diplayTwiceTheNumber(x,z);
		displayNumberPlusFive(x,z);
		displayNumberSquared(x,z);
	}
	public static void diplayTwiceTheNumber(int x, int z) {
		int x1;
		int z1;
		x1 = x*2;
		z1 = z*2;
		diplayAnswers(x1, z1);
		
		
	}
	public static void displayNumberPlusFive(int x, int z) {
		int x1;
		int z1;
		x1 = x+5;
		z1 = z+5;
		System.out.println("x=" + x1 + " z=" + z1);
		
		
	}
	public static void displayNumberSquared(int x, int z) {
		int x1;
		int z1;
		x1 = x^2;
		z1 = z^2;
		System.out.println("x=" + x1 + " z=" + z1);
	}
	public static void diplayAnswers(int x, int z) {
		
		System.out.println("x=" + x + " z=" + z);
	}

}
