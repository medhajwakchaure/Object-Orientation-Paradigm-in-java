class Parent
{
	{
		System.out.println("Parent Non static block");
	}
	Parent()
	{
		System.out.println("Parent Constructor");
	}
	int a=fun();
	int fun()
	{
		System.out.println("Parent Fun");
		return 10;
	}
	
}
class Child extends Parent
{
		{
		System.out.println("CHild Non static block");
	}
	Child()
	{
		System.out.println("Child Constructor");
	}
	int a=gun();
	int gun()
	{
		System.out.println("Child Fun");
		return 20;
	}
	public static void main(String args[]) throws Exception
	{
		Child C=new Child();
	}
}