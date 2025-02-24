class printcombination{


	public static void main(String args[])
	{
		int a[]= {2,7,5,7};
		int n=9;
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			for (int j = i + 1; j <a.length; j++)
			{

				if(a[i]+a[j]==n)
				{
					System.out.println(i + "," + j);
			            count++;
				}
			
			}
		}
		System.out.println(count);
	}
}