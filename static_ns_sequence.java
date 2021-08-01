class Parent
{
	static int a = m1();
	int b = m2();
	
	static int m1()
	{
		System.out.println("Parent M1");
		return 10;
	}

	int m2()
	{
		System.out.println("Parent M2");
		return 20;
	}	
	
	static
	{
		System.out.println("Parent Static Block");
	}
	
	
	{
		System.out.println("Parent Non-Static Block");
	}
	
	Parent()
	{
		System.out.println("Parent Constructor");
	}
	
}



class Child extends Parent
{
	static int c = m3();
	int d = m4();
	
	static int m3()
	{
		System.out.println("Child M3");
		return 30;
	}

	int m4()
	{
		System.out.println("Child M4");
		return 40;
	}	
	
	static
	{
		System.out.println("Child Static Block");
	}
	
	
	{
		System.out.println("Child Non-Static Block");
	}
	
	public static void main(String args[])
	{
		Child C = new Child();
		System.out.println("Child Main Method");
	}
	
	Child()
	{
		System.out.println("Child Constructor");
	}

}