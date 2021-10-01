import java.util.Random;

/**
 * 
 * @author mc
 * 
 * This program has a number of errors and has been written for you to practice
 * your testing skills on - it should NOT be taken as a model answer.
 * 
 */
public class TestSlotMachine {
	private int slot1;
	private int slot2;
	private int slot3;

	void spin() {
		Random randomNumber = new Random();
		slot1 = randomNumber.nextInt(9);
		slot2 = randomNumber.nextInt(9);
		slot3 = randomNumber.nextInt(9);
	}
	
	int getSlot1() {
		return slot1;
	}
	
	int getSlot2() {
		return slot2;
	}

	int getSlot3() {
		return slot3;
	}

	String getResult() {
		String result;

		if (slot1 == slot2 && slot2 == slot3) {
			result = "3 numbers match";
		}
		else if (slot1 == slot2 || slot2 == slot3 || slot3 == slot1) {
			result = "2 numbers match";
		}
		else {
			result = "0 numbers match";
		}
		return result;
	}

	private void displaySlots() {
		System.out.println(slot1 + " " + slot2 + " " +  slot3);
	}
	
	public static void main(String[] args) {
		TestSlotMachine process = new TestSlotMachine();
		process.spin();
		System.out.println(process.getSlot1());
		System.out.println(process.getSlot2());
		System.out.println(process.getSlot3());
		process.displaySlots();
		System.out.println(process.getResult());
	}
}
