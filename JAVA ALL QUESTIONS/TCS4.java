import java.util.*;
class TCS4{
 public static void main(String args[])
{
  Scanner in=new Scanner(System.in);
   int n=in.nextInt();
int temp=n;
int sum=0;
while(temp>0)
{
int d=temp%10;
sum=sum+d;
temp=temp/10;
}
if(n%sum==0)
{
 System.out.println(" good number");
}
else
{
 System.out.println("not goood number");
}
}
}


