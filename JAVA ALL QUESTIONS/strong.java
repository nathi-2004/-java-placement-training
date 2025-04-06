class strong{
public static void main(String args[]){
int n=145;
int sum=0;

int temp=n;
while(temp>0){
int d=temp%10;
int fact=1;
for(int i=1;i<=d;i++)
{
fact=fact*i;
}
sum+=fact;
temp=temp/10;
}
if(n==sum){
System.out.println(" it is a strong number");
}
else
{
System.out.println("it not strong number");

}
}
}