public class PracticeProblem {

	public static void main(String args[]) {

		
	}
	public static int[] createIntArray() {
		int[] numArray = new int[5];
		for (int i = 1; i <= 5; i++) {
			numArray[i-1] = i;
		}
		return numArray;
	}

	public static String[] createArray(String first, String second, String third, String fourth) {
		String[] strArray = new String[4];
		strArray[0] = first;
		strArray[1] = second;
		strArray[2] = third;
		strArray[3] = fourth;
		return strArray;
	}
	public static int findValue(int term, int[] numArray) {
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] == term) {
				return i;
			}
		}
		return -1;
	}
	public static int findThirdValue(String term, String[] strArray) {
		int count = 0;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == term) {
				count += 1;
				if (count == 3) {
					return i;
				}
			}
		}
		return -1;
	}


}
