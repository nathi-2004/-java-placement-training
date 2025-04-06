class hex{
public static void main(String args[])
{
int n=254;
String hex="";
char hexchars[]="0123456789ABCDEF".toCharArray();
while(n>0)
{
hex=hexchars[n%16]+hex;
n=n/16;
}
System.out.println(hex);
}
}