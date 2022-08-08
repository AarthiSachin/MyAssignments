package week1.day2Assignments;

public class Calculator 
{
	public int addNum(int a, int b, int c)
	{
		return a+b+c;
	}
	public int subNum(int a, int b)
	{
		return a-b;
	}
	public double mulNum(double a, double b)
	{
		return a*b;
	}
	public float divNum(float a, float b)
	{
		return a/b;
	}

public static class MyCalculator
{
	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		System.out.println("Addition of Numbers : " + cal.addNum(23, 59, 48));
		System.out.println("Subtraction of Numbers : " + cal.subNum(59, 48));
		System.out.println("Product of Numbers : " + cal.mulNum(9, 8));
		System.out.println("Division of Numbers : " + cal.divNum(59, 48));
	}

}
}
