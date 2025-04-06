class octal
public static void main(String args[])
{
int n=12;
int bin=0;
int place=1;
while(n>0)
{
int d=n%8;
bin=bin+d*place;
place=place*10;
n=n/8;
}

System.out.println(bin);
}
}