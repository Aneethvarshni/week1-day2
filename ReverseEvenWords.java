package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] array = test.split(" ");
		for (int i = 0; i <= array.length - 1; i++) {
			if (i % 2 == 1) {
				String evenWords = array[i];
				char[] ch = evenWords.toCharArray();
				char[] revCh = new char[evenWords.length()];
				int k=0;
				for (int j = ch.length-1 ; j >=0; j--) {
					revCh[k] = ch[j];
					k++;
				}
					String str = String.valueOf(revCh);
					System.out.print(str+" ");
				
				} else {
				System.out.print(array[i]+" ");
			}

		}

	}

}
