/**
 * This program uses methods in order to create three descriptions of rooms, each one different, and then
 * displays each room's description. This program can be easily altered in order to have a various number of
 * room descriptions, with each one having different attributes.
 *
 * @author		Evan Baker
 * @version		%I%, %G%
 * @since		1.0
 */

package houseProgramMain;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainProgram {

	public static void main(String[] args) {

		//Setting room attributes
		
		Room roomWallColor = new Room();
		Room roomFloorType = new Room();
		Room roomWindows = new Room();
		Room roomNumber = new Room();
		roomWallColor.setWallColor("yellow");
		roomFloorType.setFloorType("hard wood");
		roomWindows.setWindows(1);
		roomNumber.setRoomNumber(1);
		writeOutput();
		roomWallColor.setWallColor("purple");
		roomFloorType.setFloorType("tiled");
		roomWindows.setWindows(0);
		roomNumber.setRoomNumber(2);
		writeOutput();
		roomWallColor.setWallColor("white");
		roomFloorType.setFloorType("carpet");
		roomWindows.setWindows(3);
		roomNumber.setRoomNumber(3);
		writeOutput();
	}

	   //Output
	   public static void writeOutput() {
		   
		    //Set JFrame
			JFrame jf = new JFrame();
			jf.setLocationRelativeTo(null);
			jf.toFront();
			jf.setAlwaysOnTop(true);

			//Display
			JOptionPane.showMessageDialog(jf,
				   "Room " + Room.roomNumber + ":\n\n    Wall Color: " + Room.wallColor +
				   "\n    Floor Type: " + Room.floorType + "\n    Number of Windows: " + Room.windows);			
	    }
}
Evan Baker
Evan Baker
