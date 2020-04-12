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


public class SpeedingTicketValidation {
	private JFrame frame;

	////////////////////////////////////////////////SpeedingTicket class////////////////////////////////////////////////////////

	/**
	 * This method displays a JOptionPane dialog error message saying the following: Not allowed vehicle speeds lower than 1mph
	 */
	public void vehicleSpeedNotLowerThan1() {
		JOptionPane.showMessageDialog(frame, "Not allowed vehicle speeds lower than 1mph", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following: Not allowed vehicle speeds higher than 275mph
	 */
	public void vehicleSpeedNotHigherThan275() {
		JOptionPane.showMessageDialog(frame, "Not allowed vehicle speeds higher than 275mph", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following: Not allowed speed limits higher than 70mph
	 */
	public void speedLimitNoHigherThan70() {
		JOptionPane.showMessageDialog(frame, "Not allowed speed limits higher than 70mph", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following: Not allowed speed limits lower than 5mph
	 */
	public void speedLimitNoLowerThan5() {
		JOptionPane.showMessageDialog(frame, "Not allowed speed limits lower than 5mph", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	////////////////////////////////////////////////SpeedingTicketGUI class/////////////////////////////////////////////////////

	/**
	 * This method displays a JOptionPane dialog error message saying the following: No speeds entered
	 */
	public void noSpeedsEntered() {
		JOptionPane.showMessageDialog(frame, "        No speeds entered", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following: Speed limit not entered
	 */
	public void noSpeedLimitEntered() {
		JOptionPane.showMessageDialog(frame, "  Speed limit not entered", "ERROR", JOptionPane.ERROR_MESSAGE); 
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following: Vehicle speed not entered
	 */
	public void noVehicleSpeedEntered() {
		JOptionPane.showMessageDialog(frame, "     Vehicle speed not entered", "ERROR", JOptionPane.ERROR_MESSAGE); 
	}

	/**
	 * This method takes in a <code>string</code> parameter and checks if the string
	 * contains any special characters. 
	 * @param string The string which will be checked
	 * @return True if the string does not contain special characters, False otherwise
	 */
	public boolean stringValidation(String string) {
		if(string.matches("[a-zA-Z0-9 ]+")) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * This method takes in a <code>string</code> parameter and checks if it contains double spaces or
	 * starts/ends with a space.
	 * @param string The string which will be checked
	 * @return True if the string contains double spaces or starts/ends with a space. False otherwise.
	 */
	public boolean emptySpacesValidation(String string) {
		if(string.contains("  ") || string.startsWith(" ") || string.endsWith(" ")) {
			return true;
		}
		return false;
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following:
	 * There is one or more fields not completed, please complete all the fields to continue
	 */
	public void incompletedFields() {
		JOptionPane.showMessageDialog(frame, "There is one or more fields not completed, please complete all the fields to continue", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following:
	 * Location cannot start/end with a space, contain double empty spaces, contain special characters, be longer than 30 chars.
	 */
	public void errorsInLocation() {
		JOptionPane.showMessageDialog(frame, "Location cannot:\n- Start/end with a space\n- Contain double empty spaces\n- Contain special characters\n- Be longer than 30 chars", "ERROR", JOptionPane.ERROR_MESSAGE); 
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following:
	 * File name cannot start/end with a space, contain double empty spaces, contain special characters, be longer than 25 chars.
	 */
	public void errorsInFileName() {
		JOptionPane.showMessageDialog(frame, "File name cannot:\n- Start/end with a space\n- Contain double empty spaces\n- Contain special characters\n- Be longer than 25 chars", "ERROR", JOptionPane.ERROR_MESSAGE); 
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following:
	 * Registration number must have 1 to 7 digits without spaces or special characters
	 */
	public void errorsInRegNo() {
		JOptionPane.showMessageDialog(frame, "Registration number must have 1 to 7 digits without spaces or special characters", "ERROR", JOptionPane.ERROR_MESSAGE);	
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following:
	 * Speed Limit or Vehicle Speed are invalid, please type in numbers
	 */
	public void invalidSpeedLimitAndVehicleSpeed() {
		JOptionPane.showMessageDialog(frame, "Speed Limit or Vehicle Speed are invalid, please type in numbers", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * This method displays a JOptionPane confirmation dialog asking the following: Are you sure you want to exit? 
	 * If the choice is yes, shows another JOptionPane saying: Thank you for using this program!
	 */
	public void exitConfirmation() {
		int decision = JOptionPane.showConfirmDialog(frame, 
				"Are you sure you want to exit?", 
				"Exit", 
				JOptionPane.YES_NO_OPTION);

		if(decision == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(frame, "Thank you for using this program!");
			System.exit(0);
		}
	}

	/**
	 * This method displays a JOptionPane confirmation dialog asking the following: Are you sure you want to clear all the fields? 
	 * If the choice is yes, returns the integer number 0.
	 */
	public int clearConfirmation() {
		int confirmation = JOptionPane.showConfirmDialog(frame, 
				"Are you sure you want to clear all the fields?", 
				"Clear", 
				JOptionPane.YES_NO_OPTION);
		return confirmation;
	}

	/**
	 * This method displays a JOptionPane dialog info message saying the following:
	 * Hover each text area or buttons to see additional information. For support, contact: s4820793@bournemouth.ac.uk
	 */
	public void infoButton() {
		JOptionPane.showMessageDialog(frame, "Hover each text area or buttons to see additional information\n      For support, contact: s4820793@bournemouth.ac.uk");
	}

	/**
	 * This method stores the maximum number of the days in the array variable <code>days</code> and returns it when called
	 * @return A string array containing the maximum number of days in one month
	 */
	public String[] storeDays() {
		String[] days = new String[31];
		for (int a = 0; a <= 30; a++){
			days[a] = String.valueOf(a+1);
		}
		return days;
	}

	/**
	 * This method stores all the months of the year in the array variable <code>months</code> and returns them when the method is called
	 * @return A string array containing all the months in a year
	 */
	public String[] storeMonths() {
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		return months;
	}

	/**
	 * This method stores the current and previous year in the array variable <code>lastTwoYears</code> and returns them
	 * when the method is called. This method uses the Calendar class to get the actual year from the system in use.
	 * @return A string array containing the current and previous year 
	 */
	public String[] storeYears() {
		String[] lastTwoYears = new String[2];
		int c = 1;

		for (int year = Calendar.getInstance().get(Calendar.YEAR)-1; year <= Calendar.getInstance().get(Calendar.YEAR); year++) {
			lastTwoYears[c] = String.valueOf(year);
			c--;
		}
		return lastTwoYears;
	}

	/**
	 * This method stores all the hours in a day in the array variable <code>hours</code> and returns them when the method is called
	 * @return A string array containing all the hours in a day considering the am/pm format
	 */
	public String[] storeHours() {
		String[] hours = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
		return hours;
	}

	/**
	 * This method stores all the minutes in an hour in the array variable <code>minutes</code> and returns them when
	 * the method is called.
	 * @return A string array containing all the minutes in an hour 
	 */
	public String[] storeMinutes() {
		String[] minutes = new String[61];

		for (int a = 0; a <= 60; a++){
			if(a==0 || a==1 || a==2 || a==3 || a==4 || a==5 || a==6 || a==7 || a==8 || a==9) {
				minutes[a] = String.valueOf("0"+a);
			}
			else {
				minutes[a] = String.valueOf(a);
			}
		}
		return minutes;
	}

	/**
	 * This method stores the time format in the array variable <code>format</code> and returns them when the method is called.
	 * @return A string array containing both am/pm formats
	 */
	public String[] storeTimeFormat() {
		String[] format = {"am", "pm"};
		return format;
	}

	////////////////////////////////////////////////SpeedingTicketWrite/////////////////////////////////////////////////////

	/**
	 * This method displays a JOptionPane dialog info message saying the following:
	 * No letter needed as the speed is under the limit
	 */
	public void noLetterNeeded() {
		JOptionPane.showMessageDialog(frame, "No letter needed as the speed is under the limit");
	}

	/**
	 * This method displays a JOptionPane dialog info message saying the following:
	 * The letter has been written!
	 */
	public void printConfirmationMessage() {
		JOptionPane.showMessageDialog(frame, "The letter has been written!");
	}

	/**
	 * This method displays a JOptionPane dialog error message saying the following:
	 * An error occurred while writing to file, please try again
	 */
	public void errorWhileWriting() {
		JOptionPane.showMessageDialog(frame, "An error occured while writing to file, please try again", "ERROR", JOptionPane.ERROR_MESSAGE);
	}
}
