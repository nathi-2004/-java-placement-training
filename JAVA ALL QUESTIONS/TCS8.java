import java.util.*;
class TCS8{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter n");
 int n=in.nextInt();
int arr[]=new int[n];
System.out.println("enter array elements");
for(int i=0;i<n;i++)
{
 arr[i]=in.nextInt();
}
for(int i=0;i<n;i++)
{
System.out.println(arr[i]+" ");
}
System.out.println("enter d");
 int d=in.nextInt();
 n=arr.length;
for(int i=0;i<d;i++)
{
int temp=arr[0];
{
for(int j=0;j<n-1;j++)
{
arr[j]=arr[j+1];
}
arr[n-1]=temp;
}
}
for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}
}
}



