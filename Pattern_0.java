import java.util.*;
class Pattern*0{


	public static void main (String[] args) {
		{
			int n=3;
			for(int i=1; i<=n; i++)
			{
				for (int j = 1; j <= n - i; j++)
				{
					System.out.print(" ");
				}
                   	System.out.print("*");

				for (int j = 1; j <= (2 * i - 3); j++)
				{
					System.out.print("0");
				}
          	if (i > 1) 
          	       {
					System.out.print("*");
				}

                  	System.out.println();
			}
           	for (int i = 1; i <= (2 * n - 1); i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


}