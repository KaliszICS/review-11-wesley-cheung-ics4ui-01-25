
class Notes {
	public static void main(String[] args) {
		//creating an array

		// int[] numArray;

		//empty array - filled with default values

		int[] numArray = new int[5];  //creates an int array of size 5

		//prebuilt array

		numArray = new int[]{1, 3, 5}; //need to specify new int if you don't declare the array on the same line

		int[] numArray2 = {1, 3, 5, 7}; //only doable when the array is declared on the same line

		numArray[0] = 5;
		System.out.println(numArray[1]);
		System.out.println(numArray);

		//looking through an array

		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}

		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = numArray[i] + 8;
			System.out.println(numArray[i]);
		}

		int num = 13;
		int index = -1; //default for if you don't find it
		//  {13, 11, 13}
		for (int i = 0; i < numArray.length; i++) { // finds the last occurrence
			if (numArray[i] == num) {
				index = i;
				// break;
				// i = numArray.length;
			}
		}

		System.out.println(index);

		String[] arr = {"z", "b", "c"};
		firstElementA(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		//copy an array

		String[] copyArr = new String[arr.length];

		for (int i= 0; i < arr.length; i++) {
			copyArr[i] = arr[i];
		}
	}

	// arr = value that is provided
	public static void firstElementA(String[] arr) {
		//any array modifications will alter the array outside of the function
		//arrays don't to return anything if they are altering
		arr[0] = "a";
	}
}
