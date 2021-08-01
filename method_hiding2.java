class Employee
{
	static float salary = 50000;
	
	static void cal_Salary()
	{	
		System.out.println("Employee Salary = "+salary);
	}
}


class Manager extends Employee
{
	static int bonus = 10000;
	
	
	static void cal_Salary()
	{	
		System.out.println("Manager Salary = "+(salary+bonus));      
	}
	
}
 
 
class FindSalary
{
	public static void main(String args[])
	{
		Employee E1 = new Employee();       
		Employee E2 = new Manager();	
		
			E1.cal_Salary();		//Parent(Employee) cal_Salary() execute
			E2.cal_Salary();        //Parent(Employee) cal_Salary() execute
		
	}
}

// due to static keyword Reference Type Function gets call(Child class method get hide i.e Method Hiding).