class calculator
{
	static int a=10,b=2;
	public static void main(String args[])
	{
		add();
		sub();
		mul();
		div();
	}
	public static void add()
	{
		System.out.println("Addition is= "+(a+b));
	}
	public static void sub()
	{
		System.out.println("subtraction is= "+(a-b));
	}
	public static void mul()
	{
		System.out.println("multiplication is= "+(a*b));
	}
	public static void div()
	{
		System.out.println("Division is= "+(a/b));
	}
}
