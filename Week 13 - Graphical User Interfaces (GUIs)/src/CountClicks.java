import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CountClicks {
	private JLabel lblCount;
	private JButton btnPush;
	private JPanel panel;
	private JFrame frame;
	private int count = 0;
	
	private CountClicks() {
		createForm();
		addFields();
		addButtons();
		frame.add(panel);
		frame.setVisible(true);
		btnPush.addActionListener(new PushHandler()); 
	}
	
	private void createForm() {
		frame = new JFrame();
		frame.setTitle("Count me");
		frame.setAlwaysOnTop(true); // to make it in first plan
		frame.setSize(360,120);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
	}
	
	private void addFields() {
		lblCount = new JLabel("Count = " + count);
		lblCount.setBounds(220, 15, 100, 20);
		panel.add(lblCount);
	}
	
	private void addButtons() {
		btnPush = new JButton ("Click me");
		btnPush.setBounds(90, 10, 100, 25);
		panel.add(btnPush);
	}
	
	class PushHandler implements ActionListener { 
		public void actionPerformed(ActionEvent event) {
			count++;
			lblCount.setText("Count = " + count);
		}
	}
	
	public static void main(String[] args) {
		new CountClicks();
	}
}
