class Feeling
{
	void feeling()
	{	
		System.out.println("Any Feeling\n");
	}
	
	public static void main(String args[])
	{
		System.out.println("Reference Of Feeling & Object Of Feeling:-");
		Feeling F1 = new Feeling();                              //Parent Reference & Parent Object
		F1.feeling();
		
		System.out.println("Reference Of Feeling & Object Of Happy Feeling:-");
		Feeling	F2 = new HappyFeeling();						 //Parent Reference & Child Object(Happy)  (UPCASTING)
		F2.feeling();
		
		System.out.println("Reference Of Feeling & Object Of Sad Feeling:-");
		Feeling F3 = new SadFeeling();					         //Parent Reference & Child Object(Sad)    (UPCASTING)
		F3.feeling();
		
		//HappyFeeling F = new Feeling();       				 //Childe Reference & Parent Object        (DOWNCATING) Not Allowed
	}
}

class HappyFeeling extends Feeling
{
	void feeling()
	{	
		System.out.println("Happy Feeling\n");
	}
}

class SadFeeling extends Feeling
{
	void feeling()
	{	
		System.out.println("Sad Feeling\n");
	}
}


	


// due to virtual keyword Object Type Function gets call.(i.e overriding)