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


class SpeedingTicket {
	private SpeedingTicketValidation validation = new SpeedingTicketValidation();
	
	/**
	 * Method which takes in the parameters <code>speedLimit</code> and <code>vehicleSpeed</code> from the GUI class
	 * and returns a string containing the appropriate <code>result</code> back to the GUI class. It can
	 * also show a dialog containing an error message.
	 * @param speedLimit Speed limit in the area
	 * @param vehicleSpeed Speed of the vehicle in mph
	 * @return A string containing the appropriate result based on the speed limit and the speed of the car
	 */
	String getResult(int speedLimit, int vehicleSpeed) {
		String result = "";
		final int SPEED_OVER_FOR_WARNING = 4;
		final int SPEED_OVER_FOR_LEVEL1_FINE = 10;
		final int SPEED_OVER_FOR_LEVEL2_FINE = 15;
		final int SPEED_OVER_FOR_LEVEL3_FINE = 20;

		if (vehicleSpeed < 5) {
			validation.speedLimitNoLowerThan5();
		}
		else if (vehicleSpeed > 275) {
			validation.vehicleSpeedNotHigherThan275();
		}
		else if (speedLimit > 150) {
			validation.speedLimitNoHigherThan150();
		}
		else if (speedLimit < 5) {
			validation.speedLimitNoLowerThan5();
		}
		else if (vehicleSpeed <= speedLimit) {
			result = "Under the speed limit - no fine";
		}
		else if (vehicleSpeed <= speedLimit + SPEED_OVER_FOR_WARNING) {
			result = vehicleSpeed - speedLimit + " miles over the limit, please be careful of your speed in future";
		}
		else if (vehicleSpeed <= speedLimit + SPEED_OVER_FOR_LEVEL1_FINE) {
			result = vehicleSpeed - speedLimit + " miles over limit, fined £50";
		}
		else if (vehicleSpeed <= speedLimit + SPEED_OVER_FOR_LEVEL2_FINE) {
			result = vehicleSpeed - speedLimit + " miles over limit, fined £100";
		}
		else if (vehicleSpeed <= speedLimit + SPEED_OVER_FOR_LEVEL3_FINE) {
			result = vehicleSpeed - speedLimit + " miles over limit, fined £150 and 3 points deducted";
		}
		else {
			result = vehicleSpeed - speedLimit + " miles over limit, fined £1000 and disqualified";
		}
		return result;
	}
}
