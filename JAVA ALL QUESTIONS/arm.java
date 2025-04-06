class arm {
public static void main(String args[])
{
int n=153;
int temp=n;
int res=0;
while(temp>0){
int d=temp%10;
res=res+(d*d*d);
temp=temp/10;
}
if(n==res)
{
System.out.println("it is armstrong");
}
else{
System.out.println(" it is non armstrong");
}
}
}
