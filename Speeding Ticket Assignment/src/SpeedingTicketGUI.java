import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;


public class SpeedingTicketGUI {
	private JLabel hourSecondDivider, lblPicture, lblTicketInformation, lblDate, lblTime, lblLocation, lblRegNo, lblSpeedLimit, lblVehicleSpeed, lblResult, lblfileName;
	private JTextField txtTime, txtLocation, txtRegNo, txtSpeedLimit, txtVehicleSpeed, txtResult, txtFileName;
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
		addDateComboBoxes();
		addTimeComboBoxes();
		panelBackgroundPicture();
		frame.add(panel); 	
		frame.setVisible(true);
	}

	public void panelBackgroundPicture() {
		lblPicture = new JLabel(new ImageIcon("12.png")); // please note that to display the picture, the source must be changed
		lblPicture.setBounds(0,	0, 800, 540); 
		lblPicture.setVisible(true);
		lblPicture.invalidate();
		panel.add(lblPicture);   
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

	//////////////////////////////////Styles start/////////////////////////////////

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

	public Color changeBorderColor() {
		return Color.LIGHT_GRAY.darker();
	}

	public Color getColorRedBright() {
		Color brightRed = new Color(248, 89, 67);
		return brightRed;
	}

	public Color getColorYellowBright() {
		Color brightYellow = new Color(250, 246, 142);
		return brightYellow;
	}

	public Color getColorGreenBright() {
		Color brightGreen = new Color(182, 247, 165); 
		return brightGreen;
	}

	public void changeResultBackgroundColorDependingOnResult(String outcome) {
		//outcome = process.getResult(Integer.parseInt(txtSpeedLimit.getText()), Integer.parseInt(txtVehicleSpeed.getText()));
		if(outcome.contains("Under the speed limit - no fine.")) {
			txtResult.setBackground(getColorGreenBright());
			txtResult.setText(outcome);
		}
		else if (outcome.contains("miles over the limit, please be careful of your speed in future")) {
			txtResult.setBackground(getColorYellowBright());
			txtResult.setText(outcome);
		}
		else if(outcome.contains("miles over limit, fined �50") || outcome.contains("miles over limit, fined �100") || 
				outcome.contains("miles over limit, fined �150 and 3 points") || 
				outcome.contains("miles over limit, fined �1000 and disqualified"))
		{
			txtResult.setBackground(getColorRedBright());
			txtResult.setText(outcome);
		}
		else {
			txtResult.setBackground(changeTextFieldsBackgroundColor());
			txtResult.setText("");
		}
	}
	/////////////////////////////styles end ////////////////////////////////////////////////

	public String[] getDays() {
		String[] maxMonthDays = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		return maxMonthDays;
	}

	public String[] getMonths() {
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		return months;
	}

	public ArrayList<String> getYears() {
		ArrayList<String> yearsUntilNow = new ArrayList<String>();

		for(int year = 1900; year <= Calendar.getInstance().get(Calendar.YEAR); year++) {
			yearsUntilNow.add(year+"");
		}
		return yearsUntilNow;
	}

	public String[] getHours() {
		String[] hours = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
		return hours;
	}

	public ArrayList<String> getMinutes() {
		ArrayList<String> minutes = new ArrayList<String>();

		for (int a = 1; a <= 60; a++){
			if(a==1 || a==2 || a==3 || a==4 || a==5 || a==6 || a==7 || a==8 || a==9) {
				minutes.add("0"+a);
			}
			else {
				minutes.add(a+"");
			}
		}
		return minutes;
	}

	public String[] getTimeFormat() {
		String[] format = {"am", "pm"};
		return format;
	}
	
	public String getFullDate() {
		String	day = (String) jcbDay.getSelectedItem().toString();
		String	month = (String) jcbMonth.getSelectedItem().toString();
		String	year = (String) jcbYear.getSelectedItem().toString();
		String	date = day+" "+month+" "+year;
		return date;
	}
	
	public String getFullTime() {
		String hour = jcbHour.getSelectedItem().toString();
		String minute = jcbMinute.getSelectedItem().toString();
		String timeFormat = jcbTimeFormat.getSelectedItem().toString();
		String time = hour+":"+minute+" "+timeFormat;
		return time;
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
		txtLocation.setToolTipText("This field should contain the name of the place where the car has been spotted");
		txtLocation.setBorder(BorderFactory.createLineBorder(changeBorderColor()));
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

		hourSecondDivider = new JLabel(":");
		hourSecondDivider.setBounds(508, 70, 10, 25);
		hourSecondDivider.setFont(changeLabelsAndTextFieldsFont());
		hourSecondDivider.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(hourSecondDivider);	

		lblRegNo = new JLabel("Reg no");
		lblRegNo.setBounds(715, 100, 100, 30); 
		lblRegNo.setFont(changeLabelsAndTextFieldsFont());
		lblRegNo.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(lblRegNo);
		txtRegNo = new JTextField("8888888");
		txtRegNo.setBounds(450, 100, 220, 25);
		txtRegNo.setToolTipText("Registration number of the car");
		txtRegNo.setBorder(BorderFactory.createLineBorder(changeBorderColor()));
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
		txtSpeedLimit.setBorder(BorderFactory.createLineBorder(changeBorderColor()));
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
		txtVehicleSpeed.setBorder(BorderFactory.createLineBorder(changeBorderColor()));
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
		txtResult.setBorder(BorderFactory.createLineBorder(changeBorderColor()));
		txtResult.setHorizontalAlignment(JTextField.CENTER); 
		txtResult.setBorder(BorderFactory.createEtchedBorder());
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
		txtFileName.setToolTipText("Type in the name of the file only");
		txtFileName.setBorder(BorderFactory.createLineBorder(changeBorderColor()));

		txtFileName.setFont(changeLabelsAndTextFieldsFont());
		txtFileName.setBackground(changeTextFieldsBackgroundColor());
		txtFileName.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(txtFileName);
	}


	public void addButtons() {  //this method adds all the necessary buttons.


		btnInfo = new JButton();
		btnInfo.setIcon(new ImageIcon("abc.png"));
		btnInfo.setBorderPainted(true);
		btnInfo.setBounds(755, 10, 36, 36);
		btnInfo.setToolTipText("Click here for info");
		btnInfo.addActionListener(new InfoHandler());
		panel.add(btnInfo);
		btnInfo.setBorder(BorderFactory.createLineBorder(changeBorderColor()));

		btnCalculate = new JButton ("Calculate");
		btnCalculate.setBounds(240, 210, 120, 25);
		btnCalculate.setFont(changeFontButtons());
		btnCalculate.addActionListener(new CalculateHandler());
		btnCalculate.setForeground(Color.black);
		btnCalculate.setToolTipText("Click here to get the result");
		panel.add(btnCalculate);

		btnClear = new JButton ("Clear");
		btnClear.setBounds(440, 210, 120, 25);
		btnClear.setFont(changeFontButtons());
		btnClear.addActionListener(new ClearHandler());
		btnClear.setForeground(Color.black);
		btnClear.setToolTipText("Click here to clear all the fields");
		panel.add(btnClear);

		btnGenerateLetter = new JButton ("Save and generate letter");
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

	public void addDateComboBoxes() {
		jcbDay = new JComboBox<String>(getDays());
		jcbDay.setBounds(120, 70, 50, 25);
		jcbDay.setFont(changeLabelsAndTextFieldsFont());
		jcbDay.setBackground(changeTextFieldsBackgroundColor());
		jcbDay.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(jcbDay);

		jcbMonth = new JComboBox<String>(getMonths());
		jcbMonth.setBounds(175, 70, 100, 25);
		jcbMonth.setFont(changeLabelsAndTextFieldsFont());
		jcbMonth.setBackground(changeTextFieldsBackgroundColor());
		jcbMonth.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(jcbMonth);


		jcbYear = new JComboBox(getYears().toArray());
		jcbYear.setBounds(280, 70, 60, 25);
		jcbYear.setFont(changeLabelsAndTextFieldsFont());
		jcbYear.setBackground(changeTextFieldsBackgroundColor());
		jcbYear.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(jcbYear);
	}





	public void addTimeComboBoxes() {
		jcbHour = new JComboBox<String>(getHours());
		jcbHour.setBounds(450, 70, 50, 25);
		jcbHour.setFont(changeLabelsAndTextFieldsFont());
		jcbHour.setBackground(changeTextFieldsBackgroundColor());
		jcbHour.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(jcbHour);

		jcbMinute = new JComboBox(getMinutes().toArray());
		jcbMinute.setBounds(520, 70, 50, 25);
		jcbMinute.setFont(changeLabelsAndTextFieldsFont());
		jcbMinute.setBackground(changeTextFieldsBackgroundColor());
		jcbMinute.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(jcbMinute);


		jcbTimeFormat = new JComboBox<String>(getTimeFormat());
		jcbTimeFormat.setBounds(610, 70, 60, 25);
		jcbTimeFormat.setFont(changeLabelsAndTextFieldsFont());
		jcbTimeFormat.setBackground(changeTextFieldsBackgroundColor());
		jcbTimeFormat.setForeground(changeLabelsAndTextFieldsForegroundColor());
		panel.add(jcbTimeFormat);
	}



	///////////////////// VALIDATION start /////////////////////

	public boolean speedLimitAndVehicleSpeedValidation() { //this method checks that speed limit and vehicle speed are not empty.

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

	public boolean noEmptyTextFieldsValidation() { //this method checks if one of the text fields are empty.

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

	public boolean stringValidation(String string) {
		boolean result = string.matches(validation.stringWithoutSpecialCharactersAndOneSpaceOnly()); //also allowing a space in between the names.
		return result;
	}


	public boolean regNoValidation() {  //this method checks if the registration number has between 1 and 7 digits.

		if(txtRegNo.getText().length() < 1 || txtRegNo.getText().length() > 7 || stringValidation(txtRegNo.getText()) == false || txtRegNo.getText().contains("  ") || txtRegNo.getText().contains(" ")) 
		{
			return true;
		}
		return false;
	}

	public boolean mainValidation() { //this method is the main validation of the program.

		if (noEmptyTextFieldsValidation() == true)
		{
			validation.checkIncompleteFields();
			return true;
		}
		else if (stringValidation(txtLocation.getText()) == false || txtLocation.getText().contains("  "))
		{
			validation.errorInTheLocation();
			return true;
		}
		else if (stringValidation(txtFileName.getText()) == false || txtFileName.getText().contains("  ") || txtFileName.getText().substring(0).equals(" "))
		{
			validation.errorInTheFileName();
			txtFileName.setText("");
			return true;
		}
		else if (regNoValidation() == true)
		{
			validation.checkRegNo();
			return true;
		}
		return false;
	}			 

	//////////////////////////////////end validation start in-class handlers////////////////////////////////////////////



	class CalculateHandler implements ActionListener {  //this inner class implements the calculate button
		public void actionPerformed(ActionEvent event) {

			if (speedLimitAndVehicleSpeedValidation() == false)	{
				try {										 
					txtSpeedLimit.setForeground(Color.black);
					txtVehicleSpeed.setForeground(Color.black);
					int speedLimit = Integer.parseInt(txtSpeedLimit.getText());
					int vehicleSpeed = Integer.parseInt(txtVehicleSpeed.getText());
					//process.getResult(speedLimit, vehicleSpeed);
					//process = new SpeedingTicket(speedLimit, vehicleSpeed);
					changeResultBackgroundColorDependingOnResult(process.getResult(speedLimit, vehicleSpeed));

				}
				catch (NumberFormatException ex)
				{
					validation.speedLimitAndVehicleSpeedInvalid();
					txtSpeedLimit.setForeground(Color.red);
					txtVehicleSpeed.setForeground(Color.red);
					txtResult.setText("");
					txtResult.setBackground(changeTextFieldsBackgroundColor());
				}
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
				try {					
					int speedLimit = Integer.parseInt(txtSpeedLimit.getText());
					int vehicleSpeed = Integer.parseInt(txtVehicleSpeed.getText());
					//process = new SpeedingTicket(speedLimit, vehicleSpeed);
					//process.getResult(speedLimit, vehicleSpeed);
					changeResultBackgroundColorDependingOnResult(process.getResult(speedLimit, vehicleSpeed));
					print = new SpeedingTicketPrint(getFullDate(), getFullTime(), txtLocation.getText().toUpperCase(), txtRegNo.getText().toUpperCase(), txtResult.getText(), txtFileName.getText());
					print.letterChoice(txtResult.getText());
				}
				catch (NumberFormatException ex)
				{
					validation.invalidInputs();
				}
			}
		}
	}


	class InfoHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			validation.hack();	
			validation.allHackCode();
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
