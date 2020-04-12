import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RedOrBlue {
	private JButton btnRed, btnBlue;
	private JFrame frame;
	private JPanel panel;

	private RedOrBlue() {
		createForm();
		addButtons();
		frame.add(panel);
		frame.setVisible(true);
	}

	private void createForm() {
		frame = new JFrame();
		frame.setTitle("Red or Blue");
		frame.setSize(250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false); // size not changeable
		panel = new JPanel();
		panel.setBackground(Color.lightGray);
		panel.setLayout(null);
	}

	private void addButtons() {
		btnRed = new JButton("RED");
		btnRed.setBounds(20, 90, 100, 40);
		btnRed.setForeground(Color.red);
		btnRed.addActionListener(new RedHandler());
		panel.add(btnRed);

		btnBlue = new JButton("BLUE");
		btnBlue.setBounds(120, 90, 100, 40);
		btnBlue.setForeground(Color.blue);
		btnBlue.addActionListener(new BlueHandler());
		panel.add(btnBlue);
	}


	class RedHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			panel.setBackground(Color.RED);
			btnRed.setEnabled(false);
			btnBlue.setEnabled(true);
		}
	}

	class BlueHandler implements ActionListener { 
		public void actionPerformed(ActionEvent event) {
			panel.setBackground(Color.BLUE);
			btnBlue.setEnabled(false);
			btnRed.setEnabled(true);
		}
	}


	public static void main(String[] args) {
		new RedOrBlue();
	}
}
