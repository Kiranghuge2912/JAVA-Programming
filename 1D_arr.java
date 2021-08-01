import java.util.Scanner;

class Demo
{
	public static void main(String args[])
	{
		int n,i;
		System.out.println("No of Elements In Array");
		Scanner S = new Scanner(System.in);
		n = S.nextInt();
		int a[] = new int[n];
		
		for(i = 0; i < n; i++)
		{
			a[i] = S.nextInt();
		}
		
		System.out.println("Array Elements Are");
		for(i = 0; i < n; i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}