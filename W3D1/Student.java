package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName()
	{
		String s[] = {"Stu1", "Stu2", "Stu3","Stu4","Stu5"}; 
		System.out.print("Student names are : ");
		for (int i = 0; i < s.length; i++) 
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	public void studentDept()
	{
		System.out.println("Department Name of the student : Stu2 - IT");
	}
	public void studentId()
	{
		System.out.println("Student ID : 20-BIT-317");
	}

	public static void main(String[] args) 
	{
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();

	}

}
