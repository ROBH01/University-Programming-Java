import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo {
	private JTextField txtName, txtAddress, txtPhone, txtCourse;
	private JButton btnUpper, btnLower, btnExit, btnClear, btnSave;
	private JPanel panel;
	private JFrame frame;

	private ButtonDemo() {
		createForm();
		addFields();
		addButtons();
		frame.add(panel);
		frame.setVisible(true);
		btnUpper.addActionListener(new UpperCaseHandler()); // buttons here because they require an action
		btnLower.addActionListener(new LowerCaseHandler());
		btnExit.addActionListener(new ExitHandler());
		btnClear.addActionListener(new ClearHandler());
		btnSave.addActionListener(new SaveHandler());
	}

	private void createForm() {
		frame = new JFrame();
		frame.setTitle("Student Form");
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
	}

	private void addFields() { // slide 25,26,27
		JLabel lblName = new JLabel("Student Name");
		lblName.setBounds(10, 50, 100, 20);
		panel.add(lblName);

		txtName = new JTextField("Fred Bloggs");
		txtName.setBackground(Color.LIGHT_GRAY); // extra line
		txtName.setBounds(110, 50, 150, 20); // 110 and 50 are distances from the frame.150=length of bar, 20=height of bar
		panel.add(txtName);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 70, 100, 20);
		panel.add(lblAddress);

		txtAddress = new JTextField("Ashley Road");
		txtAddress.setBackground(Color.LIGHT_GRAY);
		txtAddress.setBounds(110, 70, 150, 20);
		panel.add(txtAddress);

		JLabel lblPhone = new JLabel("Phone Number");
		lblPhone.setBounds(10, 90, 100, 20);
		panel.add(lblPhone);

		txtPhone = new JTextField("01202 191 3333");
		txtPhone.setBackground(Color.LIGHT_GRAY);
		txtPhone.setBounds(110, 90, 150, 20);
		panel.add(txtPhone);

		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(10, 110, 150, 20);
		panel.add(lblCourse);

		txtCourse = new JTextField("Computing");
		txtCourse.setBackground(Color.LIGHT_GRAY);
		txtCourse.setBounds(110, 110, 150, 20);
		panel.add(txtCourse);
	}

	private void addButtons() { // slides 31,32
		btnUpper = new JButton ("UpperCase");
		btnUpper.setBounds(50, 200, 100, 20);
		panel.add(btnUpper);

		btnLower = new JButton ("LowerCase");
		btnLower.setBounds(150, 200, 100, 20);
		panel.add(btnLower);

		btnExit = new JButton ("Exit");
		btnExit.setBackground(Color.RED);
		btnExit.setBounds(350, 200, 100, 20); 
		panel.add(btnExit);

		btnClear = new JButton("Clear");
		btnClear.setBackground(Color.yellow);
		btnClear.setBounds(250, 200, 100, 20);
		panel.add(btnClear);

		btnSave = new JButton("Save");
		btnSave.setBackground(Color.green);
		btnSave.setBounds(200, 220, 100, 20);
		panel.add(btnSave);
	}


	class UpperCaseHandler implements ActionListener { // set name, address, course to uppercase
		public void actionPerformed(ActionEvent event) {
			txtName.setText(txtName.getText().toUpperCase());
			txtAddress.setText(txtAddress.getText().toUpperCase());
			txtCourse.setText(txtCourse.getText().toUpperCase());
		}
	}

	class LowerCaseHandler implements ActionListener { // set name, address, course to lowercase
		public void actionPerformed(ActionEvent event) {
			txtName.setText(txtName.getText().toLowerCase());
			txtAddress.setText(txtAddress.getText().toLowerCase());
			txtCourse.setText(txtCourse.getText().toLowerCase());
		}
	}

	class ExitHandler implements ActionListener { // exits
		public void actionPerformed(ActionEvent event) {
			System.exit(0);
		}
	}

	class ClearHandler implements ActionListener { // clears all the data from the form
		public void actionPerformed(ActionEvent event) {
			txtName.setText("");
			txtAddress.setText("");
			txtCourse.setText("");
			txtPhone.setText("");
		}
	}

	class SaveHandler implements ActionListener { // saves all the data to a file
		public void actionPerformed(ActionEvent event) {
			ButtonDemoWriteToFile writing = new ButtonDemoWriteToFile(txtName.getText(), txtAddress.getText(), txtCourse.getText(), txtPhone.getText());
			writing.writeToFile();
		}
	}
	

	public static void main(String[] args) { 
		new ButtonDemo();
	}
}
