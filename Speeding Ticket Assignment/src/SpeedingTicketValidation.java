/**
 * @author Robert Giurgiulescu <s4820793@bournemouth.ac.uk>
 * @id number s4820793
 * @version 6
 * 
 * Date: 06/04/2018
 * Class (4/4)
 * 
 * This class mainly contains validation JOptionPane message methods, which are accessed by the SpeedingTicket, 
 * SpeedingTicketGUI and the SpeedingTicketWrite classes when needed. It also have different methods which 
 * stores data, and they are accessed when the GUI needs them.
 */


import javax.swing.*;
import java.util.Calendar;


class SpeedingTicketValidation {

	//Starting validation for the SpeedingTicket class

	/**
	 * This method displays a JOptionPane dialog error message saying the following: Not allowed vehicle speeds higher than 275mph
	 */
	void vehicleSpeedNotHigherThan275() {
		JOptionPane.showMessageDialog(new JFrame(), "Not allowed vehicle speeds higher than 275mph", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following: Not allowed speed limits higher than 70mph
	 */
	void speedLimitNoHigherThan150() {
		JOptionPane.showMessageDialog(new JFrame(), "Not allowed speed limits higher than 150mph", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following: Not allowed speed limits lower than 5mph
	 */
	void speedLimitNoLowerThan5() {
		JOptionPane.showMessageDialog(new JFrame(), "Not allowed speed limits lower than 5mph", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	//Starting validation for the SpeedingTicketGUI class

	/**
	 * This method displays a JOptionPane dialog error message saying the following: No speeds entered
	 */
	void noSpeedsEntered() {
		JOptionPane.showMessageDialog(new JFrame(), "        No speeds entered", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following: Speed limit not entered
	 */
	void noSpeedLimitEntered() {
		JOptionPane.showMessageDialog(new JFrame(), "  Speed limit not entered", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following: Vehicle speed not entered
	 */
	void noVehicleSpeedEntered() {
		JOptionPane.showMessageDialog(new JFrame(), "     Vehicle speed not entered", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * This method takes in a <code>string</code> parameter and checks if the string
	 * contains any special characters. 
	 * @param string The string which will be checked
	 * @return True if the string does not contain special characters, False otherwise
	 */
	boolean isStringValid(String string) {
		return string.matches("[a-zA-Z0-9 ] + ");
	}

	/**
	 * This method takes in a <code>string</code> parameter and checks if it contains double spaces or
	 * starts/ends with a space.
	 * @param string The string which will be checked
	 * @return True if the string contains double spaces or starts/ends with a space. False otherwise.
	 */
	boolean areEmptySpacesValidation(String string) {
		return string.contains("  ") || string.startsWith(" ") || string.endsWith(" ");
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following:
	 * There is one or more fields not completed, please complete all the fields to continue
	 */
	void fieldsIncompleted() {
		JOptionPane.showMessageDialog(new JFrame(), "There is one or more fields not completed, please complete all the fields to continue", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following:
	 * Location cannot start/end with a space, contain double empty spaces, contain special characters, be longer than 30 chars.
	 */
	void errorsInLocation() {
		JOptionPane.showMessageDialog(new JFrame(), "Location cannot:\n- Start/end with a space\n- Contain double empty spaces\n- Contain special characters\n- Be longer than 30 chars", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following:
	 * File name cannot start/end with a space, contain double empty spaces, contain special characters, be longer than 25 chars.
	 */
	void errorsInFileName() {
		JOptionPane.showMessageDialog(new JFrame(), "File name cannot:\n- Start/end with a space\n- Contain double empty spaces\n- Contain special characters\n- Be longer than 25 chars", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following:
	 * Registration number must have 1 to 7 digits without spaces or special characters
	 */
	void errorsInRegNo() {
		JOptionPane.showMessageDialog(new JFrame(), "Registration number must have 1 to 7 digits without spaces or special characters", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following:
	 * Speed Limit or Vehicle Speed are invalid, please type in numbers
	 */
	void invalidSpeedLimitAndVehicleSpeed() {
		JOptionPane.showMessageDialog(new JFrame(), "Speed Limit or Vehicle Speed are invalid, please type in numbers", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * This method displays a JOptionPane confirmation dialog asking the following: Are you sure you want to exit? 
	 * If the choice is yes, shows another JOptionPane saying: Thank you for using this program!
	 */
	void exitConfirmation() {
		int decision = JOptionPane.showConfirmDialog(new JFrame(),
				"Are you sure you want to exit?", 
				"Exit", 
				JOptionPane.YES_NO_OPTION);

		if (decision == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(new JFrame(), "Thank you for using this program!");
			System.exit(0);
		}
	}

	/**
	 * This method displays a JOptionPane confirmation dialog asking the following: Are you sure you want to clear all the fields? 
	 * If the choice is yes, returns the integer number 0.
	 */
	int clearConfirmation() {
		return JOptionPane.showConfirmDialog(new JFrame(),
				"Are you sure you want to clear all the fields?",
				"Clear",
				JOptionPane.YES_NO_OPTION);
	}

	/**
	 * This method displays a JOptionPane dialog info message saying the following:
	 * Hover each text area or buttons to see additional information. For support, contact: s4820793@bournemouth.ac.uk
	 */
	void infoButton() {
		JOptionPane.showMessageDialog(new JFrame(), "Hover each text area or buttons to see additional information\n      For support, contact: s4820793@bournemouth.ac.uk");
	}

	/**
	 * This method stores the maximum number of the days in the array variable <code>days</code> and returns it when called
	 * @return A string array containing the maximum number of days in one month
	 */
	String[] storeDays() {
		String[] days = new String[31];
		for (int i = 0; i <= 30; i++){
			days[i] = String.valueOf(i + 1);
		}
		return days;
	}

	/**
	 * This method stores all the months of the year in the array variable <code>months</code> and returns them when the method is called
	 * @return A string array containing all the months in a year
	 */
	String[] storeMonths() {
		return new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	}

	/**
	 * This method stores the current and previous year in the array variable <code>lastTwoYears</code> and returns them
	 * when the method is called. This method uses the Calendar class to get the actual year from the system in use.
	 * @return A string array containing the current and previous year 
	 */
	String[] storeYears() {
		String[] lastTwoYears = new String[2];
		int c = 1;
		for (int year = Calendar.getInstance().get(Calendar.YEAR) - 1; year <= Calendar.getInstance().get(Calendar.YEAR); year++) {
			lastTwoYears[c] = String.valueOf(year);
			c--;
		}
		return lastTwoYears;
	}

	/**
	 * This method stores all the hours in a day in the array variable <code>hours</code> and returns them when the method is called
	 * @return A string array containing all the hours in a day considering the am/pm format
	 */
	String[] storeHours() {
		return new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
	}

	/**
	 * This method stores all the minutes in an hour in the array variable <code>minutes</code> and returns them when
	 * the method is called.
	 * @return A string array containing all the minutes in an hour 
	 */
	String[] storeMinutes() {
		String[] minutes = new String[60];
		for (int i = 0; i <= 59; i++){
			if (i <= 9) {
				minutes[i] = String.valueOf("0" + i);
			}
			else {
				minutes[i] = String.valueOf(i);
			}
		}
		return minutes;
	}

	/**
	 * This method stores the time format in the array variable <code>format</code> and returns them when the method is called.
	 * @return A string array containing both am/pm formats
	 */
	String[] storeTimeFormat() {
		return new String[]{"am", "pm"};
	}

	//Starting validation for the SpeedingTicketWrite class

	/**
	 * This method displays a JOptionPane dialog info message saying the following:
	 * No letter needed as the speed is under the limit
	 */
	void noLetterNeeded() {
		JOptionPane.showMessageDialog(new JFrame(), "No letter needed as the speed is under the limit");
	}

	/**
	 * This method displays a JOptionPane dialog info message saying the following:
	 * The letter has been written!
	 */
	void printConfirmationMessage() {
		JOptionPane.showMessageDialog(new JFrame(), "The letter has been written!");
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following:
	 * An error occurred while writing to file, please try again
	 */
	void errorWhileWriting() {
		JOptionPane.showMessageDialog(new JFrame(), "An error occurred while writing to file, please try again", "ERROR", JOptionPane.ERROR_MESSAGE);
	}
}
