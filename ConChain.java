class A
{
	A()
	{
		this(4);
		System.out.println("From A-1");
	}
	A(int a)
	{
		System.out.println("From A-2");
	}
}
class B extends A
{
	B()
	{
		this(4);
		System.out.println("From B-1");
	}
	B(int a)
	{
		System.out.println("From B-2");
	}
}

public class ConChain
{
	public static void main(String [] args)
	{
		B obj = new B();
	}
	
}