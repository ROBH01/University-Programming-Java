import javax.swing.*;

public class SpeedingTicket {
	private int speedLimit, vehicleSpeed;
	private int warning = 4;
	private int fine1 = 10;
	private int fine2 = 15;
	private int fine3 = 20;
	private JFrame frame;
	int txtSpeedLimit, txtVehicleSpeed;
	 

	public SpeedingTicket(int speedLimit, int vehicleSpeed) {		
		this.speedLimit = speedLimit;
		this.vehicleSpeed = vehicleSpeed;
	}

	public SpeedingTicket() {  }

	
	public String getResult(int speedLimit, int vehicleSpeed) {
		String result = "";
		
		if (vehicleSpeed < 0)
		{
			JOptionPane.showMessageDialog(frame, "Not allowed speeds lower than 0mph", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else if (vehicleSpeed > 275)
		{
			JOptionPane.showMessageDialog(frame, "Not allowed speeds higher than 275mph", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else if (speedLimit > 70)
		{
			JOptionPane.showMessageDialog(frame, "Not allowed, limits too high", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else if (speedLimit < 5) // error: SL: 10 VS:25... result:  not allowed lower than 5??????? why?
		{
			JOptionPane.showMessageDialog(frame, "Not allowed limits lower than 5mph", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else if (vehicleSpeed <= speedLimit)
		{
			return "Under the speed limit - no fine.";
		}
		else if (vehicleSpeed <= speedLimit+warning)
		{
			return vehicleSpeed - speedLimit+" miles over the limit, please be careful of your speed in future";
		}
		else if (vehicleSpeed < speedLimit+fine1)
		{
			return vehicleSpeed - speedLimit+" miles over limit, fined £50";
		}
		else if (vehicleSpeed < speedLimit+fine2)
		{
			return vehicleSpeed - speedLimit+" miles over limit, fined £100";
		}
		else if (vehicleSpeed < speedLimit+fine3)
		{
			return vehicleSpeed - speedLimit+" miles over limit, fined £150 and 3 points";
		}
		else
		{
			return vehicleSpeed - speedLimit+" miles over limit, fined £1000 and disqualified";
		}
		return result;
	}


//	public static void main(String[] args) {
//		SpeedingTicket process = new SpeedingTicket();
//		System.out.println(process.getResult());
//	}
}