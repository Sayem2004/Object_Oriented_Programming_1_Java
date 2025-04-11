public class Bill
{
	public static void main(String[]args)
	{
	int hw=800;
	int mw=(hw*30*24);
	float w=mw/1000;// kwh
	float bill=w*10;
	System.out.print("Bill = "+bill);
    }
}