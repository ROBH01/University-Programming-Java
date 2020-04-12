
public class SpeedingTicket {
	private int warning = 4;
	private int fine1 = 10;
	private int fine2 = 15;
	private int fine3 = 20;
	private SpeedingTicketValidation validation = new SpeedingTicketValidation();

	public SpeedingTicket() {  }

	public String getResult(int speedLimit, int vehicleSpeed) {
		String result = "";

		if (vehicleSpeed < 0)
		{
			validation.vehicleSpeedNotLowerThan0();
		}
		else if (vehicleSpeed > 275)
		{
			validation.vehicleSpeedNotHigherThan275();
		}
		else if (speedLimit > 70)
		{
			validation.speedLimitNoHigherThan70();
		}
		else if (speedLimit < 5)
		{
			validation.speedLimitNoLowerThan5();
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
}
