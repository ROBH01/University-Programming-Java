import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class SpeedingTicketPrint {
	private String txtDate, txtTime, txtLocation, txtRegNo, txtResult, txtFileName;
	private int referenceNo;
	private SpeedingTicketValidation validation = new SpeedingTicketValidation();


	public SpeedingTicketPrint() {  }

	public SpeedingTicketPrint(String txtDate, String txtTime, String txtLocation, String txtRegNo, String txtResult, String txtFileName) {
		this.txtDate = txtDate;
		this.txtTime = txtTime;
		this.txtLocation = txtLocation;
		this.txtRegNo = txtRegNo;
		this.txtResult = txtResult;
		this.txtFileName = txtFileName;
	}

	public void letterChoice(String string) {
		if(string.contains("Under the speed limit - no fine.")) {
			noLetterNeeded();
		}
		else if(string.contains("miles over the limit, please be careful of your speed in future")) {
			writeWarningLetter();
		}
		else
		{
			WriteOffenceLetter();
		}
	}

	public int getReferenceNo() {
		Random rand = new Random();
		referenceNo = rand.nextInt(89999999)+10000000;
		return referenceNo;
	}

	public String getSystemDate() {
		DateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM YYYY");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public void noLetterNeeded() {
		validation.noLetterNeeded();
	}

	public void writeWarningLetter() {
		String letterWithWarning = "Driver and Vehicle Licensing Agency               "+getSystemDate()+"\nLongview Road\nMorriston\nSwansea\nSA6 7JL\n                                         \n                                POLICE WARNING\n\n\n\nVehicle Registration number: "+txtRegNo+"               Reference no: "+getReferenceNo()+" \n\n\nDear Sir/Madam,\n\nThe above vehicle was monitored exceeding the speed limit.\nDetails:\n\nLocation: "+txtLocation+"\nTime: "+txtTime+"\nDate: "+txtDate+"\nOffence and sanction: "+txtResult+"."+"\n\nDVLA are committed to reduce the number of casualties and collisions each year. We are working with the local community and other statutory organisations to achieve this aim. Reducing speed will directly contribute to saving lives and will improve the quality of life for people within the area.\nSpeeding is not simply about fines and endorsements upon a licence. It is the single most common aggravating factor in 1200 road fatalities per year.\n\nNo further action will be taken in regard of this incident. However, we ask that you modify your driving behaviour and comply with the speed limit in the future.\n\n\nYours sincerely,\n\n\n\nDVLA\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nNB: If you are no longer the Registred Keeper of this vehicle please inform DVLA. If you were not the driver at the time of the offence, please pass this letter onto the person concerned.";
		printingLetterProcess(letterWithWarning, txtFileName);
	}

	public void WriteOffenceLetter() {
		String letterWithOffence = "Driver and Vehicle Licensing Agency               "+getSystemDate()+"\nLongview Road\nMorriston\nSwansea\nSA6 7JL\n                                         \n                          NOTICE OF INTENDED PROSECUTION\n\n\n\nVehicle Registration number: "+txtRegNo+"               Reference no: "+getReferenceNo()+" \n\n\nDear Sir/Madam,\n\nThe above vehicle was monitored exceeding the speed limit.\nDetails:\n\nLocation: "+txtLocation+"\nTime: "+txtTime+"\nDate: "+txtDate+"\nOffence and sanction: "+txtResult+"."+"\n\nPlease find below the options in detail now available to you in respect of this alleged offence.\n\nOPTION 1 - SPEED AWARENESS COURSE\n\nWe are commited to road safety and we partecipate in the National Speed Awareness Scheme, which aims to improve the education of drivers who have exceeded the speed limit. We are offering you the opportunity to attend an educational course which will cost you �75.00 in most of locations accross UK. If you successfully complete the course you will NOT have 3 penalty points endorsed on your driving licence. The offer is not available if you have attended a Speed Awareness Course, anywhere in the country, within the last 3 years.\nIf you wish to take up this offer, please read the guidance notes overleaf and complete the Application for Speed Awareness Course ONLY(Form A).\n\nOPTION 2 - CONDITIONAL OFFER OF FIXED PENALTY\n\nIf you hold a driving licence and have a UK address you have the option of paying a Conditional Offer of Fixed Penalty. This involves you paying the fine shown above and having your driving licence/record endorsed with 3 penalty points.\nIf you wish to take up this offer, please refer to the Conditional Offer of Fixed Penalty(Form B).\n\nOPTION 3 - COURT HEARING\n\nIf you wish to contest the alleged offence, you have the right to have your case heard in Court. If you choose this option, you will be summonsed to Court at a later date. You will not be offered a Speed Awareness Course if found guilty by the Magistrates and you may have Court costs added to the fine imposed.\n\nIf you do not respond to this letter, Option 3 will be automatically invoked.\nIn some cases the driver might be instantly disqualified if for example a more severe offence is commited, in which case Option 3 will be invoked automatically and another letter will follow with additional details of the further steps to be taken.\n\n\nPLEASE CHOOSE ONE OPTION ONLY(if applicable)\n\n\nYours sincerely\n\n\n\nManager\n\nCentral Ticket Office\n\n\n\n\n\n\n\n\n\n\n\nNB: If you are no longer the Registred Keeper of this vehicle please inform DVLA. If you were not the driver at the time of the offence, please pass this letter onto the person concerned.";
		printingLetterProcess(letterWithOffence, txtFileName);
	}

	public void printingLetterProcess(String letterType, String txtFileName) {
		try {
			PrintWriter out = new PrintWriter (new BufferedWriter (new FileWriter(txtFileName+".txt")));
			out.print(letterType);

			out.close();
			validation.printConfirmationMessage();
		}
		catch (IOException e) {
			System.out.println("ERROR");
		}
	}
}
