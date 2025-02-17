class c12345{

	public static void main(String args[]) {
		int arr[] = {1, 1, 0, 1, 1, 0, 1, 1, 0, 1};
		int i = 0;
		int j = arr.length - 1;
    while (i < j)
    {

			while (i < j && arr[i] == 1)
			{
				i++;
			}
	while (i < j && arr[j] == 0)
	{
				j--;
			}
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		for (int k = 0; k < arr.length; k++)
		{
			System.out.print(arr[k]);
		}
	}
}
