class hex45{
 public static void main(String args[])
{String r="";
int n=254;
 char h[]="0123456789ABCDEF".toCharArray();
while(n>0)
{
 r=h[n%16]+r;
n=n/16;
}
System.out.println(r);
}
}