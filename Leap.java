public class Leap
{
	public static void main(String[]args)
	{
		int year= 2005;
		if(((year%4==0)&&(year%400==0))||(year%100!=0))     
			System.out.print("This year is LEAP year");
		else
			System.out.print("This year is NOT LEAP year");
	}
}