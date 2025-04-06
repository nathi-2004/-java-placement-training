
import java.util.*;
class TCS24
{
public static void main(String args[])
{
 Scanner in=new Scanner(System.in);
System.out.println("enter s");
  int s=in.nextInt();

int e[]=new int[s];
int l[]=new int[s];
System.out.println("enter e");

for(int i=0;i<s;i++)
{
e[i]=in.nextInt();
}
System.out.println("enter l");
for(int i=0;i<s;i++)
{
l[i]=in.nextInt();
}
int maxgues=0;
int curgues=0;
for(int i=0;i<s;i++)
{
  curgues=curgues+e[i];
curgues=curgues-l[i];
if(curgues>maxgues)
{
maxgues=curgues;
}
}System.out.println(maxgues);
}}

