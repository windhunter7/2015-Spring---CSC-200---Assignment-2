/**
 * Pseudocode:
 * 		Name Variables
 * 		Solve Basic Calculations from Table
 * 		Prompt user to enter five numbers, which will be converted to the format double
 * 		To Find Mode - calculate if each number is identical to another of the five numbers; if so, make the boolean
 * 				that represents that equality equal to true; for the ones that are true, make the integer that
 * 				represents them equal to zero, to represent that it shouldn't be shown; for the values that are
 * 				marked as equal to zero for the integer representation, make if statements designating that if the
 * 				original numbers are greater than or equal to the other original numbers, set another boolean to say
 * 				that that is true; create String versions of the original numbers; for the ones that meet the
 * 				previous boolean value, make a String that is ordinarily blank turned into the String form of the
 * 				number + a newline(So as to separate the Modes that do exist)
 * 		To Find Range Max - Create if statements, designating that if one of the original numbers is greater than
 * 				or equal to all of the other original numbers, set a boolean representing that fact as true; for the
 * 				numbers that meet this criteria, set a String that is ordinarily set to 0 to the original number
 * 		To Find Range Min - Create if statements, designating that if one of the original numbers is less than
 * 				or equal to all of the other original numbers, set a boolean representing that fact as true; for the
 * 				numbers that meet this criteria, set a String that is ordinarily set to 0 to the original number
 * 		Show the calculated values, including the other, more simple, values
 */

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.text.DecimalFormat;

