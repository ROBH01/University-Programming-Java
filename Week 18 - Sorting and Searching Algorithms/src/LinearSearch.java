
class LinearSearch {
	
	String linearSearch(int key, int[] pool) {
		for (int i = 0; i < pool.length; i++) {
			if (key == pool[i]) {
				return "Number " + key + " is at position " + i + " in the index.";
			}
		}
		return "Number " + key + " not found";
	}
}