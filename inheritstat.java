class Parent
{
	
	static int a=fun();
	static int fun()
	{
		System.out.println("Parent fun");
		return 10;
	}
	static{
		System.out.println("Parent static block");
	}
	
}
class Child extends Parent
{
		static int b=gun();
	static int gun()
	{
		System.out.println("Child gun");
		return 20;
	}
	static{
		System.out.println("Child static block");
	}
	public static void main(String args[]) throws Exception
	{
		Class.forName("Child");
	}
}