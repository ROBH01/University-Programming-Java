/**
 * @author Robert Giurgiulescu <s4820793@bournemouth.ac.uk>
 * @id number s4820793
 * @version 6
 * 
 * Date: 06/04/2018
 * Class (4/4)
 * 
 * This program ...
 */


import javax.swing.*;


public class SpeedingTicketValidation {
	private JFrame frame;

	public SpeedingTicketValidation() {  }

////////////////////////////////////////////////SpeedingTicket////////////////////////////////////////////////////////
	
	public void vehicleSpeedNotLowerThan0() {
		JOptionPane.showMessageDialog(frame, "Not allowed speeds lower than 0mph", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	public void vehicleSpeedNotHigherThan275() {
		JOptionPane.showMessageDialog(frame, "Not allowed speeds higher than 275mph", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	public void speedLimitNoHigherThan70() {
		JOptionPane.showMessageDialog(frame, "Not allowed limits higher than 70mph", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	public void speedLimitNoLowerThan5() {
		JOptionPane.showMessageDialog(frame, "Not allowed limits lower than 5mph", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

////////////////////////////////////////////////SpeedingTicketGUI/////////////////////////////////////////////////////

	public void noSpeedsEntered() {
		JOptionPane.showMessageDialog(frame, "No speeds entered", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	public void noSpeedLimitEntered() {
		JOptionPane.showMessageDialog(frame, "No speed limit entered", "ERROR", JOptionPane.ERROR_MESSAGE); 
	}

	public void noVehicleSpeedEntered() {
		JOptionPane.showMessageDialog(frame, "No vehicle speed entered", "ERROR", JOptionPane.ERROR_MESSAGE); 
	}

	public void DateValidation() {
		JOptionPane.showMessageDialog(frame, "Not allowed", "ERROR", JOptionPane.ERROR_MESSAGE); 
	}
	
	public String checkStringHasNoSpecialCharsAndOneSpaceOnly() {
		return "[a-zA-Z0-9 ]+";
	}

	public void incompletedFields() {
		JOptionPane.showMessageDialog(frame, "There is one or more fields not completed, please complete all the fields to continue", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	public void errorsInLocation() {
		JOptionPane.showMessageDialog(frame, "Location cannot contain double empty spaces or special characters", "ERROR", JOptionPane.ERROR_MESSAGE); 
	}
	
	public void errorsInFileName() {
		JOptionPane.showMessageDialog(frame, "File name cannot contain double empty spaces or special characters", "ERROR", JOptionPane.ERROR_MESSAGE); 
	}

	public void errorsInRegNo() {
		JOptionPane.showMessageDialog(frame, "Registration number must between 1 and 7 digits without spaces", "ERROR", JOptionPane.ERROR_MESSAGE);	
	}


	public void invalidSpeedLimitAndVehicleSpeed() {
		JOptionPane.showMessageDialog(frame, "Speed Limit or Vehicle Speed are invalid, please type in numbers", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	public void exitConfirmation() {
		int decision = JOptionPane.showConfirmDialog(frame, 
				"Are you sure you want to exit the Calculator?", 
				"Exit", 
				JOptionPane.YES_NO_OPTION);

		if(decision == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(frame, "Thank you for using this program!");
			System.exit(0);
		}
	}

	public int clearConfirmation() {
		int confirmation = JOptionPane.showConfirmDialog(frame, 
				"Are you sure you want to clear all the fields?", 
				"Clear", 
				JOptionPane.YES_NO_OPTION);
		return confirmation;
	}

	public void detailsInfoButton() {
		JOptionPane.showMessageDialog(frame, "Hover each text area or buttons to see additional information\n      For support, contact: s4820793@bournemouth.ac.uk");
	}

	public void printConfirmationMessage() {
		JOptionPane.showMessageDialog(frame, "The letter has been written!");
	}
////////////////////////////////////////////////SpeedingTicketPrint/////////////////////////////////////////////////////

	public void noLetterNeeded() {
		JOptionPane.showMessageDialog(frame, "No letter needed as the speed is under the limit");
	}
}
