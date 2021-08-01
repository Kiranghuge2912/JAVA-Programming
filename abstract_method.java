abstract class Demo							 	 //abstract class(object not allowed)
{
	void fun()								 	 //concrete method
	{
		System.out.println("Fun function In Demo(concrete fun)");
	}
	
	abstract void gun();					 	 //abstract method
	
	Demo()									  	 //constructor(call from child class)
	{
		System.out.println("Demo constructor");
	}

	public static void main(String args[])
	{
		//Demo d = new Demo();				 	 //we can't create obj of abstract class(if object-fun call-No defination)
	}
}


class Test extends Demo							  //concrete class
{
	void gun()									  //abstract function defination in child class(overriding)
	{
		System.out.println("Gun Function In Test(abstract in Demo)");
	}
	
	Test()										  //constructor(implicitly 1st line super())
	{
		System.out.println("Test constructor");	 
	}
	
	public static void main(String args[])
	{
		Test T = new Test();				 	 //object of Concrete class
		T.fun();
		T.gun();
	}	
}


//abstract class contain - (some abstract / some non abstrct / all abstract / all concrete )methods