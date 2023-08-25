class Employee
{
	int id=10;
	
	void show()
	{
		System.out.println("The employee id is :"+id);
	}
}
class Manager extends Employee
{
	int id=20;
	
	void show()
	{
		System.out.println(" The manager id is :" +id);
		super.show();
	}
	public static void main(String args[])
	{
		Manager Medhaj=new Manager();
		Medhaj.show();
	}
}
