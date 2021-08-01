interface SIM
{
	void call_Rate();
	void sms_Rate();
}

class JIO implements SIM
{
	public void call_Rate()
	{
		System.out.println("Rs.599-Unlimited 84 days");
	}
	
	public void sms_Rate()
	{
		System.out.println("Rs.50-100 sms/day");
	}
}


class IDEA implements SIM
{
	public void call_Rate()
	{
		System.out.println("Rs.649-Unlimited 84 days");	
	}
	
	public void sms_Rate()
	{
		System.out.println("Rs.60-100 sms/day");
	}

}


class AIRTEL implements SIM
{
	public void call_Rate()
	{
		System.out.println("Rs.699-Unlimited 84 days");
	}
	
	public void sms_Rate()
	{
		System.out.println("Rs.80-100 sms/day");
	}
}
class MOBILE
{
	void insert_Sim(SIM S)
	{
		S.call_Rate();
		S.sms_Rate();
		System.out.println(S+" Sim Inserted!!!");
	}
	
}

class MobileUser
{
	public static void main(String args[])
	{	
		MOBILE Apple = new MOBILE();
		Apple.insert_Sim(new JIO());
		
		System.out.println("\n\n");
		
		MOBILE MI = new MOBILE();
		MI.insert_Sim(new IDEA());
		
		System.out.println("\n\n");
		
		MOBILE Samsung = new MOBILE();
		Samsung.insert_Sim(new AIRTEL());
	}
}