public class Assignment_ExpressionSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Naming variables for numbers, etc. in case you want to change the variables at all from the numbers
		//listed in the table
		int one = 1;
		int two = 2;
		int three = 3;
		int four = 4;
		int five = 5;
		int six = 6;
		int seven = 7;
		int thirteen = 13;
		int thirtyFive = 35;
		double onePointZero = 1.0;
		double threePointFive = 3.5;
		char characterA = ' ';
		String stringA = "Beat";
		String stringB = "Army";

		//variables for finding Range
		boolean numberRangeA = false;
		boolean numberRangeB = false;
		boolean numberRangeC = false;
		boolean numberRangeD = false;
		boolean numberRangeE = false;

		boolean numberRangeMinA = false;
		boolean numberRangeMinB = false;
		boolean numberRangeMinC = false;
		boolean numberRangeMinD = false;
		boolean numberRangeMinE = false;

		double numberARangeString = 0.0;
		double numberBRangeString = 0.0;
		double numberCRangeString = 0.0;
		double numberDRangeString = 0.0;
		double numberERangeString = 0.0;

		double numberARangeMinString = 0.0;
		double numberBRangeMinString = 0.0;
		double numberCRangeMinString = 0.0;
		double numberDRangeMinString = 0.0;
		double numberERangeMinString = 0.0;

		//The below variables are for finding the Mode
		boolean numberAEqualB = false;
		boolean numberAEqualC = false;
		boolean numberAEqualD = false;
		boolean numberAEqualE = false;
		
		boolean numberBEqualC = false;
		boolean numberBEqualD = false;
		boolean numberBEqualE = false;
		
		boolean numberCEqualD = false;
		boolean numberCEqualE = false;
		
		boolean numberDEqualE = false;
		
		int numberB = 1;
		int numberC = 1;
		int numberD = 1;
		int numberE = 1;
		
		boolean numberALargest = false;
		boolean numberBLargest = false;
		boolean numberCLargest = false;
		boolean numberDLargest = false;
		boolean numberELargest = false;
		
		String numberAModeString = "";
		String numberBModeString = "";
		String numberCModeString = "";
		String numberDModeString = "";
		String numberEModeString = "";
		
		//Make JFrame(jf) pop up in front of all other windows, in the center of the screen.
		JFrame jf = new JFrame();
		jf.setLocationRelativeTo(null);
		jf.setTitle("Assignment 2");
		jf.toFront();
		jf.setAlwaysOnTop(true);
		
		//Normal JOptionPanes for showing what the numbers and Strings multiplied, etc. together yield
		
		//1 / 2
		JOptionPane.showMessageDialog(jf,
				"For the expression\n" + one + " / " + two + "\nThe result(In integer format) is\n"
				+ (one / two));
		//1 % 2
		JOptionPane.showMessageDialog(jf,
				"For the expression\n" + one + " % " + two + "\nThe result(In integer format) is\n"
				+ (one % two));
		//1.0 / 2
		JOptionPane.showMessageDialog(jf,
				"For the expression\n" + onePointZero + " / " + two + "\nThe result(In decimal format) is\n"
				+ (onePointZero / two));
		//5 + 7 / 2
		JOptionPane.showMessageDialog(jf,
				"For the expression\n" + five + " + " + seven + " / " + two + "\nThe result(In integer format) is\n"
				+ (five + seven / two));
		//"Beat" + ' ' + "Army"
		JOptionPane.showMessageDialog(jf,
				"For the expression\n\"" + stringA + "\" + \'" + characterA + "\' + \"" + stringB +
				"\"\nThe result(In String format) is\n"
				+ stringA + characterA + stringB);
		//6 + 13 / 5 - 35 % 3
		JOptionPane.showMessageDialog(jf,
				"For the expression\n" + six + " + " + thirteen + " / " + five + " - " + thirtyFive + " % " + three +
				"\nThe result(In integer format) is\n"
				+ (six + thirteen / five - thirtyFive % three));
		//3.5 * (5/4)
		JOptionPane.showMessageDialog(jf,
				"For the expression\n" + threePointFive + " * " + "(" + five + "/" + four + ")" +
				"\nThe result(In decimal format) is\n"
				+ (threePointFive * (five / four)) + "\nThe reason that this is not 4.375 is that\n" +
				"the (" + five + " / " + four + ") is in parentheses, so it gets divided in integer\nform before" +
				" being multiplied by the " + threePointFive);
		//(3.5*5)/4
		JOptionPane.showMessageDialog(jf,
				"For the expression\n" + "(" + threePointFive + " * " + five + ")/" + four +
				"\nThe result(In decimal format) is\n"
				+ ((threePointFive*five)/four));

		//Prompt for user to enter five numbers, then convert them to double format
		String jOptionPaneNumbersA =
				JOptionPane.showInputDialog(jf, "This program will now do a series of things regarding" +
				"\nthe numbers that you will now put in, involving five numbers.\n\n" +
				"Enter the first number in the series:");
		String jOptionPaneNumbersB =
				JOptionPane.showInputDialog(jf, "Enter the second number in the series:");
		String jOptionPaneNumbersC =
				JOptionPane.showInputDialog(jf, "Enter the third number in the series:");
		String jOptionPaneNumbersD =
				JOptionPane.showInputDialog(jf, "Enter the fourth number in the series:");
		String jOptionPaneNumbersE =
				JOptionPane.showInputDialog(jf, "Enter the fifth(And final) number in the series:");
		double numbersConvertedA = Double.parseDouble(jOptionPaneNumbersA);
		double numbersConvertedB = Double.parseDouble(jOptionPaneNumbersB);
		double numbersConvertedC = Double.parseDouble(jOptionPaneNumbersC);
		double numbersConvertedD = Double.parseDouble(jOptionPaneNumbersD);
		double numbersConvertedE = Double.parseDouble(jOptionPaneNumbersE);
		double numbersAdded = numbersConvertedA + numbersConvertedB + numbersConvertedC + numbersConvertedD +
				numbersConvertedE;
		
		//If statements to calculate which numbers are equal to each other
		
		//If the numbers are equal, set the booleans representing them to true
		if (numbersConvertedA == numbersConvertedB)
		{
			numberAEqualB = true;
		}

		if (numbersConvertedA == numbersConvertedC)
		{
			numberAEqualC = true;
		}

		if (numbersConvertedA == numbersConvertedD)
		{
			numberAEqualD = true;
		}

		if (numbersConvertedA == numbersConvertedE)
		{
			numberAEqualE = true;
		}

		if (numbersConvertedB == numbersConvertedC)
		{
			numberBEqualC = true;
		}

		if (numbersConvertedB == numbersConvertedD)
		{
			numberBEqualD = true;
		}

		if (numbersConvertedB == numbersConvertedE)
		{
			numberBEqualE = true;
		}

		if (numbersConvertedC == numbersConvertedD)
		{
			numberCEqualD = true;
		}

		if (numbersConvertedC == numbersConvertedE)
		{
			numberCEqualE = true;
		}

		if (numbersConvertedD == numbersConvertedE)
		{
			numberDEqualE = true;
		}

		//Determining Mode, part A
		
		if (numberAEqualB)
		{
			numberB = 0;
		}

		if (numberAEqualC)
		{
			numberC = 0;
		}

		if (numberAEqualD)
		{
			numberD = 0;
		}

		if (numberAEqualE)
		{
			numberE = 0;
		}

		if (numberBEqualC)
		{
			numberC = 0;
		}

		if (numberBEqualD)
		{
			numberD = 0;
		}

		if (numberBEqualE)
		{
			numberE = 0;
		}

		if (numberCEqualD)
		{
			numberD = 0;
		}

		if (numberCEqualE)
		{
			numberE = 0;
		}

		if (numberDEqualE)
		{
			numberE = 0;
		}

		//Determining Mode, Part B
		
		//numberA
		if (numberB == 0)
		{
			if (numbersConvertedA >= numbersConvertedC)
			{
				if (numbersConvertedA >= numbersConvertedD)
				{
					if (numbersConvertedA >= numbersConvertedE)
					{
						numberALargest = true;
					}
				}
			}
		}
		if (numberC == 0)
		{
			if (numbersConvertedA >= numbersConvertedB)
			{
				if (numbersConvertedA >= numbersConvertedD)
				{
					if (numbersConvertedA >= numbersConvertedE)
					{
						numberALargest = true;
					}
				}
			}
		}
		if (numberD == 0)
		{
			if (numbersConvertedA >= numbersConvertedC)
			{
				if (numbersConvertedA >= numbersConvertedB)
				{
					if (numbersConvertedA >= numbersConvertedE)
					{
						numberALargest = true;
					}
				}
			}
		}
		if (numberE == 0)
		{
			if (numbersConvertedA >= numbersConvertedC)
			{
				if (numbersConvertedA >= numbersConvertedD)
				{
					if (numbersConvertedA >= numbersConvertedB)
					{
						numberALargest = true;
					}
				}
			}
		}

		//numberB
		if (numberB == 0)
		{
			if (numbersConvertedB >= numbersConvertedC)
			{
				if (numbersConvertedB >= numbersConvertedD)
				{
					if (numbersConvertedB >= numbersConvertedE)
					{
						numberBLargest = true;
					}
				}
			}
		}
		if (numberC == 0)
		{
			if (numbersConvertedB >= numbersConvertedA)
			{
				if (numbersConvertedB >= numbersConvertedD)
				{
					if (numbersConvertedB >= numbersConvertedE)
					{
						numberBLargest = true;
					}
				}
			}
		}
		if (numberD == 0)
		{
			if (numbersConvertedB >= numbersConvertedC)
			{
				if (numbersConvertedB >= numbersConvertedA)
				{
					if (numbersConvertedB >= numbersConvertedE)
					{
						numberBLargest = true;
					}
				}
			}
		}
		if (numberE == 0)
		{
			if (numbersConvertedB >= numbersConvertedC)
			{
				if (numbersConvertedB >= numbersConvertedD)
				{
					if (numbersConvertedB >= numbersConvertedA)
					{
						numberBLargest = true;
					}
				}
			}
		}
		
		//numberC
		if (numberC == 0)
		{
			if (numbersConvertedC >= numbersConvertedA)
			{
				if (numbersConvertedC >= numbersConvertedD)
				{
					if (numbersConvertedC >= numbersConvertedE)
					{
						numberCLargest = true;
					}
				}
			}
			if (numbersConvertedC >= numbersConvertedB)
			{
				if (numbersConvertedC >= numbersConvertedD)
				{
					if (numbersConvertedC >= numbersConvertedE)
					{
						numberCLargest = true;
					}
				}
			}
		}
		if (numberD == 0)
		{
			if (numbersConvertedC >= numbersConvertedA)
			{
				if (numbersConvertedC >= numbersConvertedB)
				{
					if (numbersConvertedC >= numbersConvertedE)
					{
						numberCLargest = true;
					}
				}
			}
		}
		if (numberE == 0)
		{
			if (numbersConvertedC >= numbersConvertedA)
			{
				if (numbersConvertedC >= numbersConvertedB)
				{
					if (numbersConvertedC >= numbersConvertedD)
					{
						numberCLargest = true;
					}
				}
			}
		}

		//numberD
		if (numberD == 0)
		{
			if (numbersConvertedD >= numbersConvertedA)
			{
				if (numbersConvertedD >= numbersConvertedB)
				{
					if (numbersConvertedD >= numbersConvertedE)
					{
						numberDLargest = true;
					}
				}
			}
			if (numbersConvertedD >= numbersConvertedA)
			{
				if (numbersConvertedD >= numbersConvertedC)
				{
					if (numbersConvertedD >= numbersConvertedE)
					{
						numberDLargest = true;
					}
				}
			}
			if (numbersConvertedD >= numbersConvertedB)
			{
				if (numbersConvertedD >= numbersConvertedC)
				{
					if (numbersConvertedD >= numbersConvertedE)
					{
						numberDLargest = true;
					}
				}
			}
		}
		if (numberE == 0)
		{
			if (numbersConvertedD >= numbersConvertedA)
			{
				if (numbersConvertedD >= numbersConvertedB)
				{
					if (numbersConvertedD >= numbersConvertedC)
					{
						numberDLargest = true;
					}
				}
			}
		}

		//numberE
		if (numberE == 0)
		{
			if (numbersConvertedE >= numbersConvertedB)
			{
				if (numbersConvertedE >= numbersConvertedC)
				{
					if (numbersConvertedE >= numbersConvertedD)
					{
						numberELargest = true;
					}
				}
			}
			if (numbersConvertedE >= numbersConvertedA)
			{
				if (numbersConvertedE >= numbersConvertedC)
				{
					if (numbersConvertedE >= numbersConvertedD)
					{
						numberELargest = true;
					}
				}
			}
			if (numbersConvertedE >= numbersConvertedA)
			{
				if (numbersConvertedE >= numbersConvertedB)
				{
					if (numbersConvertedE >= numbersConvertedD)
					{
						numberELargest = true;
					}
				}
			}
			if (numbersConvertedE >= numbersConvertedA)
			{
				if (numbersConvertedE >= numbersConvertedB)
				{
					if (numbersConvertedE >= numbersConvertedC)
					{
						numberELargest = true;
					}
				}
			}
		}
		
		//Determining Mode, Part C
		
		String numberAString = String.valueOf(numbersConvertedA);
		String numberBString = String.valueOf(numbersConvertedB);
		String numberCString = String.valueOf(numbersConvertedC);
		String numberDString = String.valueOf(numbersConvertedD);
		String numberEString = String.valueOf(numbersConvertedE);

		if (numberALargest)
		{
			numberAModeString = (numberAString + "\n");
		}
		if (numberBLargest)
		{
			numberBModeString = (numberBString + "\n");
		}
		if (numberCLargest)
		{
			numberCModeString = (numberCString + "\n");
		}
		if (numberDLargest)
		{
			numberDModeString = (numberDString + "\n");
		}
		if (numberELargest)
		{
			numberEModeString = (numberEString + "\n");
		}
		
		//For finding Range, Part A
		
		if (numbersConvertedA >= numbersConvertedB)
		{
			if (numbersConvertedA >= numbersConvertedC)
			{
				if (numbersConvertedA >= numbersConvertedD)
				{
					if (numbersConvertedA >= numbersConvertedE)
					{
						numberRangeA = true;
					}
				}
			}
		}
		if (numbersConvertedB >= numbersConvertedA)
		{
			if (numbersConvertedB >= numbersConvertedC)
			{
				if (numbersConvertedB >= numbersConvertedD)
				{
					if (numbersConvertedB >= numbersConvertedE)
					{
						numberRangeB = true;
					}
				}
			}
		}
		if (numbersConvertedC >= numbersConvertedB)
		{
			if (numbersConvertedC >= numbersConvertedA)
			{
				if (numbersConvertedC >= numbersConvertedD)
				{
					if (numbersConvertedC >= numbersConvertedE)
					{
						numberRangeC = true;
					}
				}
			}
		}
		if (numbersConvertedD >= numbersConvertedB)
		{
			if (numbersConvertedD >= numbersConvertedC)
			{
				if (numbersConvertedD >= numbersConvertedA)
				{
					if (numbersConvertedD >= numbersConvertedE)
					{
						numberRangeD = true;
					}
				}
			}
		}
		if (numbersConvertedE >= numbersConvertedB)
		{
			if (numbersConvertedE >= numbersConvertedC)
			{
				if (numbersConvertedE >= numbersConvertedD)
				{
					if (numbersConvertedE >= numbersConvertedA)
					{
						numberRangeE = true;
					}
				}
			}
		}

		if (numberRangeA)
		{
			numberARangeString = numbersConvertedA;
		}
		if (numberRangeB)
		{
			numberBRangeString = numbersConvertedB;
		}
		if (numberRangeC)
		{
			numberCRangeString = numbersConvertedC;
		}
		if (numberRangeD)
		{
			numberDRangeString = numbersConvertedD;
		}
		if (numberRangeE)
		{
			numberERangeString = numbersConvertedE;
		}
		
		//For finding Range, Part B
		
		if (numbersConvertedA <= numbersConvertedB)
		{
			if (numbersConvertedA <= numbersConvertedC)
			{
				if (numbersConvertedA <= numbersConvertedD)
				{
					if (numbersConvertedA <= numbersConvertedE)
					{
						numberRangeMinA = true;
					}
				}
			}
		}
		if (numbersConvertedB <= numbersConvertedA)
		{
			if (numbersConvertedB <= numbersConvertedC)
			{
				if (numbersConvertedB <= numbersConvertedD)
				{
					if (numbersConvertedB <= numbersConvertedE)
					{
						numberRangeMinB = true;
					}
				}
			}
		}
		if (numbersConvertedC <= numbersConvertedB)
		{
			if (numbersConvertedC <= numbersConvertedA)
			{
				if (numbersConvertedC <= numbersConvertedD)
				{
					if (numbersConvertedC <= numbersConvertedE)
					{
						numberRangeMinC = true;
					}
				}
			}
		}
		if (numbersConvertedD <= numbersConvertedB)
		{
			if (numbersConvertedD <= numbersConvertedC)
			{
				if (numbersConvertedD <= numbersConvertedA)
				{
					if (numbersConvertedD <= numbersConvertedE)
					{
						numberRangeMinD = true;
					}
				}
			}
		}
		if (numbersConvertedE <= numbersConvertedB)
		{
			if (numbersConvertedE <= numbersConvertedC)
			{
				if (numbersConvertedE <= numbersConvertedD)
				{
					if (numbersConvertedE <= numbersConvertedA)
					{
						numberRangeMinE = true;
					}
				}
			}
		}

		if (numberRangeMinA)
		{
			numberARangeMinString = numbersConvertedA;
		}
		if (numberRangeMinB)
		{
			numberBRangeMinString = numbersConvertedB;
		}
		if (numberRangeMinC)
		{
			numberCRangeMinString = numbersConvertedC;
		}
		if (numberRangeMinD)
		{
			numberDRangeMinString = numbersConvertedD;
		}
		if (numberRangeMinE)
		{
			numberERangeMinString = numbersConvertedE;
		}

		//Set decimals to specific decimal amounts
		
		//Addition, etc. before putting these values into the JOptionPane, to make it easier to read
		String numberModeStringsAdded = (numberAModeString +
				numberBModeString +
				numberCModeString +
				numberDModeString +
				numberEModeString);
		double numberRangeMinAdded = (numberARangeMinString + numberBRangeMinString +
				numberCRangeMinString + numberDRangeMinString + numberERangeMinString);
		double numberRangeMaxAdded = (numberARangeString + numberBRangeString +
				numberCRangeString + numberDRangeString + numberERangeString);
		String numberMinAdded = (numberARangeMinString + ", " + numberBRangeMinString +
				", " + numberCRangeMinString + ", " + numberDRangeMinString + ", " + numberERangeMinString);
		String numberMaxAdded = (numberARangeString + ", " + numberBRangeString + ", " +
				numberCRangeString + ", " + numberDRangeString + ", " + numberERangeString);
		
		//Displaying the users' entered data, first in comma form, then showing the calculations
		JOptionPane.showMessageDialog(jf,
				"The numbers you entered are:\n" +
						numbersConvertedA + ", " + numbersConvertedB + ", " +
						numbersConvertedC + ", " + numbersConvertedD + ", and " +
						numbersConvertedE +
				"\nSum: " + numbersAdded +
				"\nMin: " + numberMinAdded +
				"\nMax: " + numberMaxAdded +
				"\nMean(Average): " + (numbersAdded / 5) +
				"\nMedian: " + numbersConvertedC +
				"\nMode(s):\n" + numberModeStringsAdded +
				"\nRange: " + (numberRangeMaxAdded - numberRangeMinAdded));
		
		System.exit(0);
	}

}
