/**
 * @author Robert Giurgiulescu <s4820793@bournemouth.ac.uk>
 * @id number s4820793
 * @version 6
 * 
 * Date: 06/04/2018
 * Class (3/4)
 * 
 * This program ...
 */


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class SpeedingTicketPrint {
	private String date, time, location, regNo, result, fileName, finalFileName;
	private int referenceNo;
	private SpeedingTicketValidation validation = new SpeedingTicketValidation();

	/**
	 * Default constructor
	 * ?????????????????
	 */
	public SpeedingTicketPrint() {  }

	/**
	 * Constructor which takes in the variables <code>date</code>, <code>time</code>, <code>location</code>, <code>regNo</code>, //should write about the final file name???????
	 * <code>result</code> and <code>fileName</code> from the GUI in order to write the necessary information to the file.
	 * 
	 * @param txtDate The date at which the car has been spotted
	 * @param txtTime The time at which the car has been spotted
	 * @param txtLocation The location at which the car has been spotted
	 * @param txtRegNo The registration number of the car
	 * @param txtResult The result calculated based on the speed limit and the vehicle speed
	 * @param txtFileName The name which will be given to the file once written the letter.
	 */
	public SpeedingTicketPrint(String txtDate, String txtTime, String txtLocation, String txtRegNo, String txtResult, String txtFileName) {
		date = txtDate;
		time = txtTime;
		location = txtLocation;
		regNo = txtRegNo;
		result = txtResult;
		fileName = txtFileName;
		finalFileName = fileName.substring(0, 1).toUpperCase()+fileName.substring(1).toLowerCase();
	}

	/**
	 * This method generates a random number always made of 8 integer digits which will be used for the <code>referenceNo</code>
	 * 
	 * @return A random integer number ranged 10000000 - 99999999 which is used for the reference number.
	 */
	public int getReferenceNo() {
		Random rand = new Random();
		referenceNo = rand.nextInt(89999999)+10000000;
		return referenceNo;
	}

	/**
	 * Method which retrieves the current system date
	 * @return The system date in the format "EEEE, d MMMM YYYY"           //yes???????????????????????
	 */
	public String getSystemDate() {
		DateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM YYYY");
		Date date = new Date();
		return dateFormat.format(date);
	}

	/**
	 * Method which chooses which letter to write, based on the <code>result</code> coming from the GUI class. // yes???????????????
	 * 
	 * @param result Contains the result of the calculation between the speed limit and the vehicle speed
	 */
	public void letterChoice() {
		if(result.contains("Under the speed limit - no fine.")) {
			noLetterNeeded();
		}
		else if(result.contains("miles over the limit, please be careful of your speed in future")) {
			writeWarningLetter();
		}
		else {
			writeOffenceLetter();
		}
	}

	/**
	 * This method will show a message saying that no letter is needed   yesssS??????????????????????
	 */
	public void noLetterNeeded() {
		validation.noLetterNeeded();
	}

	/**
	 * This method uses the printing contains the warning letter which need to be written to the file
	 * and passes it to the printing process.
	 */
	public void writeWarningLetter() {
		String letterWithWarning = ""+getSystemDate()+"\n\n\n                                POLICE WARNING\n\n\n\nVehicle Registration number: "+regNo+"               Reference no: "+getReferenceNo()+" \n\n\nDear Sir/Madam,\n\n\nThe above vehicle was monitored exceeding the speed limit.\nDetails:\n\nLocation: "+location+"\nTime: "+time+"\nDate: "+date+"\nOffence and sanction: "+result+"."+"\n\nWe are committed to reduce the number of casualties and collisions each year. We are working with the local community and other statutory organisations to achieve this aim. Reducing speed will directly contribute to saving lives and will improve the quality of life for people within the area.\n\nSpeeding is not simply about fines and endorsements upon a licence. It is the single most common aggravating factor in 1200 road fatalities per year.\n\nNo further action will be taken in regard of this incident. However, we ask that you modify your driving behaviour and comply with the speed limit in the future.\n\n\n\nYours sincerely,\n\n\n\nManager\n\nCentral Ticket Office\n\n\n\n\n\n\n\n\n\n\n\n\nNB: If you are no longer the Registred Keeper of this vehicle please inform DVLA. If you were not the driver at the time of the offence, please pass this letter onto the person concerned.";
		printingProcess(letterWithWarning);
	}

	/**
	 * This method contains the offence letter which need to be written to the file
	 * and passes it to the printing process.
	 */
	public void writeOffenceLetter() {
		String letterWithOffence = ""+getSystemDate()+"\n\n\n                          NOTICE OF INTENDED PROSECUTION\n\n\n\nVehicle Registration number: "+regNo+"               Reference no: "+getReferenceNo()+" \n\n\nDear Sir/Madam,\n\n\nThe above vehicle was monitored exceeding the speed limit.\nDetails:\n\nLocation: "+location+"\nTime: "+time+"\nDate: "+date+"\nOffence and sanction: "+result+"."+"\n\nPlease find below the options in detail now available to you in respect of this alleged offence.\n\n\n\n\nOPTION 1 - SPEED AWARENESS COURSE\n\nWe are commited to road safety and we partecipate in the National Speed Awareness Scheme, which aims to improve the education of drivers who have exceeded the speed limit. We are offering you the opportunity to attend an educational course which will cost you £75.00 in most of locations across UK. If you successfully complete the course you will NOT have 3 penalty points endorsed on your driving licence. The offer is not available if you have attended a Speed Awareness Course, anywhere in the country, within the last 3 years.\n\nIf you wish to take up this offer, please read the guidance notes overleaf and complete the Application for Speed Awareness Course ONLY(Form A).\n\n\n\n\n\nOPTION 2 - CONDITIONAL OFFER OF FIXED PENALTY\n\nIf you hold a driving licence and have a UK address you have the option of paying a Conditional Offer of Fixed Penalty. This involves you paying the fine shown above and having your driving licence/record endorsed with 3 penalty points.\nIf you wish to take up this offer, please refer to the Conditional Offer of Fixed Penalty(Form B).\n\n\n\n\n\n\nOPTION 3 - COURT HEARING\n\nIf you wish to contest the alleged offence, you have the right to have your case heard in Court. If you choose this option, you will be summonsed to Court at a later date. You will not be offered a Speed Awareness Course if found guilty by the Magistrates and you may have Court costs added to the fine imposed.\n\nIf you do not respond to this letter, Option 3 will be automatically invoked.\nIn some cases the driver might be instantly disqualified if for example a more severe offence is commited, in which case Option 3 will be invoked automatically and another letter will follow with additional details of the further steps to be taken.\n\n\n\nPLEASE CHOOSE ONE OPTION ONLY(if applicable)\n\n\n\nYours sincerely\n\n\n\nManager\n\nCentral Ticket Office\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nNB: If you are no longer the Registred Keeper of this vehicle please inform DVLA. If you were not the driver at the time of the offence, please pass this letter onto the person concerned.";
		printingProcess(letterWithOffence);
	}

	/**
	 * This method takes in the chosen <code>letterType</code> and writes it to the file.
	 * @param letterType The letter type, whether the warning or the offence one 
	 */
	public void printingProcess(String letterType) {
		try {
			PrintWriter out = new PrintWriter (new BufferedWriter (new FileWriter(finalFileName+".txt")));
			out.print(letterType);

			out.close();
			validation.printConfirmationMessage();
		}
		catch (IOException e) {
			System.out.println("ERROR");
		}
	}
}
