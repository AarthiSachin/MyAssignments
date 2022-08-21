package week3.w3d1assignments;

public class Desktop extends Computer {
	public void desktopSize()
	{
		System.out.println("The size of the desktop is 1920 * 1800");
	}

	public static void main(String[] args) 
	{
		Desktop d = new Desktop();
		d.desktopSize();
		d.ComputerModel();
	}

}
