class largestdigit{
public static void main(String args[]){
int n=75698;
int a=0;
while(n>0){
int d=n%10;
if(d>a)
{
a=d;
}
n=n/10;
}
System.out.println(a);
}
}