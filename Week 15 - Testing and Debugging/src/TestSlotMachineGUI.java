import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestSlotMachineGUI {
	private JLabel lblSlot1, lblSlot2, lblSlot3, lblResult;
	private JPanel panel;
	private JFrame frame;
	private TestSlotMachine slotMachine = new TestSlotMachine();
	
	private TestSlotMachineGUI() {
		createForm();
		addSlots();
		addButtons();
		frame.add(panel); 
		frame.setVisible(true);
	}

	private void createForm() {
		frame = new JFrame();
		frame.setTitle("Slot Machine");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
	}

	private void addSlots() {
		lblSlot1 = new JLabel(" - ");
		lblSlot1.setBounds(80, 80, 100, 20);
		panel.add(lblSlot1);

		lblSlot2 = new JLabel(" - ");
		lblSlot2.setBounds(180, 80, 100, 20);
		panel.add(lblSlot2);

		lblSlot3 = new JLabel(" - ");
		lblSlot3.setBounds(280, 80, 100, 20);
		panel.add(lblSlot3);

		lblResult = new JLabel("Result will appear here");
		lblResult.setBounds(140, 140, 150, 20);
		panel.add(lblResult);
	}

	private void addButtons() {
		JButton btnSpin = new JButton("Spin");
		btnSpin.setBounds(50, 200, 100, 20);
		btnSpin.addActionListener(new SpinHandler());
		panel.add(btnSpin);

		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(250, 200, 100, 20);
		btnExit.addActionListener(new ExitHandler());
		panel.add(btnExit);
	}

	class SpinHandler implements ActionListener { 
		public void actionPerformed(ActionEvent event) {
			slotMachine.spin();
			lblSlot1.setText(String.valueOf(slotMachine.getSlot1()));
			lblSlot2.setText(String.valueOf(slotMachine.getSlot2()));
			lblSlot3.setText(String.valueOf(slotMachine.getSlot3()));
			lblResult.setText((slotMachine.getResult()));
		}
	}
	
	class ExitHandler implements ActionListener { 
		public void actionPerformed(ActionEvent event) {
			System.exit(0);
		}
	}

	
	public static void main(String[] args){
		new TestSlotMachineGUI();
	}	
}
