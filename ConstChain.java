public class ConstChain
{
	private int num;
	private String name;
	
	public ConstChain()
	{
		this(10);
		System.out.println("Empty Constructor");
	}
	
	public ConstChain(int a)
	{
		this("OOP1 F", a);
		System.out.println("Para Constructor 1");
	}
	
	public ConstChain(String name, int num)
	{
		this.name = name;
		this.num=num;
		System.out.println("Para Constructor 2");
	}
	
	public static void main(String []args)
	{
		ConstChain obj = new ConstChain();
		ConstChain ob = new ConstChain(100);
		ConstChain oj = new ConstChain("Hello", 200);
	}
	
	
}