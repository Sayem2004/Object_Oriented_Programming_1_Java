import java.lang.*;

public class Teacher extends Person
{
	private String tid;
	private int roomno;
	
	public Teacher()
	{
		System.out.println("Empty Teacher");
	}
	public Teacher(String name, int age, String tid, int roomno)
	{
		super(name, age);
		System.out.println("Parameterized Teacher");
		this.tid = tid;
		this.roomno = roomno;
	}
	public void setTid(String tid)
	{
		this.tid = tid;
	}
	public void setRoomNo(int roomno)
	{
		this.roomno = roomno;
	}
	
	public String getTid()
	{
		return tid;
	}
	public int getRoomNo()
	{
		return roomno;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Teacher ID: "+tid);
		System.out.println("Room no: "+roomno);
	}
}