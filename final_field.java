class Demo
{
	final int a;
	final static int b;

	Demo()
	{
		a = 10;
	}

	void fun()
	{
		//a = 10;  not allowed
		System.out.println(a);
		System.out.println(b);
	}
	
	static
	{
		b = 20;
	}

	public static void main(String args[])
	{
		//a =10;  not allowed
		Demo D = new Demo();
		D.fun();
	}
}


//allowed in static block-   static{ a = 10; }
//allowed in Non static block-  {  a = 10;  }
//allowed in Constructor-    	Demo(){  a = 10;  }
//allowed when variable is define at that time we can initialize- final int a = 10;
