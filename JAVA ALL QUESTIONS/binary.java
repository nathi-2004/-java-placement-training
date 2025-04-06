class binary{
public static void main(String args[])
{
int n=12;
int bin=0;
int place=1;
while(n>0)
{
int d=n%2;
bin=bin+d*place;
place=place*10;
n=n/2;
}

System.out.println(bin);
}
}