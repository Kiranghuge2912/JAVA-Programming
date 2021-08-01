class Feeling
{
	static void feeling()
	{	
		System.out.println("Any Feeling\n");
	}
}

class HappyFeeling extends Feeling
{
	static void feeling()
	{	
		System.out.println("Happy Feeling\n");
	}
}

class SadFeeling extends Feeling
{
	static void feeling()
	{	
		System.out.println("Sad Feeling\n");
	}
}


class FindFeeling
{
	public static void main(String args[])
	{
		System.out.println("Reference Of Feeling & Object Of Feeling:-");
		Feeling F1 = new Feeling();                              //Parent Reference & Parent Object
		F1.feeling();                                            //Parent Function execute
		
		System.out.println("Reference Of Feeling & Object Of Happy Feeling:-");
		Feeling	F2 = new HappyFeeling();						 //Parent Reference & Child Object(Happy)
		F2.feeling();											 //Parent Function execute due to Static
		
		System.out.println("Reference Of Feeling & Object Of Sad Feeling:-");
		Feeling F3 = new SadFeeling();					         //Parent Reference & Child Object(Sad)
		F3.feeling();											 //Parent Function execute due to Static
		
	}
}

// due to static keyword Reference Type Function gets call.(i.e Method Hiding)