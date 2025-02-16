class reveve
{
	public static void main(String args[])
	{
		int n=123456;
		int sum=0;
		int digit;

		while(n>0)
		{
			digit=n%10;
			n=n/10;

			if(digit%2==0)
			{
				System.out.print(digit);
			
			}
		}
	
	}
}