import java.lang.*;

public class Student extends Person
{

	private String sid;
	private double cgpa;
	
	public  Student()
	{
		System.out.println("Empty  Student");
	}
	public  Student(String name, int age, String sid, double cgpa)
	{
		super(name, age);
		System.out.println("Parameterized  Student");
		this.sid = sid;
		this.cgpa = cgpa;
	}
	public void setSid(String sid)
	{
		this.sid = sid;
	}
	public void setCgpa(double cgpa)
	{
		this.cgpa = cgpa;
	}
	public String getSid()
	{
		return sid;
	}
	public double getCgpa()
	{
		return cgpa;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Student ID: "+sid);
		System.out.println("CGPA: "+cgpa);
	}
}