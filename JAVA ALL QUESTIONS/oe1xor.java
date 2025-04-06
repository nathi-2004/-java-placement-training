class oe1xor{
public static void main(String args[])
{
int n=7;
if((n|1)==n--)
{
System.out.println("odd");
}
if((n|1)==n++)
{
System.out.println("even");
}
}
}