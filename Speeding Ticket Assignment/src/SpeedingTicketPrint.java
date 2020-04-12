import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SpeedingTicketPrint {

	private String RegNo, Location, Time, Date, Result;
	


	public String getSystemDate() {
		DateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM YYYY");
		Date date = new Date();
		return dateFormat.format(date);
	}


	public SpeedingTicketPrint(String txtRegNo, String txtLocation, String txtTime, String txtDate, String txtResult) {
		this.RegNo = txtRegNo;
		this.Location = txtLocation;
		this.Time = txtTime;
		this.Date = txtDate;
		this.Result = txtResult;
	}

	public SpeedingTicketPrint() {  }


	public void writeToFile() {
		try {
			PrintWriter out = new PrintWriter (new BufferedWriter (new FileWriter("Letter")));
			out.print("Driver and Vehicle Licensing Agency(DVLA),                                              "+getSystemDate()+"\nLongview Road,\nMorriston,\nSwansea,\nSA6 7JL\n                                         \n                                                POLICE WARNING\n\nVehicle Registration number: "+RegNo+" \n\nDear Sir/Madam,\n\nThe above vehicle was monitored exceeding the speed limit in "+Location+" at "+Time+" on "+Date+".\n\nOffence and fine: "+Result);

			out.close();
		}
		catch (IOException e) {
			System.out.println("ERROR");
		}
	}

	public static void main(String[] args) throws IOException {

		SpeedingTicketGUI GUI = new SpeedingTicketGUI();
		SpeedingTicketPrint print = new SpeedingTicketPrint();
		print.getSystemDate();
	}
}



