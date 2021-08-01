import java.util.Scanner;


interface BANK
{
	void acceptNo();
	void acceptCvv();
}

class HDFC implements BANK
{
	public void acceptNo()
	{	
		System.out.println("Card NO:-");
		Scanner Sc =  new Scanner(System.in);
		String no = Sc.nextLine();
	}
	
	public void acceptCvv()
	{	
		System.out.println("CVV NO:-");
		Scanner Sc =  new Scanner(System.in);
		int cvv = Sc.nextInt();
	}
}

class SBI implements BANK
{
	public void acceptNo()
	{	
		System.out.println("Card NO:-");
		Scanner Sc =  new Scanner(System.in);
		String no = Sc.nextLine();
	}
	
	public void acceptCvv()
	{	
		System.out.println("CVV NO:-");
		Scanner Sc =  new Scanner(System.in);
		int cvv = Sc.nextInt();
	}
}

class AMEZON
{
	void payment(BANK B)
	{
		B.acceptNo();
		B.acceptCvv();
		System.out.println(B+" Payment Done!!!");
	}

}

class USER
{
	public static void main(String args[])
	{
		AMEZON mobile = new AMEZON();
		mobile.payment(new HDFC());
	}
	
}