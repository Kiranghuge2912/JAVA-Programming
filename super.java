class Parent
{
	int x = 10;

	Parent()
	{
		System.out.println("Parent Constructor");
	}


	Parent(int y)
	{
		System.out.println("Parent Parameterized Constructor");
	}

}

class Child extends Parent
{
	int x = 20;
	
	Child()
	{
		//super(10);
		System.out.println("Child Constructor");
	}

	Child(int y)
	{
		this();
		System.out.println("Child Paremetrized Constructor");
	}


	void fun()
	{
		int x = 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);

	}

	public static void main(String args[])
	{
		Child c= new Child(10);
		c.fun();
	}
}