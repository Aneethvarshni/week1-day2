package week1.day2;

public class StringReverse {

	public static void main(String[] args) {
		String value = "madamm";
		// String rev = "";
		char[] array1 = value.toCharArray();
		char[] array2 = new char[array1.length];
		for (int i = array1.length - 1, j = 0; i >= 0; i--, j++) {
			array2[j] = array1[i];
		}
		if (String.valueOf(array2).equals(value)) {
			System.out.println("It is a palindrome");

		} else {
			System.out.println("The string " + value + " and its reversed value " + String.valueOf(array2)
					+ " are not same!! Hence it is not palindrome");
		}

	}

}
