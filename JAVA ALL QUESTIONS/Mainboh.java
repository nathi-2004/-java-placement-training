class Mainboh{
 void binary(){
 int a=12;
String b="";
while(a>0)
{
  int d=a%10;
b=d+b;
a=a/10;
}
System.out.println(b);
}
void octal(){
 int a=12;
String b="";
while(a>0)
{
  int d=a%8;
b=d+b;
a=a/8;
}
System.out.println(b);
}
void hex(){
 int a=1256;
String b="";
char []hd={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
while(a>0)
{
  int d=a%16;
b=hd[d]+b;
a=a/16;
}
System.out.println(b);
}
public static void main(String args[])
{
Mainboh  onj=new Mainboh();
onj.binary();
onj.octal();
onj.hex();

}
}
