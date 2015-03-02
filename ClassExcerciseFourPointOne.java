import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class ClassExcerciseFourPointOne {

	public static void main(String[] args) {

		int integerModifier;
		String usernameA, usernameB, passwordA, passwordB, usernameC, passwordC;
		boolean booleanMain = true;

		//JFrame Properties
		JFrame jf = new JFrame();
		jf.setLocationRelativeTo(null);
		jf.setTitle("Assignment 2");
		jf.toFront();
		jf.setAlwaysOnTop(true);
		
		//Ask for creation of username and password
		usernameA = JOptionPane.showInputDialog(jf,
				"Create a username:\n\n");
		
		passwordA = JOptionPane.showInputDialog(jf,
				"Create a password:\n\n");

		//This is Loop A(While Loop)

		while (booleanMain)
		{
			JOptionPane.showMessageDialog(jf,
				"Now type in your username and password. You have an unlimited amount of tries.");

			//Have user enter username and password that he chose
			usernameB = JOptionPane.showInputDialog(jf,
					"Type in your username:\n\n");
		
			passwordB = JOptionPane.showInputDialog(jf,
					"Type in your password:\n\n");
			
			//If username and password are correct, print welcome message and disable loop
			if (usernameB.equals(usernameA))
			{
				if (passwordB.equals(passwordA))
				{
					JOptionPane.showMessageDialog(jf,
							"Welcome, " + usernameA + "!");
					booleanMain = false;
				}
			}

			//If else, keep loop running
			else
			{
				JOptionPane.showMessageDialog(jf,
						"Wrong username or password! Please try again!\n\n");
			}
			
		}
		
		//This is Loop B(For Loop)

		if (!booleanMain)
		{

			JOptionPane.showMessageDialog(jf,
				"Now type in your username and password again. This time, you may only input it 3 times.");

			for (integerModifier = 1; integerModifier < 4; integerModifier ++)
			{

				//Have user enter username and password that he chose
				usernameC = JOptionPane.showInputDialog(jf,
						"Type in your username:\n\n");
		
				passwordC = JOptionPane.showInputDialog(jf,
						"Type in your password:\n\n");
			
				//If username and password are correct, print welcome message and disable loop
				if (usernameC.equals(usernameA))
				{
					if (passwordC.equals(passwordA))
					{
						JOptionPane.showMessageDialog(jf,
								"Welcome, " + usernameA + "!");
						integerModifier = 4;
					}
				}

				//If else, keep loop running
				else
				{
					JOptionPane.showMessageDialog(jf,
							"Wrong username or password! Please try again!\n\n");
				}
			}

			if (integerModifier == 4)
			{
				JOptionPane.showMessageDialog(jf,
					"Please contact your adminstrator to unlock your account!");
				System.exit(0);
			}

			if (integerModifier > 4)
			{
				System.exit(0);
			}
		}

	}
}