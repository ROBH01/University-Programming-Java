import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class SpeedingTicketGUI {
	private JLabel lblPicture,lblDriverAddress, lblDriverCity, lblDriverRoad, lblDriverPostCode, lblDriverFlatNo, lblTicketInformation, lblDate, lblTime, lblLocation, lblRegNo, lblSpeedLimit, lblVehicleSpeed, lblResult;
	private JTextField txtDate, txtTime, txtLocation, txtRegNo, txtDriverCity, txtDriverRoad, txtDriverPostCode, txtDriverFlatNo, txtSpeedLimit, txtVehicleSpeed, txtResult;
	private JButton btnCalculate, btnClear, btnExit, btnGenerateLetter;
	private JPanel panel;
	private JFrame frame;
	private DateFormat df, tf;

	SpeedingTicket process = new SpeedingTicket();

	public SpeedingTicketGUI() {
		createForm();
		addFields();
		addButtons();
		picture();
		frame.add(panel); 	
		frame.setVisible(true);
		
	}
	public void picture() {
		lblPicture = new JLabel(new ImageIcon("12.png"));
		lblPicture.setBounds(0,	0, 800, 540);  //larghezza, altezza
		lblPicture.setVisible(true);
		lblPicture.invalidate();
		panel.add(lblPicture);   
	}

	public void createForm() {
		frame = new JFrame();
		frame.setTitle("The speeding ticket calculator");
		frame.setSize(805, 565);//710, 550);// change (X,Y)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		panel = new JPanel();
		//frame.add(panel); 	
		//frame.setVisible(true);
		panel.setLayout(null);   
	}

	public Font labelsAndTextFieldsFont() {
		return new Font("David", Font.PLAIN, 18); //a method for labels and text fields - fonts can be modified only once!
	}

	public Color textFieldsBackgroundColor() {  //a method for text fields - color can be modified only once!
		return Color.LIGHT_GRAY;
	}

	public Color labelsAndTextFieldsForegroundColor() {  //a method for labels and text fields - color can be modified only once!
		return Color.black;
	}

	public Font buttonsFont() {
		return new Font("David", Font.BOLD, 14);
	}

	public void addFields() {

		lblDriverAddress = new JLabel("Driver Address");
		lblDriverAddress.setBounds(320, 25, 160, 20);
		lblDriverAddress.setFont(new Font("Algerian", Font.PLAIN, 20));
		lblDriverAddress.toString().toUpperCase();
		panel.add(lblDriverAddress);

		lblDriverCity = new JLabel("City");   
		lblDriverCity.setBounds(20, 70, 40, 20);
		lblDriverCity.setFont(labelsAndTextFieldsFont()); 
		lblDriverCity.setForeground(labelsAndTextFieldsForegroundColor());
		panel.add(lblDriverCity);
		txtDriverCity = new JTextField("");
		txtDriverCity.setBackground(textFieldsBackgroundColor());
		txtDriverCity.setForeground(labelsAndTextFieldsForegroundColor());
		txtDriverCity.setBounds(120, 70, 150, 25);
		txtDriverCity.setFont(labelsAndTextFieldsFont());
		panel.add(txtDriverCity);

		lblDriverRoad = new JLabel("Road");
		lblDriverRoad.setBounds(715, 70, 40, 30);
		lblDriverRoad.setFont(labelsAndTextFieldsFont());
		lblDriverRoad.setForeground(labelsAndTextFieldsForegroundColor());
		panel.add(lblDriverRoad);
		txtDriverRoad = new JTextField("");
		txtDriverRoad.setBounds(530, 70, 150, 25);
		txtDriverRoad.setBackground(textFieldsBackgroundColor());
		txtDriverRoad.setForeground(labelsAndTextFieldsForegroundColor());
		txtDriverRoad.setFont(labelsAndTextFieldsFont());
		panel.add(txtDriverRoad);

		lblDriverPostCode = new JLabel("Post Code"); 
		lblDriverPostCode.setBounds(20, 100, 80, 20);
		lblDriverPostCode.setFont(labelsAndTextFieldsFont());
		lblDriverPostCode.setForeground(labelsAndTextFieldsForegroundColor());
		panel.add(lblDriverPostCode);
		txtDriverPostCode = new JTextField("");
		txtDriverPostCode.setBounds(120, 100, 150, 25); 
		txtDriverPostCode.setBackground(textFieldsBackgroundColor());
		txtDriverPostCode.setForeground(labelsAndTextFieldsForegroundColor());
		txtDriverPostCode.setFont(labelsAndTextFieldsFont());
		panel.add(txtDriverPostCode);

		lblDriverFlatNo = new JLabel("Flat No");
		lblDriverFlatNo.setBounds(715, 100, 100, 30);
		lblDriverFlatNo.setFont(labelsAndTextFieldsFont());
		lblDriverFlatNo.setForeground(labelsAndTextFieldsForegroundColor());
		panel.add(lblDriverFlatNo);
		txtDriverFlatNo = new JTextField("");
		txtDriverFlatNo.setBounds(530, 100, 150, 25);
		txtDriverFlatNo.setBackground(textFieldsBackgroundColor());
		txtDriverFlatNo.setForeground(labelsAndTextFieldsForegroundColor());
		txtDriverFlatNo.setFont(labelsAndTextFieldsFont());
		panel.add(txtDriverFlatNo);

		/////////////////////////////////////////////////////////////////////////

		lblTicketInformation = new JLabel("Ticket Information");
		lblTicketInformation.setBounds(300, 155, 200, 20);
		lblTicketInformation.setFont(new Font("Algerian", Font.PLAIN, 20));
		panel.add(lblTicketInformation);

		////////////////////////////////


		/////////////////// date needs checking, bad validation
		lblDate = new JLabel("Date");
		lblDate.setBounds(20, 200, 40, 20);
		lblDate.setFont(labelsAndTextFieldsFont());
		lblDate.setForeground(labelsAndTextFieldsForegroundColor());
		panel.add(lblDate);
		df = new SimpleDateFormat("dd/MM/yyyy");
		txtDate = new JFormattedTextField(df);
		txtDate.setBounds(120, 200, 150, 25);
		txtDate.setHorizontalAlignment(JTextField.CENTER);
		txtDate.setBackground(textFieldsBackgroundColor());
		txtDate.setForeground(labelsAndTextFieldsForegroundColor());
		txtDate.setFont(labelsAndTextFieldsFont());
		panel.add(txtDate);

		lblLocation = new JLabel("Location");
		lblLocation.setBounds(20, 230, 100, 20);
		lblLocation.setFont(labelsAndTextFieldsFont());
		lblLocation.setForeground(labelsAndTextFieldsForegroundColor());
		panel.add(lblLocation);
		txtLocation = new JTextField(""); 
		txtLocation.setBounds(120, 230, 150, 25);
		txtLocation.setBackground(textFieldsBackgroundColor());
		txtLocation.setHorizontalAlignment(JTextField.CENTER);
		txtLocation.setForeground(labelsAndTextFieldsForegroundColor());
		txtLocation.setFont(labelsAndTextFieldsFont());
		panel.add(txtLocation);

		lblTime = new JLabel("Time");
		lblTime.setBounds(715, 200, 60, 30);
		lblTime.setFont(labelsAndTextFieldsFont());
		lblTime.setForeground(labelsAndTextFieldsForegroundColor());
		panel.add(lblTime);	
		tf = new SimpleDateFormat("HH:mm");
		txtTime = new JFormattedTextField(tf);	
		txtTime.setBounds(530, 200, 150, 25);
		txtTime.setHorizontalAlignment(JTextField.CENTER);
		txtTime.setBackground(textFieldsBackgroundColor());
		txtTime.setForeground(labelsAndTextFieldsForegroundColor());
		txtTime.setFont(labelsAndTextFieldsFont());
		panel.add(txtTime);

		lblRegNo = new JLabel("Reg no");
		lblRegNo.setBounds(715, 230, 100, 30); 
		lblRegNo.setFont(labelsAndTextFieldsFont());
		lblRegNo.setForeground(labelsAndTextFieldsForegroundColor());
		panel.add(lblRegNo);
		txtRegNo = new JTextField("");
		txtRegNo.setBounds(530, 230, 150, 25);
		txtRegNo.setHorizontalAlignment(JTextField.CENTER);
		txtRegNo.setBackground(textFieldsBackgroundColor());
		txtRegNo.setForeground(labelsAndTextFieldsForegroundColor());
		txtRegNo.setFont(labelsAndTextFieldsFont());
		panel.add(txtRegNo);

		lblSpeedLimit = new JLabel("Speed Limit");
		lblSpeedLimit.setBounds(150, 300, 100, 30); 
		lblSpeedLimit.setFont(labelsAndTextFieldsFont());
		lblSpeedLimit.setForeground(labelsAndTextFieldsForegroundColor());
		panel.add(lblSpeedLimit);
		txtSpeedLimit = new JTextField("");
		txtSpeedLimit.setBounds(300, 300, 85, 30);
		txtSpeedLimit.setHorizontalAlignment(JTextField.CENTER);
		txtSpeedLimit.setBackground(textFieldsBackgroundColor());
		txtSpeedLimit.setForeground(labelsAndTextFieldsForegroundColor());
		txtSpeedLimit.setFont(labelsAndTextFieldsFont());
		panel.add(txtSpeedLimit);

		lblVehicleSpeed = new JLabel("Vehicle Speed");
		lblVehicleSpeed.setBounds(555, 300, 120, 30); 
		lblVehicleSpeed.setFont(labelsAndTextFieldsFont());
		lblVehicleSpeed.setForeground(labelsAndTextFieldsForegroundColor());
		panel.add(lblVehicleSpeed);
		txtVehicleSpeed = new JTextField("");
		txtVehicleSpeed.setBounds(410, 300, 85, 30);
		txtVehicleSpeed.setHorizontalAlignment(JTextField.CENTER);
		txtVehicleSpeed.setBackground(textFieldsBackgroundColor());
		txtVehicleSpeed.setForeground(labelsAndTextFieldsForegroundColor());
		txtVehicleSpeed.setFont(labelsAndTextFieldsFont());
		panel.add(txtVehicleSpeed);

		lblResult = new JLabel("Result");
		lblResult.setBounds(375, 380, 80, 25);
		lblResult.setFont(labelsAndTextFieldsFont());
		lblResult.setForeground(labelsAndTextFieldsForegroundColor());
		panel.add(lblResult);	
		txtResult = new JTextField("");
		txtResult.setHorizontalAlignment(JTextField.CENTER);  /// i don t need this to display result actually.. decide later
		txtResult.setFont(labelsAndTextFieldsFont()); 
		txtResult.setBounds(170, 410, 470, 28); 
		txtResult.setBackground(textFieldsBackgroundColor());
		txtResult.setForeground(labelsAndTextFieldsForegroundColor());
		panel.add(txtResult);	
	}



	public void addButtons() {    
		btnCalculate = new JButton ("CALCULATE");
		btnCalculate.setBounds(240, 350, 120, 25);
		btnCalculate.setToolTipText("Click here to get the result");
		btnCalculate.setForeground(Color.green);
		btnCalculate.setFont(buttonsFont());
		btnCalculate.addActionListener(new CalculateHandler());
		panel.add(btnCalculate);

		btnClear = new JButton ("CLEAR");
		btnClear.setBounds(440, 350, 120, 25);
		btnClear.setForeground(Color.yellow);
		btnClear.setToolTipText("Click here to clear all the fields");
		btnClear.setFont(buttonsFont());
		btnClear.addActionListener(new ClearHandler());
		panel.add(btnClear);

		btnGenerateLetter = new JButton ("GENERATE LETTER");
		btnGenerateLetter.setBounds(205, 460, 180, 34);
		btnGenerateLetter.setForeground(Color.blue);
		btnGenerateLetter.setToolTipText("Click here to generate the letter");
		btnGenerateLetter.setFont(buttonsFont());
		btnGenerateLetter.addActionListener(new GenerateLetterHandler());
		panel.add(btnGenerateLetter);

		btnExit = new JButton ("EXIT");
		btnExit.setBounds(415, 460, 180, 34);
		btnExit.setForeground(Color.red);
		btnExit.setToolTipText("Click here to quit");
		btnExit.setFont(buttonsFont());
		btnExit.addActionListener(new ExitHandler());
		panel.add(btnExit);
	}

	//////////////////////////////////////////////////////////////////////////////

	public boolean validationSpeedLimitAndVehicleSpeed() {

		if (txtSpeedLimit.getText().isEmpty() && txtVehicleSpeed.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frame, "No speeds entered", "ERROR", JOptionPane.ERROR_MESSAGE); 
			return true;
		}
		else if (txtSpeedLimit.getText().isEmpty()) 
		{
			JOptionPane.showMessageDialog(frame, "No speed limit entered", "ERROR", JOptionPane.ERROR_MESSAGE); 
			return true;
		}
		else if (txtVehicleSpeed.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frame, "No vehicle speed entered", "ERROR", JOptionPane.ERROR_MESSAGE); 
			return true;
		}
		else
		{
			return false;
		}	
	}

	//////////////////////////////////////////////////////////////////


	public boolean mainValidation() {
		String result = txtDriverCity.getText();
		String result2 = txtLocation.getText();

		if (noEmptyFieldsValidation() == true)
		{
			JOptionPane.showMessageDialog(frame, "There is one or more fields not completed, please complete all the fields", "ERROR", JOptionPane.ERROR_MESSAGE); 
			return true;
		}
		else if (noStringWithNumbersValidation(result) == true && noStringWithNumbersValidation(result2) == true)
		{
			JOptionPane.showMessageDialog(frame, "city and location errors", "ERROR", JOptionPane.ERROR_MESSAGE); 
			return true;
		}
		else if (noStringWithNumbersValidation(result) == true)
		{
			JOptionPane.showMessageDialog(frame, "city error input", "ERROR", JOptionPane.ERROR_MESSAGE); 
			return true;
		}
		else if (noStringWithNumbersValidation(result2) == true)
		{
			JOptionPane.showMessageDialog(frame, "location error input", "ERROR", JOptionPane.ERROR_MESSAGE); 
			return true;
		}
		return false;
	}

	public boolean noEmptyFieldsValidation() {

		if (txtDriverCity.getText().isEmpty() || txtDriverRoad.getText().isEmpty() ||
				txtDriverPostCode.getText().isEmpty() || txtDriverFlatNo.getText().isEmpty() ||
				txtDate.getText().isEmpty() || txtTime.getText().isEmpty() || 
				txtLocation.getText().isEmpty() || txtRegNo.getText().isEmpty() ||
				txtSpeedLimit.getText().isEmpty() || txtVehicleSpeed.getText().isEmpty())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean noStringWithNumbersValidation(String result) {
		char[] resultChar = result.toCharArray(); 
		for (int a = 0; a < result.length(); a++)
		{
			if (resultChar[a] == '0' || resultChar[a] == '1' || resultChar[a] == '2' || resultChar[a] == '3' || resultChar[a] == '4' || resultChar[a] == '5' || resultChar[a] == '6' || resultChar[a] == '7' || resultChar[a] == '8' || resultChar[a] == '9')
			{
				return true;
			}
		}
		return false;
	}


	class CalculateHandler implements ActionListener { 
		public void actionPerformed(ActionEvent event) {
			if (validationSpeedLimitAndVehicleSpeed() == false)
			{
				try {
					int speedLimit = Integer.parseInt(txtSpeedLimit.getText());
					int vehicleSpeed = Integer.parseInt(txtVehicleSpeed.getText());
					process = new SpeedingTicket(speedLimit, vehicleSpeed);
					txtResult.setText(process.getResult(speedLimit,vehicleSpeed));
				}
				catch (NumberFormatException ex)
				{
					JOptionPane.showMessageDialog(frame, "One or both inputs are invalid, please type in values again", "ERROR", JOptionPane.ERROR_MESSAGE);
					txtSpeedLimit.setText("");
					txtVehicleSpeed.setText("");
					txtResult.setText("");
				}
			}
		}
	}



	class ClearHandler implements ActionListener { 
		public void actionPerformed(ActionEvent event) {
			txtDate.setText("");
			txtTime.setText("");
			txtLocation.setText("");
			txtRegNo.setText(""); 
			txtDriverCity.setText("");
			txtDriverRoad.setText(""); 
			txtDriverPostCode.setText(""); 
			txtDriverFlatNo.setText(""); 
			txtSpeedLimit.setText("");
			txtVehicleSpeed.setText(""); 
			txtResult.setText("");
		}
	}


	class GenerateLetterHandler implements ActionListener { 
		public void actionPerformed(ActionEvent event) {
			if(mainValidation() == false) 
			{
				// do the printing work.
				int speedLimit = Integer.parseInt(txtSpeedLimit.getText());
				int vehicleSpeed = Integer.parseInt(txtVehicleSpeed.getText());
				txtResult.setText(process.getResult(speedLimit,vehicleSpeed));
				process = new SpeedingTicket(speedLimit, vehicleSpeed);
				SpeedingTicketPrint print = new SpeedingTicketPrint(txtRegNo.getText(), txtLocation.getText(), txtTime.getText(), txtDate.getText(), txtResult.getText());
				print.writeToFile();
				JOptionPane.showMessageDialog(frame, "The letter has been written!");
			}
		}
	}


	class ExitHandler implements ActionListener { 
		public void actionPerformed(ActionEvent event) {
			int decision = JOptionPane.showConfirmDialog(frame, 
					"Are you sure you want to exit the Calculator?", 
					"Exit", 
					JOptionPane.YES_NO_OPTION);

			if(decision == JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(frame, "Thank you for using this program!");
				System.exit(0);
			}
		}
	}






	public static void main(String[] args) {
		new SpeedingTicketGUI();
	}
}
