class Parent
{
	final void fun()
	{
		System.out.println("Parent Fun");
	}

	public static void main(String args[])
	{
		Parent P = new Parent();
		P.fun();
	}
}


class Child extends Parent
{
    //	void fun()
    //	{
    //		System.out.println("Child Fun");
   //	}
}



//final method cannot be override