import java.util.*;
class Main {
	public static void main (String[] args) {
		{
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int sum=0;
			while(n>0)//123456
			{
				int digit=n%10;
				n=n/10;//12345
				if(digit%2==1)
				{
				sum+=digit;
					System.out.println(digit);

				}
				

			}
			System.out.println(sum);
		}
	}
}







