interface W
{
	public abstract void fun();			
	void gun();						//by default abstract
}

interface X
{
	public abstract void run();			
}

interface Y
{
	public abstract void sun();			
}

interface Z
{
	public abstract void mun();			
}

interface AMEZON extends W, X, Y, Z
{
	
}

class User implements AMEZON
{
	public void fun()
	{
		System.out.println("This is Fun");
	}
	
	public void gun()
	{
		System.out.println("This is Gun");
	}
	
	public void run()
	{
		System.out.println("This is Run");
	}
	
	public void sun()
	{
		System.out.println("This is Sun");
	}
	
	public void mun()
	{
		System.out.println("This is Mun");
	}
	
	public static void main(String args[])
	{
		User U = new User();
		U.fun();
		U.gun();
		U.run();
		U.sun();
		U.mun();
	}
	
}