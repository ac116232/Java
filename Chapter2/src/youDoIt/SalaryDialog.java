package youDoIt;

import javax.swing.JOptionPane;

public class SalaryDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String wageString;
		String dependentsString;
		int dependents;
		double wage; 
		double weeklyPay;
		
		final double HOURS_IN_WEEK = 37.5;
		wageString = JOptionPane.showInputDialog(null,
				"Enter employee's hourly wage", "Salary dialog 1",
				JOptionPane.INFORMATION_MESSAGE);
		weeklyPay = Double.parseDouble(wageString) *
				HOURS_IN_WEEK;
		dependentsString = JOptionPane.showInputDialog(null,
				"How many dependents?", "Salary dialog 2", 
				JOptionPane.QUESTION_MESSAGE);
		dependents = Integer.parseInt(dependentsString);
		JOptionPane.showMessageDialog(null,  "Weekly Salary is $" +
		        weeklyPay + "\nDeductions will be made for " +
				dependents + "dependents");
		;
		
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
