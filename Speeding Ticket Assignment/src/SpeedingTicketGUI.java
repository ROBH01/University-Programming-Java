/**
 * @author Robert Giurgiulescu <s4820793@bournemouth.ac.uk>
 * @id number s4820793
 * @version 6
 * 
 * Date: 06/04/2018
 * Class (2/4)
 * 
 * This program ...
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;


public class SpeedingTicketGUI {
	private JLabel lblHourSecondColon, lblPicture, lblTicketInformation, lblDate, lblTime, lblLocation, lblRegNo, lblSpeedLimit, lblVehicleSpeed, lblResult, lblfileName;
	private JTextField txtLocation, txtRegNo, txtSpeedLimit, txtVehicleSpeed, txtResult, txtFileName;
	private JButton btnCalculate, btnClear, btnExit, btnGenerateLetter, btnInfo;
	private JPanel panel;
	private JFrame frame;
	private JComboBox<String> jcbDay, jcbMonth, jcbYear, jcbHour, jcbMinute, jcbTimeFormat;
	private SpeedingTicket process = new SpeedingTicket();
	private SpeedingTicketPrint print = new SpeedingTicketPrint();
	private SpeedingTicketValidation validation = new SpeedingTicketValidation();


	public SpeedingTicketGUI() {
		createForm();
		addFields();
		addButtons();
		addComboBoxes();
		frame.add(panel); 	
		frame.setVisible(true);
		addPanelBackgroundPicture();
	}

	public void createForm() {
		frame = new JFrame();
		frame.setTitle("The speeding ticket calculator");
		frame.setSize(805, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		panel = new JPanel();
		panel.setLayout(null); 
	}

	public void addPanelBackgroundPicture() {
		lblPicture = new JLabel(new ImageIcon("12.png")); // please note that to display the picture, the source must be changed
		lblPicture.setBounds(0,	0, 800, 540); 
		lblPicture.setVisible(true);
		lblPicture.invalidate();
		panel.add(lblPicture);   
	}

	public Font changeLabelsAndTextFieldsFont() {  //this method changes the font for all labels and text fields.
		return new Font("David", Font.PLAIN, 18); 
	}

	public Color changeTextFieldsBackgroundColor() {  //this method changes the background color for all text fields.
		return Color.LIGHT_GRAY;
	}

	public Color changeLabelsAndTextFieldsForegroundColor() {  //this method changes the foreground color for all labels and text fields.
		return Color.black;
	}

	public Font changeFontButtons() { //this method changes the font name, style and size for all the buttons.
		return new Font("Harlow Solid", Font.BOLD, 14);
	}

	public Color changeTextFieldsAndComboBoxesBorderColor() {
		return Color.gray;
	}

	public Color getRedBrightColor() {
		Color brightRed = new Color(248, 89, 67);
		return brightRed;
	}

	public Color getYellowBrightColor() {
		Color brightYellow = new Color(250, 246, 142);
		return brightYellow;
	}

	public Color getGreenBrightColor() {
		Color brightGreen = new Color(182, 247, 165); 
		return brightGreen;
	}

	public void changeResultBackgroundColorDependingOnFine(String outcome) {

		if(outcome.contains("Under the speed limit - no fine.")) {
			txtResult.setBackground(getGreenBrightColor());
			txtResult.setText(outcome);
		}
		else if (outcome.contains("miles over the limit, please be careful of your speed in future")) {
			txtResult.setBackground(getYellowBrightColor());
			txtResult.setText(outcome);
		}
		else if(outcome.contains("miles over limit, fined £50") || outcome.contains("miles over limit, fined �100") ||
				outcome.contains("miles over limit, fined £150 and 3 points") ||
				outcome.contains("miles over limit, fined £1000 and disqualified"))
		{
			txtResult.setBackground(getRedBrightColor());
			txtResult.setText(outcome);
		}
		else {
			txtResult.setBackground(changeTextFieldsBackgroundColor());
			txtResult.setText("");
		}
	}

	public String[] storeDays() {
		String[] maxMonthDays = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		return maxMonthDays;
	}

	public String[] storeMonths() {
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		return months;
	}

	public ArrayList<String> storeYears() {
		ArrayList<String> yearsUntilNow = new ArrayList<String>();

		for(int year = Calendar.getInstance().get(Calendar.YEAR)-1; year <= Calendar.getInstance().get(Calendar.YEAR); year++) {
			yearsUntilNow.add(year+"");
		}
		Collections.reverse(yearsUntilNow);
		return yearsUntilNow;
	}

	public String[] storeHours() {
		String[] hours = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
		return hours;
	}

	public ArrayList<String> storeMinutes() {
		ArrayList<String> minutes = new ArrayList<String>();

		for (int a = 0; a <= 60; a++){
			if(a==0 || a==1 || a==2 || a==3 || a==4 || a==5 || a==6 || a==7 || a==8 || a==9) {
				minutes.add("0"+a);
			}
			else {
				minutes.add(a+"");
			}
		}
		return minutes;
	}

	public String[] storeTimeFormat() {
		String[] format = {"am", "pm"};
		return format;
	}

	public String getFullDate() {
		String day = (String) jcbDay.getSelectedItem().toString();
		String month = (String) jcbMonth.getSelectedItem().toString();
		String year = (String) jcbYear.getSelectedItem().toString();
		return  day+" "+month+" "+year;
	}

	public String getFullTime() {
		String hour = jcbHour.getSelectedItem().toString();
		String minute = jcbMinute.getSelectedItem().toString();
		String timeFormat = jcbTimeFormat.getSelectedItem().toString();
		String time = hour+":"+minute+" "+timeFormat;
		return time;
	}

	public void addAllMonthsButFebruary() {
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

	public void addFields() {  //this method adds all the necessary fields.

		lblTicketInformation = new JLabel("Ticket Information");
		lblTicketInformation.setBounds(300, 25, 200, 20);
		lblTicketInformation.setFont(new Font("Algerian", Font.PLAIN, 20));
		panel.add(lblTicketInformation);

		lblDate = new JLabel("Date");
		lblDate.setBounds(20, 70, 40, 20);
		lblDate.setFont(changeLabelsAndTextFieldsFont());
		lblDate.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(lblDate);

		lblLocation = new JLabel("Location");
		lblLocation.setBounds(20, 100, 80, 20);
		lblLocation.setFont(changeLabelsAndTextFieldsFont());
		lblLocation.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(lblLocation);
		txtLocation = new JTextField("London"); 
		txtLocation.setBounds(120, 100, 220, 25);
		txtLocation.setToolTipText("Name of the place where the car has been spotted");
		txtLocation.setBorder(BorderFactory.createLineBorder(changeTextFieldsAndComboBoxesBorderColor()));
		txtLocation.setHorizontalAlignment(JTextField.CENTER);
		txtLocation.setFont(changeLabelsAndTextFieldsFont());
		txtLocation.setBackground(changeTextFieldsBackgroundColor());
		txtLocation.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(txtLocation);

		lblTime = new JLabel("Time");
		lblTime.setBounds(715, 70, 40, 30);
		lblTime.setFont(changeLabelsAndTextFieldsFont());
		lblTime.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(lblTime);	

		lblHourSecondColon = new JLabel(":");
		lblHourSecondColon.setBounds(508, 70, 10, 25);
		lblHourSecondColon.setFont(changeLabelsAndTextFieldsFont());
		lblHourSecondColon.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(lblHourSecondColon);	

		lblRegNo = new JLabel("Reg-no");
		lblRegNo.setBounds(715, 100, 100, 30); 
		lblRegNo.setFont(changeLabelsAndTextFieldsFont());
		lblRegNo.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(lblRegNo);
		txtRegNo = new JTextField("8888888");
		txtRegNo.setBounds(450, 100, 220, 25);
		txtRegNo.setToolTipText("Registration number of the car");
		txtRegNo.setBorder(BorderFactory.createLineBorder(changeTextFieldsAndComboBoxesBorderColor()));
		txtRegNo.setHorizontalAlignment(JTextField.CENTER);
		txtRegNo.setFont(changeLabelsAndTextFieldsFont());
		txtRegNo.setBackground(changeTextFieldsBackgroundColor());
		txtRegNo.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(txtRegNo);

		lblSpeedLimit = new JLabel("Speed Limit");
		lblSpeedLimit.setBounds(150, 160, 100, 30); 
		lblSpeedLimit.setFont(changeLabelsAndTextFieldsFont());
		lblSpeedLimit.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(lblSpeedLimit);
		txtSpeedLimit = new JTextField("50");
		txtSpeedLimit.setBounds(300, 160, 85, 30);
		txtSpeedLimit.setToolTipText("Speed limit in the location");
		txtSpeedLimit.setBorder(BorderFactory.createLineBorder(changeTextFieldsAndComboBoxesBorderColor()));
		txtSpeedLimit.setHorizontalAlignment(JTextField.CENTER);
		txtSpeedLimit.setFont(changeLabelsAndTextFieldsFont());
		txtSpeedLimit.setBackground(changeTextFieldsBackgroundColor());
		txtSpeedLimit.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(txtSpeedLimit);

		lblVehicleSpeed = new JLabel("Vehicle Speed");
		lblVehicleSpeed.setBounds(555, 160, 120, 30); 
		lblVehicleSpeed.setFont(changeLabelsAndTextFieldsFont());
		lblVehicleSpeed.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(lblVehicleSpeed);
		txtVehicleSpeed = new JTextField("70");
		txtVehicleSpeed.setBounds(410, 160, 85, 30);
		txtVehicleSpeed.setToolTipText("Speed of the vehicle");
		txtVehicleSpeed.setBorder(BorderFactory.createLineBorder(changeTextFieldsAndComboBoxesBorderColor()));
		txtVehicleSpeed.setHorizontalAlignment(JTextField.CENTER);
		txtVehicleSpeed.setFont(changeLabelsAndTextFieldsFont());
		txtVehicleSpeed.setBackground(changeTextFieldsBackgroundColor());
		txtVehicleSpeed.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(txtVehicleSpeed);

		lblResult = new JLabel("Result");
		lblResult.setBounds(375, 245, 80, 25);
		lblResult.setFont(changeLabelsAndTextFieldsFont());
		lblResult.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(lblResult);	
		txtResult = new JTextField("");
		txtResult.setBounds(170, 275, 470, 30); 
		txtResult.setToolTipText("The result will appear here");
		txtResult.setBorder(BorderFactory.createLineBorder(changeTextFieldsAndComboBoxesBorderColor()));
		txtResult.setHorizontalAlignment(JTextField.CENTER); 
		txtResult.setFont(changeLabelsAndTextFieldsFont()); 
		txtResult.setBackground(changeTextFieldsBackgroundColor());
		txtResult.setForeground(changeLabelsAndTextFieldsForegroundColor());
		txtResult.setEditable(false);
		panel.add(txtResult);	

		lblfileName = new JLabel("File name");
		lblfileName.setBounds(170, 330, 80, 30);
		lblfileName.setFont(changeLabelsAndTextFieldsFont());
		lblfileName.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(lblfileName);
		txtFileName = new JTextField(""); 
		txtFileName.setBounds(250, 330, 150, 25);
		txtFileName.setToolTipText("Name of the file only");
		txtFileName.setBorder(BorderFactory.createLineBorder(changeTextFieldsAndComboBoxesBorderColor()));

		txtFileName.setFont(changeLabelsAndTextFieldsFont());
		txtFileName.setBackground(changeTextFieldsBackgroundColor());
		txtFileName.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(txtFileName);
	}

	public void addButtons() {  //this method adds all the necessary buttons.

		btnInfo = new JButton();
		btnInfo.setIcon(new ImageIcon("abc.png"));
		btnInfo.setBounds(755, 10, 36, 36);
		btnInfo.setToolTipText("Click here for info");
		btnInfo.addActionListener(new InfoHandler());
		panel.add(btnInfo);

		btnCalculate = new JButton ("Calculate");
		btnCalculate.setBounds(240, 210, 120, 25);
		btnCalculate.setFont(changeFontButtons());
		btnCalculate.addActionListener(new CalculateHandler());
		btnCalculate.setForeground(Color.black);
		btnCalculate.setToolTipText("Click here to get the result without printing");
		panel.add(btnCalculate);

		btnClear = new JButton ("Clear all");
		btnClear.setBounds(440, 210, 120, 25);
		btnClear.setFont(changeFontButtons());
		btnClear.addActionListener(new ClearHandler());
		btnClear.setForeground(Color.black);
		btnClear.setToolTipText("Click here to clear all the fields");
		panel.add(btnClear);

		btnGenerateLetter = new JButton ("Save and write letter");
		btnGenerateLetter.setBounds(410, 330, 230, 25); 
		btnGenerateLetter.setFont(changeFontButtons());
		btnGenerateLetter.addActionListener(new GenerateLetterHandler());
		btnGenerateLetter.setForeground(Color.blue);
		btnGenerateLetter.setToolTipText("Click here to generate the letter");
		panel.add(btnGenerateLetter);

		btnExit = new JButton ("EXIT");
		btnExit.setBounds(280, 515, 250, 20);
		btnExit.setFont(changeFontButtons());
		btnExit.addActionListener(new ExitHandler());
		btnExit.setForeground(Color.red);
		btnExit.setToolTipText("Click here to quit");
		panel.add(btnExit);
	}

	public void addComboBoxes() {
		jcbDay = new JComboBox<String>(storeDays());
		jcbDay.setBounds(120, 70, 50, 25);
		jcbDay.setToolTipText("Select day");
		jcbDay.setBorder(BorderFactory.createLineBorder(changeTextFieldsAndComboBoxesBorderColor()));
		jcbDay.setFont(changeLabelsAndTextFieldsFont());
		jcbDay.addActionListener(new DayHandler());
		jcbDay.setBackground(changeTextFieldsBackgroundColor());
		jcbDay.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(jcbDay);

		jcbMonth = new JComboBox<String>(storeMonths());
		jcbMonth.setBounds(175, 70, 100, 25);
		jcbMonth.setToolTipText("Select month");
		jcbMonth.setBorder(BorderFactory.createLineBorder(changeTextFieldsAndComboBoxesBorderColor()));
		jcbMonth.setFont(changeLabelsAndTextFieldsFont());
		jcbMonth.setBackground(changeTextFieldsBackgroundColor());
		jcbMonth.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(jcbMonth);

		jcbYear = new JComboBox(storeYears().toArray());
		jcbYear.setBounds(280, 70, 60, 25);
		jcbYear.setToolTipText("Select year");
		jcbYear.setBorder(BorderFactory.createLineBorder(changeTextFieldsAndComboBoxesBorderColor()));
		jcbYear.setFont(changeLabelsAndTextFieldsFont());
		jcbYear.setBackground(changeTextFieldsBackgroundColor());
		jcbYear.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(jcbYear);

		jcbHour = new JComboBox<String>(storeHours());
		jcbHour.setBounds(450, 70, 50, 25);
		jcbHour.setToolTipText("Select hour");
		jcbHour.setBorder(BorderFactory.createLineBorder(changeTextFieldsAndComboBoxesBorderColor()));
		jcbHour.setFont(changeLabelsAndTextFieldsFont());
		jcbHour.setBackground(changeTextFieldsBackgroundColor());
		jcbHour.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(jcbHour);

		jcbMinute = new JComboBox(storeMinutes().toArray());
		jcbMinute.setBounds(520, 70, 50, 25);
		jcbMinute.setToolTipText("Select minute");
		jcbMinute.setBorder(BorderFactory.createLineBorder(changeTextFieldsAndComboBoxesBorderColor()));
		jcbMinute.setFont(changeLabelsAndTextFieldsFont());
		jcbMinute.setBackground(changeTextFieldsBackgroundColor());
		jcbMinute.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(jcbMinute);

		jcbTimeFormat = new JComboBox<String>(storeTimeFormat());
		jcbTimeFormat.setBounds(610, 70, 60, 25);
		jcbTimeFormat.setToolTipText("Select format");
		jcbTimeFormat.setBorder(BorderFactory.createLineBorder(changeTextFieldsAndComboBoxesBorderColor()));
		jcbTimeFormat.setFont(changeLabelsAndTextFieldsFont());
		jcbTimeFormat.setBackground(changeTextFieldsBackgroundColor());
		jcbTimeFormat.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(jcbTimeFormat);
	}

	public boolean checkIfEmptySpeedLimitAndVehicleSpeed() { //this method checks that speed limit and vehicle speed are not empty.

		if (txtSpeedLimit.getText().isEmpty() && txtVehicleSpeed.getText().isEmpty())
		{
			validation.noSpeedsEntered(); 
			return true;
		}
		else if (txtSpeedLimit.getText().isEmpty()) 
		{
			validation.noSpeedLimitEntered();
			return true;
		}
		else if (txtVehicleSpeed.getText().isEmpty())
		{
			validation.noVehicleSpeedEntered();
			return true;
		}
		else
		{
			return false;
		}	
	}

	public boolean emptyTextFields() { //this method checks if one of the text fields are empty.

		if (txtLocation.getText().isEmpty() || txtRegNo.getText().isEmpty() || 	txtSpeedLimit.getText().isEmpty() 
				|| txtVehicleSpeed.getText().isEmpty() || txtFileName.getText().isEmpty())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean emptySpacesValdiation(String string) {
		if(string.contains("  ") || string.startsWith(" ") || string.endsWith(" ")) {
			return true;
		}
		return false;
	}

	public boolean stringValidation(String string) {
		if(string.matches(validation.checkStringHasNoSpecialCharsAndOneSpaceOnly())) {
			return true;
		}
		else return false;
		//boolean result = string.matches(validation.checkStringHasNoSpecialCharsAndOneSpaceOnly()); //also allowing a space in between the names.
		//return result;
	}

	public boolean regNoValidation() {  //this method checks if the registration number has between 1 and 7 digits.

		if(stringValidation(txtRegNo.getText()) == false || txtRegNo.getText().length() > 7 || emptySpacesValdiation(txtRegNo.getText()) == true)
		{
			return true;
		}
		return false;
	}

	public boolean locationValidation() {

		if (stringValidation(txtLocation.getText()) == false || txtLocation.getText().length() > 30 || emptySpacesValdiation(txtLocation.getText()) == true)
		{
			return true;
		}
		return false;
	}

	public boolean fileNameValidation() {
		if (stringValidation(txtFileName.getText()) == false || txtFileName.getText().length() > 25 || emptySpacesValdiation(txtFileName.getText()) == true)
		{
			return true;
		}
		return false;
	}


	///////////////////////////////////////////////////////////////////////

	public boolean mainValidation() { //this method is the main validation of the program.

		if (emptyTextFields() == true)
		{
			validation.incompletedFields();
			return true;
		}
		else if (locationValidation() == true)
		{
			validation.errorsInLocation();
			return true;
		}
		else if (regNoValidation() == true)
		{
			validation.errorsInRegNo();
			return true;
		}
		else if (fileNameValidation() == true)
		{
			validation.errorsInFileName();
			txtFileName.setText("");
			return true;
		}

		return false;
	}			 


	class DayHandler implements ActionListener {  //this inner class implements the calculate button
		public void actionPerformed(ActionEvent event) {

			if(jcbDay.getSelectedIndex() == 30) {
				jcbMonth.removeAllItems();
				jcbMonth.addItem("January");
				jcbMonth.addItem("March");
				jcbMonth.addItem("May");
				jcbMonth.addItem("July");
				jcbMonth.addItem("August");
				jcbMonth.addItem("October");
				jcbMonth.addItem("December");	
			}
			else if(jcbDay.getSelectedIndex() == 29) {
				jcbMonth.removeAllItems();
				addAllMonthsButFebruary();
			}
			else if(jcbDay.getSelectedIndex() == 28) {
				jcbMonth.removeAllItems();
				addAllMonthsButFebruary();
			}
			else {
				jcbMonth.removeAllItems();
				addAllMonthsButFebruary();		
				jcbMonth.insertItemAt("February", 1);
			}
		}
	}


	public boolean getResult() {
		try {		
			txtSpeedLimit.setForeground(changeLabelsAndTextFieldsForegroundColor());
			txtVehicleSpeed.setForeground(changeLabelsAndTextFieldsForegroundColor());
			int speedLimit = Integer.parseInt(txtSpeedLimit.getText());
			int vehicleSpeed = Integer.parseInt(txtVehicleSpeed.getText());
			changeResultBackgroundColorDependingOnFine(process.getResult(speedLimit, vehicleSpeed));
			return false;
		}
		catch (NumberFormatException ex)
		{
			validation.invalidSpeedLimitAndVehicleSpeed();
			txtSpeedLimit.setForeground(Color.red);
			txtVehicleSpeed.setForeground(Color.red);
			txtResult.setText("");
			txtResult.setBackground(changeTextFieldsBackgroundColor());
			return true;
		}
	}


	class CalculateHandler implements ActionListener {  //this inner class implements the calculate button
		public void actionPerformed(ActionEvent event) {

			if (checkIfEmptySpeedLimitAndVehicleSpeed() == false)
			{
				getResult();
			}
		}
	}


	class ClearHandler implements ActionListener {  //this inner class implements the clear button.
		public void actionPerformed(ActionEvent event) {

			if(validation.clearConfirmation() == 0)
			{
				txtLocation.setText("");
				txtRegNo.setText(""); 
				txtSpeedLimit.setText("");
				txtVehicleSpeed.setText(""); 
				txtResult.setText("");
				txtFileName.setText("");
				txtResult.setBackground(Color.LIGHT_GRAY);
				jcbDay.setSelectedIndex(0);
				jcbMonth.setSelectedIndex(0);
				jcbYear.setSelectedIndex(0);
				jcbHour.setSelectedIndex(0);
				jcbMinute.setSelectedIndex(0);
				jcbTimeFormat.setSelectedIndex(0);
			}
		}
	}


	class GenerateLetterHandler implements ActionListener {  //this inner class implements the generate letter button.
		public void actionPerformed(ActionEvent event) {

			if(mainValidation() == false) 
			{
				if(getResult() == false) {
					print = new SpeedingTicketPrint(getFullDate(), getFullTime(), txtLocation.getText().toUpperCase(), txtRegNo.getText().toUpperCase(), txtResult.getText(), txtFileName.getText());
					print.letterChoice();
				}
			}
		}
	}


	class InfoHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {

			validation.detailsInfoButton();
		}
	}


	class ExitHandler implements ActionListener {  //this inner class implements the exit button.
		public void actionPerformed(ActionEvent event) {

			validation.exitConfirmation();
		}
	}	



	public static void main(String[] args)  {
		new SpeedingTicketGUI();
	}
}
