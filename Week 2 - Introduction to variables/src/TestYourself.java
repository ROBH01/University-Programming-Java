
public class TestYourself {

	public static void main(String[] args) {
		System.out.println(15 + 7 * 3);
		System.out.println((15 + 7) * 3);
		System.out.println(3 * 6 + 10 / 5 + 5);
		System.out.println((27 % 5) + (7 % 3)); // MOD FORMULA =  a MOD b = a-b*(a/b)
		System.out.println(100.0 / 2 / 2 / 2); // It assumes that are int numbers. If typed 100.0 it consider it as double.
		System.out.println(100 / (2 / 2) / 2);

		//System.out.println(5 + 2);  // valid
		//System.out.println(5 + 2 * (15 - 3); // invalid. missing another ")"
		//System.out.println (5 + 2(;   // invalid. should be: " (5 + 2);"
		//System.out.println(5 + 2 (4) ) ; // invalid. should be: "(5 + 2 * (4));"
	}
}