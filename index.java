class index {
	public static void main(String args[])
	{
		int a[]= {2,7,5,7};
		int n=9;
		boolean found = false;
		for(int i=0; i<a.length; i++)
		{
			for (int j = i + 1; j <a.length; j++)
			{

				if(a[i]+a[j]==n)
				{
					System.out.println(i + "," + j);
					found = true;
				}
			}
		}
		if (!found) {
			System.out.println(0);
		}
	}
}