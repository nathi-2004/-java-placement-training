class 2TCS1
{
public static void main(String args[])
{
String s="###***";
int sc=0;
int hc=0;
for(int i=0;i<s.length();i++)

{
 char c=s.charAt(i);
if(c=='*')
{
sc++;
}
else if(c=='#')
{
hc++;
}
}
System.out.println(sc-hc);
}
}