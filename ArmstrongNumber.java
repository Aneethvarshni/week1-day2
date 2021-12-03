package week1.day2;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int input= 153;
		int original =0;
		int calculated=0;
		original=input;
		while(input>0)
		{
			int reminder=input%10;
			input=input/10;
			calculated=(reminder*reminder*reminder)+calculated;	
		} 
		if(calculated==original) {
			System.out.println("It is an armstrong number");
			//break;
		} 
		else
		{
			System.out.println("Not an armstrong number");
		}
	}

}
