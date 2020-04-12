/**
 * @author Robert Giurgiulescu <s4820793@bournemouth.ac.uk>
 * @id number s4820793
 * @version 6
 * 
 * Date: 17/04/2018
 * Class (2/4)
 * 
 * This class creates the graphical user interface and displays it. It allows the user to type in information,
 * select data and perform actions by interacting with it. The result is obtained from the SpeedingTicket class and,
 * along with the information required, is able to write this data to a file using the SpeedingTicketWrite class. 
 * It also uses the SpeedingTicketValidation class which allows the interface to retrieve useful information as the
 * number of the minutes in an hour or to show error/confirmation messages. This will be a good feedback to the user
 * and it will improve the readability of the class.
 */


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SpeedingTicketGUI {
	private JTextField txtLocation, txtRegNo, txtSpeedLimit, txtVehicleSpeed, txtResult, txtFileName;
	private JFrame frame;
	private JPanel panel;
	private JComboBox<String> jcbDay, jcbMonth, jcbYear, jcbHour, jcbMinute, jcbTimeFormat;
	private Font labelsAndTextFieldsFont = new Font("David", Font.PLAIN, 18);
	private Font fontButtons = new Font("Harlow Solid", Font.BOLD, 15);
	private Color textFieldsBackgroundColor = new Color(192, 192, 192);
	private Color labelsAndTextFieldsForegroundColor = new Color(0, 0, 0); 	
	private Color brightRedColor = new Color(248, 89, 67);
	private Color brightYellowColor = new Color(250, 246, 142);	
	private Color brightGreenColor = new Color(182, 247, 165); 
	private Border lineBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1);	
	private SpeedingTicket process = new SpeedingTicket();
	private SpeedingTicketWrite write = new SpeedingTicketWrite();
	private SpeedingTicketValidation validation = new SpeedingTicketValidation();


	/**
	 * This constructor creates the whole GUI interface by adding all the fields it is made of.
	 */
	private SpeedingTicketGUI() {
		createForm();
		addFields();
		addButtons();
		addComboBoxes();
		addPanelBackgroundPicture();
		frame.add(panel); 	
		frame.setVisible(true);
	}

	/**
	 * This method creates the frame and the panel
	 */
	private void createForm() {
		frame = new JFrame();
		frame.setTitle("The speeding ticket calculator");
		frame.setSize(805, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		panel = new JPanel();
		panel.setLayout(null); 
	}

	/**
	 * This method uses a label to add a background picture to the panel
	 */
	private void addPanelBackgroundPicture() {
		JLabel lblBackgroundPicture = new JLabel(new ImageIcon("CarBackgroundPictureGui.png"));
		lblBackgroundPicture.setBounds(0, 0, 800, 540); 
		lblBackgroundPicture.setVisible(true);
		panel.add(lblBackgroundPicture);   
	}

	/**
	 * This method changes the background color and the text content of the result's text
	 * field depending on the <code>outcome</code> obtained from the SpeedingTicket class.
	 * @param outcome The result received based on the speed limit and vehicle speed
	 */
	private void changeResultBackgroundColorDependingOnFine(String outcome) {
		if (outcome.contains("Under the speed limit - no fine")) {
			txtResult.setBackground(brightGreenColor);
			txtResult.setText(outcome);
		}
		else if (outcome.contains("miles over the limit, please be careful of your speed in future")) {
			txtResult.setBackground(brightYellowColor);
			txtResult.setText(outcome);
		}
		else if (outcome.contains("miles over limit, fined £50") ||
				outcome.contains("miles over limit, fined £100") ||
				outcome.contains("miles over limit, fined £150 and 3 points deducted") ||
				outcome.contains("miles over limit, fined £1000 and disqualified")) {
			txtResult.setBackground(brightRedColor);
			txtResult.setText(outcome);
		}
		else {
			txtResult.setBackground(textFieldsBackgroundColor);
			txtResult.setText("The result will appear here");
		}
	}

	/**
	 * This method parses both speed limit and vehicle speed in order to be calculated. Once the result is 
	 * obtained, uses another method to change the background color depending on this result. If the user type
	 * in an invalid integer, the exception is catch.
	 * @return False if the user input is good, True if there is an error
	 */
	private boolean getResultAndBackgroundColor() {
		try {	
			int speedLimit = Integer.parseInt(txtSpeedLimit.getText());
			int vehicleSpeed = Integer.parseInt(txtVehicleSpeed.getText());
			changeResultBackgroundColorDependingOnFine(process.getResult(speedLimit, vehicleSpeed));
			return false;
		}
		catch (NumberFormatException ex) {
			validation.invalidSpeedLimitAndVehicleSpeed();
			txtResult.setText("The result will appear here");
			txtResult.setBackground(textFieldsBackgroundColor);
			return true;
		}
	}

	/**
	 * This method gets the selected values from the variables <code>day</code>, <code>month</code> and <code>year</code> 
	 * @return A concatenated string in the format day, month, year.
	 */
	private String getFullDate() {
		String day = String.valueOf(jcbDay.getSelectedItem());
		String month = String.valueOf(jcbMonth.getSelectedItem());
		String year = String.valueOf(jcbYear.getSelectedItem());
		return  day + " " + month + " " + year;
	}

	/**
	 * This method gets the selected values from the variables <code>hour</code>, <code>minute</code> and <code>timeFormat</code> 
	 * @return A concatenated string in the format hour, minute, time format.
	 */
	private String getFullTime() {
		String hour = String.valueOf(jcbHour.getSelectedItem());
		String minute = String.valueOf(jcbMinute.getSelectedItem());
		String timeFormat = String.valueOf(jcbTimeFormat.getSelectedItem());
		return hour + ":" + minute + " " + timeFormat;
	}

	/**
	 * This method adds all the months, but February, to the variable <code>jcbMonth</code> when called
	 */
	private void addAllMonthsButFebruary() {
		jcbMonth.addItem("January");
		jcbMonth.addItem("March");
		jcbMonth.addItem("April");
		jcbMonth.addItem("May");
		jcbMonth.addItem("June");
		jcbMonth.addItem("July");
		jcbMonth.addItem("August");
		jcbMonth.addItem("September");
		jcbMonth.addItem("October");
		jcbMonth.addItem("November");
		jcbMonth.addItem("December");
	}

	///////////////////////////////////////////////// COMPONENTS ////////////////////////////////////////////////////

	/**
	 * This method adds all the necessary labels and text fields to the panel
	 */
	private void addFields() {
		JLabel lblQuickCalculation = new JLabel("Quick calculation");
		lblQuickCalculation.setBounds(300, 10, 200, 18);
		lblQuickCalculation.setFont(new Font("Algerian", Font.PLAIN, 20));
		panel.add(lblQuickCalculation);

		JLabel lblSpeedLimit = new JLabel("Speed Limit");
		lblSpeedLimit.setBounds(190, 50, 100, 30); 
		lblSpeedLimit.setFont(labelsAndTextFieldsFont);
		lblSpeedLimit.setForeground(labelsAndTextFieldsForegroundColor);
		panel.add(lblSpeedLimit);
		txtSpeedLimit = new JTextField("");
		txtSpeedLimit.setBounds(300, 50, 85, 30);
		txtSpeedLimit.setFont(labelsAndTextFieldsFont);
		txtSpeedLimit.setBorder(lineBorder);
		txtSpeedLimit.setBackground(textFieldsBackgroundColor);
		txtSpeedLimit.setForeground(labelsAndTextFieldsForegroundColor);
		txtSpeedLimit.setToolTipText("Speed limit in the location");
		txtSpeedLimit.setHorizontalAlignment(JTextField.CENTER);
		panel.add(txtSpeedLimit);

		JLabel lblVehicleSpeed = new JLabel("Vehicle Speed");
		lblVehicleSpeed.setBounds(515, 50, 120, 30); 
		lblVehicleSpeed.setFont(labelsAndTextFieldsFont);
		lblVehicleSpeed.setForeground(labelsAndTextFieldsForegroundColor);
		panel.add(lblVehicleSpeed);
		txtVehicleSpeed = new JTextField("");
		txtVehicleSpeed.setBounds(410, 50, 85, 30);
		txtVehicleSpeed.setFont(labelsAndTextFieldsFont);
		txtVehicleSpeed.setBorder(lineBorder);
		txtVehicleSpeed.setBackground(textFieldsBackgroundColor);
		txtVehicleSpeed.setForeground(labelsAndTextFieldsForegroundColor);
		txtVehicleSpeed.setToolTipText("Speed of the vehicle");
		txtVehicleSpeed.setHorizontalAlignment(JTextField.CENTER);
		panel.add(txtVehicleSpeed);

		txtResult = new JTextField("The result will appear here");
		txtResult.setBounds(170, 130, 500, 30);
		txtResult.setFont(labelsAndTextFieldsFont); 
		txtResult.setBorder(lineBorder);
		txtResult.setBackground(textFieldsBackgroundColor);
		txtResult.setForeground(labelsAndTextFieldsForegroundColor);
		txtResult.setToolTipText("The outcome of the calculation will be shown here");
		txtResult.setHorizontalAlignment(JTextField.CENTER); 
		txtResult.setEditable(false);
		panel.add(txtResult);

		JLabel lblTicketInformation = new JLabel("Ticket Information");
		lblTicketInformation.setBounds(300, 190, 200, 18);
		lblTicketInformation.setFont(new Font("Algerian", Font.PLAIN, 20));
		panel.add(lblTicketInformation);

		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(20, 240, 40, 20);
		lblDate.setFont(labelsAndTextFieldsFont);
		lblDate.setForeground(labelsAndTextFieldsForegroundColor);
		panel.add(lblDate);

		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(725, 240, 40, 30);
		lblTime.setFont(labelsAndTextFieldsFont);
		lblTime.setForeground(labelsAndTextFieldsForegroundColor);
		panel.add(lblTime);

		JLabel lblHourSecondColon = new JLabel(":");
		lblHourSecondColon.setBounds(518, 240, 10, 25);
		lblHourSecondColon.setFont(labelsAndTextFieldsFont);
		lblHourSecondColon.setForeground(labelsAndTextFieldsForegroundColor);
		panel.add(lblHourSecondColon);

		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(20, 275, 80, 20);
		lblLocation.setFont(labelsAndTextFieldsFont);
		lblLocation.setForeground(labelsAndTextFieldsForegroundColor);
		panel.add(lblLocation);
		txtLocation = new JTextField(""); 
		txtLocation.setBounds(120, 275, 220, 25);
		txtLocation.setFont(labelsAndTextFieldsFont);
		txtLocation.setBorder(lineBorder);
		txtLocation.setBackground(textFieldsBackgroundColor);
		txtLocation.setForeground(labelsAndTextFieldsForegroundColor);
		txtLocation.setToolTipText("Name of the place where the car has been spotted");
		txtLocation.setHorizontalAlignment(JTextField.CENTER);	
		panel.add(txtLocation);

		JLabel lblRegNo = new JLabel("Reg-no");
		lblRegNo.setBounds(725, 275, 100, 30); 
		lblRegNo.setFont(labelsAndTextFieldsFont);
		lblRegNo.setForeground(labelsAndTextFieldsForegroundColor);
		panel.add(lblRegNo);
		txtRegNo = new JTextField("");
		txtRegNo.setBounds(460, 275, 220, 25);
		txtRegNo.setFont(labelsAndTextFieldsFont);
		txtRegNo.setBorder(lineBorder);
		txtRegNo.setBackground(textFieldsBackgroundColor);
		txtRegNo.setForeground(labelsAndTextFieldsForegroundColor);
		txtRegNo.setToolTipText("Registration number of the car without spaces");
		txtRegNo.setHorizontalAlignment(JTextField.CENTER);
		panel.add(txtRegNo);

		JLabel lblfileName = new JLabel("Save file as");
		lblfileName.setBounds(180, 308, 180, 30);
		lblfileName.setFont(labelsAndTextFieldsFont);
		lblfileName.setForeground(labelsAndTextFieldsForegroundColor);
		panel.add(lblfileName);
		txtFileName = new JTextField(""); 
		txtFileName.setBounds(280, 310, 250, 25);
		txtFileName.setFont(labelsAndTextFieldsFont);
		txtFileName.setBorder(lineBorder);
		txtFileName.setBackground(textFieldsBackgroundColor);
		txtFileName.setForeground(labelsAndTextFieldsForegroundColor);
		txtFileName.setToolTipText("Type in the name of the file only");
		panel.add(txtFileName);
	}

	/**
	 * This method adds 5 buttons to the interface which are <code>btnInfo</code>, <code>btnCalculate</code>,
	 * <code>btnWriteLetter</code>, <code>btnClearAll</code>, <code>btnExit</code> and allows the user to interact with the program
	 */
	private void addButtons() {
		JButton btnInfo = new JButton();
		btnInfo.setIcon(new ImageIcon("info.png"));
		btnInfo.setBounds(755, 10, 36, 36);
		btnInfo.addActionListener(new InfoHandler());
		btnInfo.setToolTipText("Click for info");
		panel.add(btnInfo);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(340, 90, 115, 25);
		btnCalculate.setFont(fontButtons);
		btnCalculate.addActionListener(new CalculateHandler());
		btnCalculate.setToolTipText("Click to get a fast result");
		panel.add(btnCalculate);

		JButton btnWriteLetter = new JButton("Write letter");
		btnWriteLetter.setBounds(280, 344, 115, 25); 
		btnWriteLetter.setFont(fontButtons);
		btnWriteLetter.addActionListener(new WriteLetterHandler());
		btnWriteLetter.setToolTipText("Click to write letter to file");
		panel.add(btnWriteLetter);

		JButton btnClearAll = new JButton("Clear all");
		btnClearAll.setBounds(410, 344, 120, 25);
		btnClearAll.setFont(fontButtons);
		btnClearAll.addActionListener(new ClearAllHandler());
		btnClearAll.setToolTipText("Click to clear all the fields");
		panel.add(btnClearAll);

		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(280, 515, 250, 20);
		btnExit.setFont(fontButtons);
		btnExit.setForeground(Color.red);
		btnExit.addActionListener(new ExitHandler());
		btnExit.setToolTipText("Click to quit");
		panel.add(btnExit);
	}

	/**
	 * This method adds all the necessary combo boxes to the panel
	 */
	private void addComboBoxes() {
		jcbDay = new JComboBox<>(validation.storeDays());
		jcbDay.setBounds(120, 240, 50, 25);
		jcbDay.setFont(labelsAndTextFieldsFont);
		jcbDay.setBorder(lineBorder);
		jcbDay.setBackground(textFieldsBackgroundColor);
		jcbDay.setForeground(labelsAndTextFieldsForegroundColor);
		jcbDay.addActionListener(new DayHandler());
		jcbDay.setToolTipText("Select day");
		panel.add(jcbDay);

		jcbMonth = new JComboBox<>(validation.storeMonths());
		jcbMonth.setBounds(175, 240, 100, 25);
		jcbMonth.setFont(labelsAndTextFieldsFont);
		jcbMonth.setBackground(textFieldsBackgroundColor);
		jcbMonth.setForeground(labelsAndTextFieldsForegroundColor);
		jcbMonth.setToolTipText("Select month");
		panel.add(jcbMonth);

		jcbYear = new JComboBox<>(validation.storeYears());
		jcbYear.setBounds(280, 240, 60, 25);
		jcbYear.setFont(labelsAndTextFieldsFont);
		jcbYear.setBackground(textFieldsBackgroundColor);
		jcbYear.setForeground(labelsAndTextFieldsForegroundColor);
		jcbYear.setToolTipText("Select year");
		panel.add(jcbYear);

		jcbHour = new JComboBox<>(validation.storeHours());
		jcbHour.setBounds(460, 240, 50, 25);
		jcbHour.setFont(labelsAndTextFieldsFont);
		jcbHour.setBackground(textFieldsBackgroundColor);
		jcbHour.setForeground(labelsAndTextFieldsForegroundColor);
		jcbHour.setToolTipText("Select hour");
		panel.add(jcbHour);

		jcbMinute = new JComboBox<>(validation.storeMinutes());
		jcbMinute.setBounds(530, 240, 50, 25);
		jcbMinute.setFont(labelsAndTextFieldsFont);
		jcbMinute.setBackground(textFieldsBackgroundColor);
		jcbMinute.setForeground(labelsAndTextFieldsForegroundColor);
		jcbMinute.setToolTipText("Select minute");
		panel.add(jcbMinute);

		jcbTimeFormat = new JComboBox<>(validation.storeTimeFormat());
		jcbTimeFormat.setBounds(620, 240, 60, 25);
		jcbTimeFormat.setFont(labelsAndTextFieldsFont);
		jcbTimeFormat.setBackground(textFieldsBackgroundColor);
		jcbTimeFormat.setForeground(labelsAndTextFieldsForegroundColor);
		jcbTimeFormat.setToolTipText("Select format");
		panel.add(jcbTimeFormat);
	}

	///////////////////////////////////////////////// GUI VALIDATION ////////////////////////////////////////////////////

	/**
	 * This method make sure that the correct months are displayed based on the number of days they have.
	 * For example, if days from 29 to 31 are selected, February will not be shown
	 */
	private void dateValidation() {
		if (jcbDay.getSelectedIndex() == 30) {
			jcbMonth.removeAllItems();
			jcbMonth.addItem("January");
			jcbMonth.addItem("March");
			jcbMonth.addItem("May");
			jcbMonth.addItem("July");
			jcbMonth.addItem("August");
			jcbMonth.addItem("October");
			jcbMonth.addItem("December");	
		}
		else if (jcbDay.getSelectedIndex() == 29) {
			jcbMonth.removeAllItems();
			addAllMonthsButFebruary();
		}
		else if (jcbDay.getSelectedIndex() == 28) {
			jcbMonth.removeAllItems();
			addAllMonthsButFebruary();
		}
		else {
			jcbMonth.removeAllItems();
			addAllMonthsButFebruary();		
			jcbMonth.insertItemAt("February", 1);
		}
	}

	/**
	 * This method checks whether the speed limit or the vehicle speed are empty
	 * @return True if any, or both fields are empty, False otherwise
	 */
	private boolean checkIfEmptySpeedLimitAndVehicleSpeed() {
		if (txtSpeedLimit.getText().isEmpty() && txtVehicleSpeed.getText().isEmpty()) {
			validation.noSpeedsEntered(); 
			return true;
		}
		else if (txtSpeedLimit.getText().isEmpty()) {
			validation.noSpeedLimitEntered();
			return true;
		}
		else if (txtVehicleSpeed.getText().isEmpty()) {
			validation.noVehicleSpeedEntered();
			return true;
		}
		else {
			return false;
		}	
	}

	/**
	 * This method checks whether any of the text fields are empty
	 * @return True if even one field is empty, False if all fields are completed
	 */
	private boolean emptyTextFields() {
	 	return txtLocation.getText().isEmpty() || txtRegNo.getText().isEmpty() || 	txtSpeedLimit.getText().isEmpty()
				|| txtVehicleSpeed.getText().isEmpty() || txtFileName.getText().isEmpty();
	}

	/**
	 * This method checks whether the registration number text field is correct
	 * @return True if contains special characters, has more than 7 digits or contains double spaces or starts/ends with a space. False otherwise
	 */
	private boolean regNoValidation() {
	 	return !validation.isStringValid(txtRegNo.getText()) || txtRegNo.getText().length() > 7 || validation.areEmptySpacesValidation(txtRegNo.getText());
	}

	/**
	 * This method checks whether the location text field is correct
	 * @return True if contains special characters, has more than 30 digits or contains double spaces or starts/ends with a space. False otherwise
	 */
	private boolean locationValidation() {
	 	return !validation.isStringValid(txtLocation.getText()) || txtLocation.getText().length() > 30 || validation.areEmptySpacesValidation(txtLocation.getText());
	}

	/**
	 * This method checks whether the file name text field is correct
	 * @return True if contains special characters, has more than 25 digits or contains double spaces or starts/ends with a space. False otherwise
	 */
	private boolean fileNameValidation() {
		 return !validation.isStringValid(txtFileName.getText()) || txtFileName.getText().length() > 25 || validation.areEmptySpacesValidation(txtFileName.getText());
	 }

	/**
	 * This method is the main validation which make sure that the input values are valid
	 * @return True if even one text field is not valid. False otherwise
	 */
	private boolean mainValidation() {
		if (emptyTextFields()) {
			validation.fieldsIncompleted();
			return true;
		}
		else if (locationValidation()) {
			validation.errorsInLocation();
			txtLocation.setText("");
			return true;
		}
		else if (regNoValidation()) {
			validation.errorsInRegNo();
			txtRegNo.setText("");
			return true;
		}
		else if (fileNameValidation()) {
			validation.errorsInFileName();
			txtFileName.setText("");
			return true;
		}
		return false;
	}			 

	///////////////////////////////////////////////// IN-CLASS HANDLERS ////////////////////////////////////////////////////

	/**
	 * This inner class implements the day ComboBox field
	 * @author Robert
	 */
	class DayHandler implements ActionListener {  
		public void actionPerformed(ActionEvent event) {
			dateValidation();
		}
	}

	/**
	 * This inner class implements the calculate button
	 * @author Robert
	 */
	class CalculateHandler implements ActionListener {  
		public void actionPerformed(ActionEvent event) {
			if (!checkIfEmptySpeedLimitAndVehicleSpeed()) {
				getResultAndBackgroundColor();
			}
		}
	}

	/**
	 * This inner class implements the clear button.
	 * @author Robert
	 */
	class ClearAllHandler implements ActionListener {  
		public void actionPerformed(ActionEvent event) {
			if (validation.clearConfirmation() == 0) {
				txtLocation.setText("");
				txtRegNo.setText(""); 
				txtSpeedLimit.setText("");
				txtVehicleSpeed.setText(""); 
				txtResult.setText("The result will appear here");
				txtFileName.setText("");
				txtResult.setBackground(textFieldsBackgroundColor);
				jcbDay.setSelectedIndex(0);
				jcbMonth.setSelectedIndex(0);
				jcbYear.setSelectedIndex(0);
				jcbHour.setSelectedIndex(0);
				jcbMinute.setSelectedIndex(0);
				jcbTimeFormat.setSelectedIndex(0);
			}
		}
	}

	/**
	 * This inner class implements the generate letter button.
	 * @author Robert
	 */
	class WriteLetterHandler implements ActionListener {  
		public void actionPerformed(ActionEvent event) {
			if (!mainValidation()) {
				if (!getResultAndBackgroundColor()) {
					write = new SpeedingTicketWrite(getFullDate(), getFullTime(), txtLocation.getText().toUpperCase(),
							txtRegNo.getText().toUpperCase(), txtResult.getText(), txtFileName.getText());
					write.letterChoice();
				}
			}
		}
	}

	/**
	 * This inner class implements the info button.
	 * @author Robert
	 */
	class InfoHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			validation.infoButton();
		}
	}

	/**
	 * This inner class implements the exit button.
	 * @author Robert
	 */
	class ExitHandler implements ActionListener {  
		public void actionPerformed(ActionEvent event) {
			validation.exitConfirmation();
		}
	}	


	public static void main(String[] args)  {
		new SpeedingTicketGUI();
	}
}
