public class ProcessStrings {

	public String reverseString(String string) {	
		String reversedString = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reversedString += string.charAt(i);
		}
		return reversedString;
	}

	public String putTogether(String s1, String s2) {
		return s1 + " " + s2;
	}

	public boolean validateString(String string) {
		boolean goodString;
		if (string.equalsIgnoreCase("y") || string.equalsIgnoreCase("n")) {
			goodString = true;
		}
		else {
			goodString = false;
		}
		return goodString;
	}

	public int countVowels(String string) {
		int count = 0;
		string = string.toLowerCase();

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'a') {
				count++;
			}
			else if (string.charAt(i) == 'e') {
				count++;
			}
			else if (string.charAt(i) == 'i') {
				count++;
			}
			else if (string.charAt(i) == 'o') {
				count++;
			}
			else if (string.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		ProcessStrings process = new ProcessStrings();
		System.out.println(process.reverseString("Melanie"));
		System.out.println(process.putTogether("Melanie", "***REMOVED***"));
		System.out.println(process.reverseString(process.putTogether("Melanie", "***REMOVED***")));
		System.out.println(process.validateString("y"));
		System.out.println(process.countVowels("alumni"));
	}
}
