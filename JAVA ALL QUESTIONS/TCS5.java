class TCS5{
 public static void main(String args[])
{
int v=12;
int w=34;
int fw,tw;
if(w%2!=0||w>4*v||w<2*v)
{
 System.out.println("-1");
}
 else
{
  fw=(w-2*v)/2;
 tw=v-fw;
System.out.println(fw);
System.out.println(tw);
}
}
}
