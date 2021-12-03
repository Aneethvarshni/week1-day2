package week1.day2;

public class Calculator {
	public int add(int n1,int n2) {
		return n1+n2;
	}
	public double sub(double n1,double n2) {
		return n1-n2;
	}
	public double mul(double n1,double n2)
	{
		return n1*n2;
	}
	public int div(int n1,int n2)
	{
		return n2/n1;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(10, 20));
		System.out.println(calc.sub(30, 10));
		System.out.println(calc.mul(10, 10));
		System.out.println(calc.div(50, 10));

	}

}
