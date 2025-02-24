	import java.util.*;
	class oddpattern{




	public static void main (String[] args) {
		{
			int n=4;
			int number=1;

			for(int i=1; i<=n; i++)
			{
				for(int j=n-1; i<=j; j--)
				{
					System.out.print(" ");

				}
				for(int k=1; k<=i; k++)
				{
					System.out.print("1");

				}
				for(int a=1; a<i; a++)
				{
					System.out.print("1");
				}
				System.out.println();


			}
		}
	}
}