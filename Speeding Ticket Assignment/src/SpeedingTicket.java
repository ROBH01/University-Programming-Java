/**
 * @author Robert Giurgiulescu <s4820793@bournemouth.ac.uk>
 * @id number s4820793
 * @version 6
 * 
 * Date: 06/04/2018
 * Class (1/4)
 * 
 * This class is the logic part of the Speeding Ticket calculator. It is only used to calculate and return the result
 * using one method only. This class also uses the SpeedingTicketValidation class in order to display some error messages
 * to the user which may occur when the speed limit and the vehicle speed are invalid values.
 */


public class SpeedingTicket {
	private int warning = 4;
	private int fine1 = 10;
	private int fine2 = 15;
	private int fine3 = 20;
	private SpeedingTicketValidation validation = new SpeedingTicketValidation();


	/**
	 * Method which takes in the parameters <code>speedLimit</code> and <code>vehicleSpeed</code> from the GUI class
	 * and returns a string containing the appropriate <code>result</code> back to the GUI class. It can
	 * also show a dialog containing an error message.
	 * @param speedLimit Speed limit in the area
	 * @param vehicleSpeed Speed of the vehicle in mph
	 * @return A string containing the appropriate result based on the speed limit and the speed of the car
	 */
	public String getResult(int speedLimit, int vehicleSpeed) {
		String result = "";

		if (vehicleSpeed < 1)
		{
			validation.vehicleSpeedNotLowerThan1();
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
			result = "Under the speed limit - no fine";
		}
		else if (vehicleSpeed <= speedLimit+warning)
		{
			result = vehicleSpeed - speedLimit+" miles over the limit, please be careful of your speed in future";
		}
		else if (vehicleSpeed < speedLimit+fine1)
		{
			result = vehicleSpeed - speedLimit+" miles over limit, fined £50";
		}
		else if (vehicleSpeed < speedLimit+fine2)
		{
			result = vehicleSpeed - speedLimit+" miles over limit, fined £100";
		}
		else if (vehicleSpeed < speedLimit+fine3)
		{
			result = vehicleSpeed - speedLimit+" miles over limit, fined £150 and 3 points deducted";
		}
		else
		{
			result = vehicleSpeed - speedLimit+" miles over limit, fined £1000 and disqualified";
		}
		return result;
	}
}
