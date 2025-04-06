import java.util.*;
class prime{
public static void main(String args[]){
 Scanner in=new Scanner(System.in);
System.out.println("ENTER UR NUMBER");

int f=0;
for(int j=1;j<=1000;j++){
for(int i=1;i<=j;i++){
if(j%i==0){
f++;
}
}
if(f==2){
System.out.println(j +"pn");
}
f=0;
}
}
}



