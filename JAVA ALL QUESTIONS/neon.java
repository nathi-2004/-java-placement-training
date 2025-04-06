class neon{
public static void main(String args[])
{
int n=45;
int t=n;
int s=n*n;
int sum=0,a=0;
while(t>0){
int d=t%10;
sum=sum+d;
t=t/10;
}
while(s>0){
int d=s%10;
a=a+d;
s=s/10;
}
if(sum==a)
{
System.out.println("neon number");
}
else{
System.out.println(" not nn");
}
}
}