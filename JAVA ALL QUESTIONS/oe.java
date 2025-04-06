import java.util.Scanner;
class oe{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
  int a=in.nextInt();
if((a&1)==1)
{
System.out.println(" odd number");
}
else if((a&1)==0)
{
System.out.println("even number");
}
else{
System.out.println("invalid input");
}
}
}