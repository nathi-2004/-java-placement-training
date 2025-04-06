import java.util.*;
class TCS11{
 public static void main(String args[])
{
 int arr1[]={10,5,2,23,19};
int arr2[]={19,5,3};
int c=0;
for(int i=0;i<arr1.length;i++)
{
for(int j=0;j<arr2.length;j++)
{ 
   if (arr1[i] == arr2[j]) {
                    c++; 
                }
            } 
}
 if(c == arr2.length) {
             
  System.out.println("true");
                
            }
else
        {
        System.out.println("false");
    }

}
}





    
             
