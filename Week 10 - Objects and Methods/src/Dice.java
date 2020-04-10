import java.util.Random;

public class Dice {
	int faceValue;

	public void roll() {
		Random rand = new Random();
		faceValue = rand.nextInt(6) + 1;
	}

	public int getFaceValue() {	
		return faceValue;
	}
}
