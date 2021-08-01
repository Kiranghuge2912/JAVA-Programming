class Demo
{
	void fun(int... a)			//variable argument function
	{
		for(int i = 0 ; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	
	void gun()
	{
		int a[] = { 70, 80, 90, 100};
		
		fun(10);			//fun with 1 parameter
		fun(20,30);			//fun with 2 parameter
		fun(40,50,60);		//fun with 3 parameter
		fun(a);				//fun with int array parameter
	}
	
	
	public static void main(String args[])
	{
		Demo d = new Demo();
		d.gun();
	}


}