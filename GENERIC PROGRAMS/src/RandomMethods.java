import java.util.*;

public class RandomMethods {

	private Scanner scan = new Scanner(System.in);

	private void store3Prices() {
		double[] prices = new double[3];
		for (int i = 0; i < prices.length; i++) {
			System.out.print("Type number " + i + "    ");
			prices[i] = scan.nextDouble();
		}
		for (double price : prices) {
			System.out.println(price);
		}
		System.out.println(Arrays.toString(prices));
	}

	private void switchExample() {
		System.out.println("1. First");
		System.out.println("2. Second");
		System.out.println("3. Third");
		System.out.print("Select your choice: ");
		int choice = scan.nextInt();

		switch (choice) {
		case 1: System.out.println("You chose first");
				break;
		case 2: System.out.println("You chose second");
				break;
		case 3: System.out.println("You chose third");
				break;
		}
	}

	private String reverseString(String string) {
		if (string.isEmpty()) {
			return "String empty";
		}
		StringBuilder reversedString = new StringBuilder();

		for (int i = string.length()-1; i >= 0; i--) {
			reversedString.append(string.charAt(i));
		}
		return reversedString.toString();
	}

	private void isNumberDivisibleBy3or5(int number){
		if (number % 5 == 0 && number % 3 == 0) {
			System.out.println("Number is divisible by both 3 and 5");
		}
		else if (number % 3 == 0) {
			System.out.println("Number is only divisible by 3");
		}
		else if (number % 5 == 0) {
			System.out.println("Number is only divisible by 5");
		}
		else {
			System.out.println("Number is not divisible by either 5 or 3");
		}
	}

	private String getValueFromHashMap(int index) {
		HashMap<Integer, String> names = new HashMap<>();
		names.put(1, "Robert");
		names.put(2, "Robbert");
		return names.get(index);
	}

	private boolean sameWordsAndQuantitiesInTwoLists(ArrayList<String> listA, ArrayList<String> listB) {
		Collections.sort(listA);
		Collections.sort(listB);

		return listA.equals(listB);
	}

	private String encodeMessageWithSpecifiedKey(String messageToEncode, String alphabetKey) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder encodedText = new StringBuilder();
		messageToEncode = messageToEncode.toLowerCase();
		alphabetKey = alphabetKey.toLowerCase();

		for (int i = 0; i < messageToEncode.length(); i++) {
			char x = messageToEncode.charAt(i);
			if (Character.isLetter(x)) {
				for (int j = 0; j < alphabet.length(); j++) {
					char y = alphabet.charAt(j);
					if (y == x) {
						encodedText.append(alphabetKey.charAt(j));
						break;
					}
				}
			}
			else {
				encodedText.append(x);
			}
		}
		return encodedText.toString();
	}

	private String decodeMessageWithSpecifiedKey(String messageToDecode, String alphabetKey) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder decodedMessage = new StringBuilder();
		messageToDecode = messageToDecode.toLowerCase();
		alphabetKey = alphabetKey.toLowerCase();

		for (int i = 0; i < messageToDecode.length(); i++) {
			char x = messageToDecode.charAt(i);
			if (Character.isLetter(x)) {
				for (int j = 0; j < alphabetKey.length(); j++) {
					char y = alphabetKey.charAt(j);
					if (y == x) {
						decodedMessage.append(alphabet.charAt(j));
						break;
					}
				}
			}
			else {
				decodedMessage.append(x);
			}
		}
		return decodedMessage.toString();
	}

	private void recursionFromStartToEnd(int start, int end) {
		System.out.println("running for the " + start + " time.");
		if (start == end) {
			System.out.println("finished");
		}
		else {
			recursionFromStartToEnd(start + 1, end);
		}
	}

	// How to write an ENUM
	enum Colour {
		RED, GREEN, BLUE, ORANGE, YELLOW, PURPLE
	}

	@SuppressWarnings("unused")
	// Annotation suppressWarnings() is used to tell the compiler that the warnings shown are in fact known by the
	// programmer and is a way of telling the compiler to not show them as "warnings" because the programmer is aware of it
	// and considers it as a non-warning.

	/* GENERICS EXAMPLE!, Can be OR cannot be STATIC. This depends where it is! */
	private <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}



	public static void main(String[] args) {
		RandomMethods rm = new RandomMethods();

		//rm.store3Prices();
		//rm.switchExample();
		//System.out.println(rm.reverseString("Robert"));
		//rm.isNumberDivisibleBy3or5(15);
		//System.out.println(rm.getValueFromHashMap(2));

		//ArrayList<String> listA = new ArrayList<>();
		//listA.add("I");
		//listA.add("legend");
		//listA.add("am");
		//ArrayList<String> listB = new ArrayList<>();
		//listB.add("am");
		//listB.add("legend");
		//listB.add("I");
		//System.out.println(rm.sameWordsAndQuantitiesInTwoLists(listA, listB));

		//System.out.println(rm.encodeMessageWithSpecifiedKey("IAMROBH", "ZYXWVUTSRQPONMLKJIHGFEDCBA"));
		//System.out.println(rm.decodeMessageWithSpecifiedKey("RZNILYS", "ZYXWVUTSRQPONMLKJIHGFEDCBA"));

		//rm.recursionFromStartToEnd(1, 10);
		//System.out.println(Arrays.toString(Colour.values()));
	}
}