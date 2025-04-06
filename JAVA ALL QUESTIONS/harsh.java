class harsh{
public static void main(String args[])
{
int n=156;
int sum=0;
while(n>0){
int d=n%10;
sum=sum+d;
n=n/10;
}if(n%sum==0)
{
System.out.println("hn");
}
else
{
Sytsem.out.println("not hn");
}
}
}