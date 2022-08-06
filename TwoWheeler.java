package week1.day1;

public class TwoWheeler {
	/*
	 * Create a class for TwoWheeler and declare below global variables with
	 * appropriate values
	 */
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 123456789l;
	boolean isPunctured = false;
	String bikeName = "RE Himalayan";
	double runningKM = 45.8893;
	/*
	 * create object for TwoWheeler and call all the variables inside main method
	 * and print the values.
	 */

public static void main(String[] args)
{
	TwoWheeler t = new TwoWheeler();
	System.out.println("No.of.Wheels :"+ t.noOfWheels);
	System.out.println("No.of.Mirrors :"+ t.noOfMirrors);
	System.out.println("ChassisNumber of the bike :"+ t.chassisNumber);
	System.out.println("Puncture status of the bike :"+ t.isPunctured);
	System.out.println("Name of the bike :"+ t.bikeName);
	System.out.println("Running KM of the bike :"+ t.runningKM);
}
}