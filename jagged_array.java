import java.util.Scanner;

class Demo
{
	public static void main(String args[])
	{
		int a[][];				//declaration of 2d array
		int r,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of Rows:-");
		r = sc.nextInt();
		a = new int[r][]; 		//definatin of 2d jagged array
		
		for(int i = 0; i < r; i++)
		{
			System.out.println("Enter the no of Elements in "+(i+1)+" row");
			c = sc.nextInt();
			System.out.println("Enter the Elements:-");
			a[i] = new int[c];
			for(int j = 0; j < c; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Array Elements are:-");
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < a[i].length ; j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}