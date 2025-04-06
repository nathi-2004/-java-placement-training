import java.util.*;
class per
{
public static void main(String args[])
{ int sum=0;
 Scanner in=new Scanner(System.in);
 int n=in.nextInt();
for(int i=1;i<=n;i++)
{
 if(n%i==0)
{
sum=sum+i;
}
}if(sum==n){

System.out.println("pn");
}
else{
System.out.println("not pn");
}
}
}

