package week1.day2;

public class IntersectionOfNumbers {

	public static void main(String[] args) {
		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };
		int array3[] = new int[array1.length];
		int k = 0;
		for (int i = 0; i <= array1.length - 1; i++) {
			for (int j = 0; j <= array2.length - 1; j++) {
				if (array1[i] == array2[j]) {
					array3[k] = array1[i];
					k++;
					//
				}
			}
		}
		for (int i = 0; i < k; i++) {
			System.out.println("The matched items are:" + array3[i]);
		}
	}

}
