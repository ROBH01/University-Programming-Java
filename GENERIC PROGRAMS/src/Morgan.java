
public class Morgan {
	
	private int reverseNum(String num) {
		StringBuilder rev = new StringBuilder();
		for (int i = num.length()-1; i >= 0; i--) {
			rev.append(num.charAt(i));
		}
		return Integer.parseInt(rev.toString());
	}

	public static void main(String[] args) {
		Morgan process = new Morgan();
		String in = "636";
		int originalInput = Integer.parseInt(in); //get int from input string
		int reversedInput = process.reverseNum(in); //reverse int from input string
		int sum = originalInput + reversedInput; //sum nums

		String sumStr = Integer.toString(sum); //convert sum to String to check first and last matches
		int numberIterations = 1;

		while(!sumStr.substring(0, 1).equals(sumStr.substring(sumStr.length()-1))) {
			numberIterations++;
			int sumInReversed = process.reverseNum(sumStr);
			sum = sum + sumInReversed;
			sumStr = Integer.toString(sum);
		}
		System.out.println(numberIterations+" "+sumStr);
	}
}