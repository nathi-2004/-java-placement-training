class Ipyramid{
public static void main(String args[]){
 int n=5;
for(int i=0;i<n;i++,System.out.print("\n"))
{
for(int j=0;j<i+1;j++)
{
System.out.print(" ");
}
for(int j=0;j<n-i;j++)
{
System.out.print("*");
}

for(int j=1;j<n-i;j++)
{
System.out.print("*");
}



}
}
}