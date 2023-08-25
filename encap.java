import java.io.*;
class Employee
{
	public int emp_id;
	public String name;
	private double salary;
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		System.out.println("The salary of Shubham is :");
		
		return salary;
	}
	
}
class Manager
{
	public static void main(String args[]) throws IOException
	{
		Employee Shubham=new Employee();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Salary:");
		int n=Integer.parseInt(br.readLine());
		Shubham.setSalary(n);
		System.out.println(Shubham.getSalary());
	}
}