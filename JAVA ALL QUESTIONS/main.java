
import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a no:");
		int a=in.nextInt();
		int b=a;
		int sum=0;
		while(a>0)
		{
			int temp=a%10;
			sum=sum+temp;
			a=a/10;
		}
		if(b%sum==0)
		{
			System.out.println("It is a Harshad no.");
		}
		else
		{
			System.out.println("It is not a Harshad no.");
		}


	}

}
