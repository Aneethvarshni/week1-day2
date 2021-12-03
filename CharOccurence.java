package week1.day2;

public class CharOccurence {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
	char[] ch = str.toCharArray();
		int length = str.length();
		for(int i=0;i<=length-1;i++)
		{
			if(ch[i]=='c')
			{
				count+=1;
			}
		}
		System.out.println("Occurence of c character is:" +count);

	}

}
