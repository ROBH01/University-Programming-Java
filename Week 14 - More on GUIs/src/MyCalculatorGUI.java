import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculatorGUI {
	private JTextField txtFirstNumber, txtSecondNumber, txtResult;
	private JPanel panel;
	private JFrame frame;
	private enum Operation { ADD, SUBTRACT, MULTIPLY, DIVIDE }


	private MyCalculatorGUI() {
		createForm();
		addFields();
		addButtons();
		frame.add(panel);
		frame.setVisible(true);
	}

	private void createForm() {
		frame = new JFrame();
		frame.setTitle("Mini Calculator");
		frame.setSize(460, 280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false); // size not changeable
		panel = new JPanel();
		panel.setBackground(Color.lightGray);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
	}

	private void addFields() {
		JLabel lblFirstNumber = new JLabel("First number");
		lblFirstNumber.setBounds(50, 50, 100, 20);
		panel.add(lblFirstNumber);
		txtFirstNumber = new JTextField("");
		txtFirstNumber.setBounds(150, 50, 130, 20);
		panel.add(txtFirstNumber);

		JLabel lblSecondNumber = new JLabel("Second number");
		lblSecondNumber.setBounds(50, 110, 100, 20);
		panel.add(lblSecondNumber);
		txtSecondNumber = new JTextField("");
		txtSecondNumber.setBounds(150, 110, 130, 20);
		panel.add(txtSecondNumber);

		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(50, 150, 80, 20);
		panel.add(lblResult);
		txtResult = new JTextField(" ");
		txtResult.setBounds(150, 150, 130, 20);
		txtResult.setEditable(false);
		panel.add(txtResult);
	}

	private void addButtons() {
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(20, 80, 100, 20);
		btnAdd.addActionListener(new GenericOperationHandler());
		panel.add(btnAdd);

		JButton btnSubtract = new JButton("SUBTRACT");
		btnSubtract.setBounds(120, 80, 100, 20);
		btnSubtract.addActionListener(new GenericOperationHandler());
		panel.add(btnSubtract);

		JButton btnMultiply = new JButton("MULTIPLY");
		btnMultiply.setBounds(220, 80, 100, 20);
		btnMultiply.addActionListener(new GenericOperationHandler());
		panel.add(btnMultiply);

		JButton btnDivide = new JButton("DIVIDE");
		btnDivide.setBounds(320, 80, 100, 20);
		btnDivide.addActionListener(new GenericOperationHandler());
		panel.add(btnDivide);

		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(170, 210, 100, 20);
		btnExit.addActionListener(new ExitHandler());
		btnExit.setForeground(Color.red);
		panel.add(btnExit);
	}

	private void validationFirstNumberPanel() {
		JOptionPane.showMessageDialog(frame, "Please write the first number", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	private void validationSecondNumberPanel() {
		JOptionPane.showMessageDialog(frame, "Please write the second number", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	private void validationBothNumbersPanel() {
		JOptionPane.showMessageDialog(frame, "No numbers entered, plase type first and second number", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	private void invalidInputPanel() {
		JOptionPane.showMessageDialog(frame, "One or both inputs are invalid, please type in values again", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	private boolean validation() {
		if (txtFirstNumber.getText().isEmpty() && txtSecondNumber.getText().isEmpty()) {
			validationBothNumbersPanel();
			return false;
		}
		else if (txtFirstNumber.getText().isEmpty()) {
			validationFirstNumberPanel();
			return false;
		}
		else if (txtSecondNumber.getText().isEmpty()) {
			validationSecondNumberPanel();
			return false;
		}
		else {
			return true;
		}
	}

	class GenericOperationHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String operation = event.getActionCommand();

			if (validation()) {
				try {
					double numberOne = Double.parseDouble(txtFirstNumber.getText());
					double numberTwo = Double.parseDouble(txtSecondNumber.getText());

					if (operation.equalsIgnoreCase(Operation.ADD.toString())) {
						txtResult.setText(String.valueOf(numberOne + numberTwo));
					}
					else if (operation.equalsIgnoreCase(Operation.SUBTRACT.toString())) {
						txtResult.setText(String.valueOf(numberOne - numberTwo));
					}
					else if (operation.equalsIgnoreCase(Operation.MULTIPLY.toString())) {
						txtResult.setText(String.valueOf(String.format("%.2f", numberOne * numberTwo)));
					}
					else if (operation.equalsIgnoreCase(Operation.DIVIDE.toString())) {
						txtResult.setText(String.valueOf(String.format("%.2f", numberOne / numberTwo)));
					}
				}
				catch (NumberFormatException ex) {
					invalidInputPanel();
					txtFirstNumber.setText("");
					txtSecondNumber.setText("");
					txtResult.setText("");
				}
			}
		}
	}


	class ExitHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			int n = JOptionPane.showConfirmDialog(frame,
					"Are you sure you want to exit?",
					"Exit?",
					JOptionPane.YES_NO_OPTION);

			if (n == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
	}


	public static void main(String[] args) {
		new MyCalculatorGUI();
	}
}
