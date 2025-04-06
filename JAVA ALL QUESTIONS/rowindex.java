import java.util.*;
class rowindex
{
public static void main(String args[])
{   
   Scanner in=new Scanner(System.in);
System.out.println("m");
      int m=in.nextInt();
System.out.println("n");
      int n=in.nextInt();
   int matrix[][]=new int[m][n];
   for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
{
 matrix[i][j]=in.nextInt();
}
}
for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
{
 System.out.print(matrix[i][j]);
}
 System.out.println();
}
int large=0;
int ind=-1;
for(int i=0;i<m;i++)
{int cou=0;
for(int j=0;j<n;j++)
{
if(matrix[i][j]==1)
{ cou++;
}
}
if(cou>large)
{
 large=cou;
ind=i;
}
}
System.out.println(ind);
}
}


  