import java.util.Scanner;
class abund {
public static void main(String[] args) 
	{
Scanner in=new Scanner(System.in);
		 for(int a=1;a<=1000;a++){
		int sum=0;
		for(int i=1;i<a;i++) 
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum>a)
		{
			System.out.println(a+"It is Abundant");
			
		}
}
		

	}

}
