package Debugging;

public class FixDebugThree4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	      int myCredits = 13;
	      int yourCredits = 17;
	      double rate = 75.84;
	      System.out.println("My tuition:");
	      tuitionBill(rate, myCredits);
	      System.out.println("Your tuition:");
	      tuitionBill(rate, yourCredits);
	   }
	   public static void tuitionBill(double r, int c)
	   {
	     
		System.out.println("Total due " + (r*c));
	
		
	}

}
