import java.util.*;
class EVEN{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
if(n%2==0){
System.out.println(n + " is a even number");}
else if(n%2!=0){
System.out.println(n +" is a odd number");
}
else{
System.out.println("invalid input");}
}
}