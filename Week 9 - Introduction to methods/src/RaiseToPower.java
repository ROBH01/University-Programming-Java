
public class RaiseToPower {

	public int cube(int a) { // cube method (the purpose of it is to do a single task: get the cube calculation of an int.
		return a * a * a;
	}

	public void numberAndPower(int number, int power) { // this method has a task: return the number at the power.
		int result = (int)Math.pow(number, power);
		System.out.println("The result is: " + result);
	}


	public static void main(String[] args) {
		RaiseToPower process = new RaiseToPower();
		System.out.println("The cube is: " + process.cube(3));
		System.out.println("The cube is: " + process.cube(10));
		System.out.println("The cube is: " + process.cube(2));
		process.numberAndPower(5, 2); // can be made with return too.
		process.numberAndPower(10, 4);
	}
}