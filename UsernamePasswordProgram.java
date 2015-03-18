/*
* Pseudocode:
*
* 1) Create usernames and passwords for each individual username; 1 Admin, 2 Staff, and 2 Students.
* 2) Make a for statement that has the first statement set a boolean to a specific type(For the loop), the second statement checking if an
*	integer(Set at 0 initially) is less than or equal to 2, and the final statement saying that after all the rest of the for statement
*	is completed, add 1 to the integer.
* 3) Inside this for statement, ask for user input on a username, as well as set the previous boolean to the opposite of what it was.(This is
*	to set the loop to stop until the loop gets triggered again.)
* 4) Check to see if the entered username is equal to any of the originals that were created; if so, change the previous integer to 4(Which
*	will stop the for statement from continuing the loop directly), enable the boolean that starts asking for the password, and enable a
*	boolean that represents that specific username.
* 5) If the entered username is not equal to any of the original usernames created, display the Invalid Username message, and set the boolean
*	(Step 2) representing the loop back to its original setting.
* 6) Say that if the previously mentioned integer is equal to 3, AND the boolean representing the start of entering the password is false,
*	which is its default status, display the Contact Administrator message and exit the program.
* 7) Make an if statement using the boolean mentioned in Step 6 to make sure that the password is only asked for after a correct username has
*	been entered.
* 8) Make a for statement that has the first statement set an integer to 0, the second statement checking if the integer is less than or
*	equal to 2, and the final statement saying that after all the rest of the for statement is completed, add 1 to the integer.
* 9) Inside this for statement, ask for user input on a password.
* 10) Check to see if the entered password is equal to any of the originals that were created; if so, change the previous integer to 5(Which
*	will stop the for statement from continuing the loop directly), show the Welcome message, set a String to Admin, Staff, or Student,
*	and tell the script to go to Part 2 of the script.(The part with the dropdown list)
* 11) If the entered password is not equal to any of the original passwords created, display the Invalid Password message.
* 12) Say that if the previously mentioned integer is equal to 3, display the Contact Administrator message and exit the program.
* 13) Make a section of the code that has the dropdown coding in that section.
* 14) Make a button that says OK.
* 15) Set a String, the default one, as the list of options in the dropdown as Select your account type.
* 16) Create a JComboBox involving the String, and then add the other options to the list.
* 17) Add an event listener for the ComboBox.
* 18) Add an event listener for the OK Button.
* 19) In this event listener, if the selected option from the dropdown list is Admin, do a switch case of checking what the String mentioned
*	in Step 10 is equal to, and, if the incorrect one, remind the user to pick the correct one, and, if the correct one, display the
*	message that explains what the user is able to do.
* 20) In this event listener, if the selected option from the dropdown list is Staff, do a switch case of checking what the String mentioned
*	in Step 10 is equal to, and, if the incorrect one, remind the user to pick the correct one, and, if the correct one, to display the
*	message that explains what the user is able to do.
* 21) In this event listener, if the selected option from the dropdown list is Student, do a switch case of checking what the String mentioned
*	in Step 10 is equal to, and, if the incorrect one, remind the user to pick the correct one, and, if the correct one, to display the
*	message that explains what the user is able to do.
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.util.Timer;

public class UsernamePasswordProgram extends JApplet {

	String statusOfLogin = "";

	public void init() {
		//Variables
		int integerUsername = 0;
		int integerPassword = 4;
		String username, password, usernameB, passwordB, usernameC, passwordC;
		String usernameD, passwordD, usernameE, passwordE;
		String usernameTry = "";
		String passwordTry = "";
		boolean usernameAttempt = false;
		boolean passwordAttempt = false;
		boolean usernameEntryA = false;
		boolean usernameEntryB = false;
		boolean usernameEntryC = false;
		boolean usernameEntryD = false;
		boolean usernameEntryE = false;
		boolean adminA = false;
		boolean staffB = false;
		boolean staffC = false;
		boolean studentD = false;
		boolean studentE = false;

		//JFrame - Pop up in Center of Screen
		JFrame jf = new JFrame();
		jf.setLocationRelativeTo(null);
		jf.toFront();

		//Create Username and Password
		username = JOptionPane.showInputDialog(jf,
				"Create the first username to make a list of usernames.\n"
				+ "This username is an Administrator's username:\n\n");
		password = JOptionPane.showInputDialog(jf,
				"Create a password for the Administrator username:\n\n");
		usernameB = JOptionPane.showInputDialog(jf,
				"Create the second username, which is a Staff username:\n\n");
		passwordB = JOptionPane.showInputDialog(jf,
				"Create a password for the Staff username:\n\n");
		usernameC = JOptionPane.showInputDialog(jf,
				"Create the third username, a secondary Staff's username:\n\n");
		passwordC = JOptionPane.showInputDialog(jf,
				"Create a password for that username:\n\n");
		usernameD = JOptionPane.showInputDialog(jf,
				"Create the fourth username, a Student's username:\n\n");
		passwordD = JOptionPane.showInputDialog(jf,
				"Create a password for the Student username:\n\n");
		usernameE = JOptionPane.showInputDialog(jf,
				"Create the fifth username, a Student's username:\n\n");
		passwordE = JOptionPane.showInputDialog(jf,
				"Create a password for that username:\n\n");
		JOptionPane.showMessageDialog(jf,
				"Now type in one of the usernames that you created, along with the associated password.\n"
				+ "You have 3 total attempts for the username, and 3 total" +
				" attempts for the password.");
		
		//Enter Username
		for (usernameAttempt = true; integerUsername <= 2; integerUsername++)
		{
			usernameTry = JOptionPane.showInputDialog(jf,
					"Enter your username:\n\n");
			usernameAttempt = false;

			//Check if username entered is equal to original
			if (usernameTry.equals(username))
			{
				integerUsername = 4;
				passwordAttempt = true;
				usernameEntryA = true;
			}
			
			else if (usernameTry.equals(usernameB))
			{
				integerUsername = 4;
				passwordAttempt = true;
				usernameEntryB = true;
			}
			
			else if (usernameTry.equals(usernameC))
			{
				integerUsername = 4;
				passwordAttempt = true;
				usernameEntryC = true;
			}
			
			else if (usernameTry.equals(usernameD))
			{
				integerUsername = 4;
				passwordAttempt = true;
				usernameEntryD = true;
			}
			
			else if (usernameTry.equals(usernameE))
			{
				integerUsername = 4;
				passwordAttempt = true;
				usernameEntryE = true;
			}
			
			else
			{
				JOptionPane.showMessageDialog(jf,
						"Invalid username. Please try again.");
				usernameAttempt = true;
			}

		}

		//Error Message for Username		
		if (integerUsername == 3)
		{
			if (!passwordAttempt)
			{
				JOptionPane.showMessageDialog(jf,
						"Username or Password is incorrect. Please contact your Administrator.");
				System.exit(0);
			}
		}
		
		//Enter Password
		if (passwordAttempt)
		{
			for (integerPassword = 0; integerPassword <= 2; integerPassword++)
			{
				passwordTry = JOptionPane.showInputDialog(jf,
						"Enter your password:\n\n");

				//Check if password entered is equal to original
				if (usernameEntryA)
				{
					if (passwordTry.equals(password))
					{
						integerPassword = 5;
						JOptionPane.showMessageDialog(jf,
								"Welcome, " + username + "!");
						statusOfLogin = "Admin";
						PartB();
					}
					else
					{
						JOptionPane.showMessageDialog(jf,
								"Invalid password. Please try again.");
					}
				}
			
				else if (usernameEntryB)
				{
					if (passwordTry.equals(passwordB))
					{
						integerPassword = 5;
						JOptionPane.showMessageDialog(jf,
								"Welcome, " + usernameB + "!");
						statusOfLogin = "Staff";
						PartB();
					}
					else
					{
						JOptionPane.showMessageDialog(jf,
								"Invalid password. Please try again.");
					}
				}
			
				else if (usernameEntryC)
				{
					if (passwordTry.equals(passwordC))
					{
						integerPassword = 5;
						JOptionPane.showMessageDialog(jf,
								"Welcome, " + usernameC + "!");
						statusOfLogin = "Staff";
						PartB();
					}
					else
					{
						JOptionPane.showMessageDialog(jf,
								"Invalid password. Please try again.");
					}
				}
			
				else if (usernameEntryD)
				{
					if (passwordTry.equals(passwordD))
					{
						integerPassword = 5;
						JOptionPane.showMessageDialog(jf,
								"Welcome, " + usernameD + "!");
						statusOfLogin = "Student";
						PartB();
					}
					else
					{
						JOptionPane.showMessageDialog(jf,
								"Invalid password. Please try again.");
					}
				}
			
				else if (usernameEntryE)
				{
					if (passwordTry.equals(passwordE))
					{
						integerPassword = 5;
						JOptionPane.showMessageDialog(jf,
								"Welcome, " + usernameE + "!");
						statusOfLogin = "Student";
						PartB();
					}
					else
					{
						JOptionPane.showMessageDialog(jf,
								"Invalid password. Please try again.");
					}
				}

			}
		}
		
		//Error Message for Password
		if (integerPassword == 3)
		{
			JOptionPane.showMessageDialog(jf,
					"Username or Password is incorrect. Please contact your Administrator.");
			System.exit(0);
		}
	}
	
	//Part B - Dropdown Options
	
	public void PartB() {
		
		//JFrame - Pop up in Center of Screen
		JFrame jf = new JFrame();
		jf.setLocationRelativeTo(null);
		jf.toFront();

		JButton selectOK = new JButton("                                OK");
		//Content Pane
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(new FlowLayout());
			
		String[] listOfOptions = new String[] { "Select your account type" };

		// Create a combo box with items specified in the String array
		final JComboBox<String> listOfOptionsList = new JComboBox<String>(listOfOptions);

		// List of options in dropdown
		listOfOptionsList.addItem("Admin");
		listOfOptionsList.addItem("Student");
		listOfOptionsList.addItem("Staff");

		// Add an event listener for the ComboBox
		listOfOptionsList.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unchecked")
				JComboBox<String> combo = (JComboBox<String>) e.getSource();
				String selectedOption = (String) combo.getSelectedItem();

				DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) combo.getModel();

				int selectedIndex = model.getIndexOf(selectedOption);
			}
		});

		// Add event listener for the OK button 
		selectOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) listOfOptionsList.getSelectedItem();
				//If Admin is selected
				if (selectedOption.equals("Admin"))
				{
					switch (statusOfLogin)
					{
					case "Admin":
						JOptionPane.showMessageDialog(jf,
								"Welcome, Administrator! You can update and read the file.\n"
								+ "This program will now exit.");
						System.exit(0);
						break;
					case "Staff":
						JOptionPane.showMessageDialog(jf,
								"Sorry, but you're the Staff, and not the Administrator!"
								+ "\nPlease select \"Staff\" and then click \"OK\" again.");
						break;
					default:
						JOptionPane.showMessageDialog(jf,
								"Sorry, but you're a Student, and not the Administrator!"
								+ "\nPlease select \"Student\" and then click \"OK\" again.");
						break;
					}
				}
				//If Staff is selected
				if (selectedOption.equals("Staff"))
				{
					switch (statusOfLogin)
					{
					case "Admin":
						JOptionPane.showMessageDialog(jf,
								"Sorry, but you're the Administrator, and not the Staff!"
								+ "\nPlease select \"Administrator\" and then click \"OK\" again.");
						break;
					case "Staff":
						JOptionPane.showMessageDialog(jf,
								"Welcome, Staff Member! You can update, read, add,\nand/or delete the file.\n"
								+ "This program will now exit.");
						System.exit(0);
						break;
					default:
						JOptionPane.showMessageDialog(jf,
								"Sorry, but you're a Student, and not the Staff!"
								+ "\nPlease select \"Student\" and then click \"OK\" again.");
						break;
					}
				}
				//If Student is selected
				if (selectedOption.equals("Student"))
				{
					switch (statusOfLogin)
					{
					case "Admin":
						JOptionPane.showMessageDialog(jf,
								"Sorry, but you're the Administrator, and not a Student!"
								+ "\nPlease select \"Administrator\" and then click \"OK\" again.");
						break;
					case "Staff":
						JOptionPane.showMessageDialog(jf,
								"Sorry, but you're the Staff, and not a Student!"
								+ "\nPlease select \"Staff\" and then click \"OK\" again.");
						break;
					default:
						JOptionPane.showMessageDialog(jf,
								"Welcome, Student! You can only read the file.\n"
								+ "This program will now exit.");
						System.exit(0);
						break;
					}
				}

			}
		});

		add(listOfOptionsList);
		add(selectOK);
	}
}
