package week3.w3d1assignments;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println(id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println(name);
	}
	public void getStudentInfo(String email)
	{
		System.out.println(email);
	}
	public void getStudentInfo(int id, long phoneNumber)
	{
		System.out.println(phoneNumber);
	}
	public static void main(String[] args) 
	{
		Students s = new Students();
		s.getStudentInfo(73);
		s.getStudentInfo("abc@gmail.com");
		s.getStudentInfo(3, "Student 1");
		s.getStudentInfo(35,2120534210);
	}
}
