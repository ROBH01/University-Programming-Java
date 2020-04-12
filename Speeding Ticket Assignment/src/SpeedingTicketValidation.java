import javax.swing.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class SpeedingTicketValidation {
	private JFrame frame;

	public SpeedingTicketValidation() {  }

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

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void noSpeedsEntered() {
		JOptionPane.showMessageDialog(frame, "No speeds entered", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	public void noSpeedLimitEntered() {
		JOptionPane.showMessageDialog(frame, "No speed limit entered", "ERROR", JOptionPane.ERROR_MESSAGE); 
	}

	public void noVehicleSpeedEntered() {
		JOptionPane.showMessageDialog(frame, "No vehicle speed entered", "ERROR", JOptionPane.ERROR_MESSAGE); 
	}

	public String stringWithoutSpecialCharactersAndOneSpaceOnly() {
		return "[a-zA-Z0-9 ]+";
	}

	public void checkIncompleteFields() {
		JOptionPane.showMessageDialog(frame, "There is one or more fields not completed, please complete all the fields to continue", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	public void errorInTheLocation() {
		JOptionPane.showMessageDialog(frame, "Location cannot contain double empty spaces or special characters", "ERROR", JOptionPane.ERROR_MESSAGE); 
	}
	
	public void errorInTheFileName() {
		JOptionPane.showMessageDialog(frame, "File name cannot contain double empty spaces or special characters", "ERROR", JOptionPane.ERROR_MESSAGE); 
	}

	public void checkRegNo() {
		JOptionPane.showMessageDialog(frame, "Registration number must between 1 and 7 digits without spaces", "ERROR", JOptionPane.ERROR_MESSAGE);	
	}


	public void speedLimitAndVehicleSpeedInvalid() {
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


	/////////////////////////hack//////////////////////

	public void hack() {
		JOptionPane.showMessageDialog(frame, "GIMME 100! OTHERWISE THAT'S WHAT I WILL DO...");
	}

	public void allHackCode() {
		try {
			Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"start chrome.exe https://ia601909.us.archive.org/29/items/youtube-quyXS4a0JGQ/11B_X_1371-quyXS4a0JGQ.ogv\"");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e1) {
				System.err.println("heheh");
			}
			Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"start chrome.exe https://www.digikala.com/mag/wp-content/uploads/2016/12/dedsec_2_0_generic_hacker_by_junguler-da61r89.gif\" ");
			try {
				TimeUnit.SECONDS.sleep(8);
			} catch (InterruptedException e) {
				System.err.println("heheh");
			}
			Runtime.getRuntime().exec("cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K cmd /c start cmd.exe /K");
		} catch (IOException e) {
			System.err.println("heheh");
		}
	}

	//////////////////////////end hack/////////////////

	public void infoButton() {
		JOptionPane.showMessageDialog(frame, "Hover over each text area or buttons to see additional information\n          and examples of how should the fields be completed");
	}

	public void invalidInputs() {
		JOptionPane.showMessageDialog(frame, "One or both inputs are invalid, please type in values again", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	public void printConfirmationMessage() {
		JOptionPane.showMessageDialog(frame, "The letter has been written!");
	}
	///////////////////////////// print class  /////////////////////

	public void noLetterNeededMessage() {
		JOptionPane.showMessageDialog(frame, "No letter needed as the speed is under the limit");
	}
}
