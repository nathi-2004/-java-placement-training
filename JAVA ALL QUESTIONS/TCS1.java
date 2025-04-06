import java.util.*;
class TCS1
{
 public static void main(String args[])
{
 Scanner in=new Scanner(System.in);
   int n=in.nextInt();
 int f=1;
for(int i=2;i<=n;i++)
{
 int sum=0;
 for(int j=0;j<i;j++)
{
 sum=sum+f;
}
f=sum;}
System.out.println(f);
}
}