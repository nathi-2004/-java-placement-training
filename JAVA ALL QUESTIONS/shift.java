class shift{
public static void main(String args[])
{
int n=7;
if(((n>>1)<<1)==n)
{
System.out.println("even");
}
else if(((n>>1)<<1)!=n)
{
System.out.println("odd");
}
}
}