class Employee
{
	
	Employee(int empid,String name)
	{
		this.empid=empid;
		this.name=name;
	}
	void print()
	{
		System.out.println("The employee id is :" +empid);
		System.out.println("The employee name is :" +name);
		
	}
	
}
class Manager extends Employee
{
	Manager(int empid,String name,int bonus)
	{
		super(empid,name);
		this.bonus=bonus;
	
	}
	void print()
	{
		super.print();
		System.out.println("The Manager bonus is :" +bonus);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Manager M=new Manager(1,"Medhaj",20000);
		M.print();
	}
}