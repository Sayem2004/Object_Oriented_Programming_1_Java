import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Teacher t1 = new Teacher();
		t1.setName("Steve Rogers");
		t1.setAge(70);
		t1.setTid("T-02");
		t1.setRoomNo(2);
		
		t1.display();
		
		System.out.println("-------------------------");
		
		Teacher t2 = new Teacher("Tony Stark", 46, "T-01", 1);
		t2.display();
		
		System.out.println("--------------------------");
		
		Student s1 = new Student();
		s1.setName("Peter Parker");
		s1.setAge(22);
		s1.setSid("S-01");
		s1.setCgpa(3.5);
		
		s1.display();
		
		System.out.println("--------------------------");
		
		Student s2 = new Student("Ryans Reynolds", 28, "S-02", 3.45);
		s2.display();
		
	}
}