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
		System.out.println("Enter the no of Columns:-");
		c = sc.nextInt();
		a = new int[r][c]; 		//definatin of 2d array
		
		System.out.println("Enter the Elements:-");
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Array Elements are:-");
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}