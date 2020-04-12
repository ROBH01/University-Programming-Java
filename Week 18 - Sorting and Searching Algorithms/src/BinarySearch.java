
class BinarySearch {

	String binarySearch(int key, int[] pool) {
		int bottom = 0;
		int top = pool.length - 1;
		int count = 1;

		while (top >= bottom) {
			System.out.println(count++ + "...");
			int middle = (bottom + top) / 2;
			System.out.println("middle is " + middle);

			if (pool[middle] == key) {
				return "Number " + key + " found at index " + middle;
			}
			else if (pool[middle] < key) {
				bottom = middle + 1;
			}
			else {
				top = middle - 1;
			}
		}
		return "Number " + key + " not found";
	}
}