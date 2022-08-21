package week3.bank;

public class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("This is deposit");
	}
	public static void main(String[] args)
	{
		AxisBank a = new AxisBank();
		BankInfo b = new BankInfo();
		a.deposit();
		b.deposit();
		a.saving();
		a.fixed();
		b.fixed();
	}
}
