class Employee
{
	float salary = 50000;
	
	void cal_Salary()
	{	
		System.out.println("Employee Salary = "+salary);
	}
}

class Manager extends Employee
{
	int bonus = 10000;
	
	void cal_Salary()
	{	
		System.out.println("Manager Salary = "+(salary+bonus));
	}
}

class Salesman extends Employee
{
	int incentive = 7000;
	void cal_Salary()
	{	
		System.out.println("Salesman Salary = "+(salary+incentive));
	}
}


class FindSalary
{
	public static void main(String args[])
	{
		Employee[] E = new Employee[6];			//Array type is Employee Because It can Store Child also & Self also.
		E[0] = new Employee();       
		E[1] = new Manager();			//upcasting(Parent Reference Child Object)
		E[2] = new Salesman();		    //upcasting(Parent Reference Child Object)
		E[3] = new Employee();
		E[4] = new Manager();			//upcasting(Parent Reference Child Object)
		E[5] = new Salesman();			//upcasting(Parent Reference Child Object)
		
		for(int i = 0; i < 6; i++)
		{
			E[i].cal_Salary();
		}
		
		//Salesman S = new Employee();    //downcasting Not Allowed (Compiletime error)
	}
}

// due to virtual keyword Object Type Function gets call.(i.e overriding)