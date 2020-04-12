
public class Test {

	public static void main(String[] args) {
		//linear search
		int[] numbers = {1, 22, 55, 85, 78, 96, 75, 35, 76, 44};
		LinearSearch ls = new LinearSearch();
		System.out.println(ls.linearSearch(76, numbers));
		System.out.println(ls.linearSearch(8, numbers));
		System.out.println(ls.linearSearch(45757, numbers));
		System.out.println(ls.linearSearch(2, numbers));
		System.out.println(ls.linearSearch(55, numbers));
		
        // binary search
		int[] numbers2 = {18, 42, 11, 13, 88, 75, 44, 99, 78, 66, 15, 42, 86, 33, 32};
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.binarySearch(55, numbers2));
		System.out.println(bs.binarySearch(2, numbers2));
		System.out.println(bs.binarySearch(13, numbers2));
		System.out.println(bs.binarySearch(78, numbers2));
		System.out.println(bs.binarySearch(99, numbers2));
	}
}