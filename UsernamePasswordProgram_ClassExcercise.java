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

public class UsernamePasswordProgram_ClassExcercise extends JApplet {

	public void init() {
	
		//Variables
		
		//JFrame - Pop up in Center of Screen
		JFrame jf = new JFrame();
		jf.setLocationRelativeTo(null);
		jf.toFront();
		jf.setAlwaysOnTop(true);

		JButton selectOK = new JButton("                                OK");
		//Content Pane
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(new FlowLayout());
			
		String[] listOfOptions = new String[] { "Select your account type" };

		// Create a combo box with items specified in the String array
		final JComboBox<String> listOfOptionsList = new JComboBox<String>(listOfOptions);

		// List of options in dropdown
		listOfOptionsList.addItem("Administrator");
		listOfOptionsList.addItem("Faculty");
		listOfOptionsList.addItem("Staff");
		listOfOptionsList.addItem("Student");
		listOfOptionsList.addItem("Guest");

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

				//Display after option is chosen

				switch (selectedOption)
				{
					case "Administrator":
						JOptionPane.showMessageDialog(jf,
							"Welcome, Administrator!\n"
							+ "This program will now exit.");
						System.exit(0);
						break;
					case "Faculty":
						JOptionPane.showMessageDialog(jf,
							"Welcome, Faculty!\n"
							+ "This program will now exit.");
						System.exit(0);
						break;
					case "Staff":
						JOptionPane.showMessageDialog(jf,
							"Welcome, Staff!\n"
							+ "This program will now exit.");
						System.exit(0);
						break;
					case "Student":
						JOptionPane.showMessageDialog(jf,
							"Welcome, Student!\n"
							+ "This program will now exit.");
						System.exit(0);
						break;
					case "Guest":
						JOptionPane.showMessageDialog(jf,
							"Welcome, Guest!\n"
							+ "This program will now exit.");
						System.exit(0);
						break;
					default:
						JOptionPane.showMessageDialog(jf, "Please choose your account type...");
				}

			}
		});

		add(listOfOptionsList);
		add(selectOK);
	}
}
