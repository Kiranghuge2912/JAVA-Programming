class Demo
{
	int a=10;
	int b=20;
	
	void fun()
	{
		Demo a[]={new Demo(), new Demo(), new Demo()};    		//object array
		for(int i = 0; i < 3; i++)
		{
			System.out.println("a = "+a[i].a+" b = "+a[i].b);
		}
	}
	
	public static void main(String args[])
	{
		Demo s = new Demo();
		s.fun();
	}
	
}