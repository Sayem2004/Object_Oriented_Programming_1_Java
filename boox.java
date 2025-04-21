public class boox
{
	private double length;
	private double height;
	private double width ;
	public double volume;
	
	public void setheigth(double h)
	{
		height = h;
	}
	public double getheight()
	{
		return height;
	}
	public void setlength(double l)
	{
		length=l;
	}
	public double getlength()
	{
		return length;
	}
	public void setwidth(double w)
	{
		width=w;
	}
	public double getwidth()
	{
		return width;
	}
	public double setvolume()
	{
		volume=length*width*height;
		return volume;
	}
	
	
	public static void main(String[]args)
	{
		boox obj=new boox();
		obj.setheigth(67.8);
		obj.setlength(66.8);
		obj.setwidth(62.8);
		System.out.print("VOlume"+obj.setvolume());
	}
	
	
	
	
	
	
	
}