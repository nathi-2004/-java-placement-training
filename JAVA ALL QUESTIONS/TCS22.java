import java.util.*;
class TCS22{
 public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
 a[i]=in.nextInt();
}
int c=1;
int max=a[0];
for(int i=1;i<n;i++)
{
if(a[i]>max)
{
c++;
max=a[i];
}

}
System.out.println(c);

}
}
