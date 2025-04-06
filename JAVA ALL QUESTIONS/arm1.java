class arm1{
public static void main(String args[]){
   int n=153;
   int temp=n;
  int sum=0;
   int c=0;
while(temp>0){
   temp=temp/10;
    c++;
}
temp =n;
while(temp>0){
  int d=temp%10;
 sum+=Math.pow(d,c);
  temp=temp/10;
}

if(n==sum){
System.out.println(" it is armstrong");
}
else{
System.out.println(" it is non armstrong");
}
}
}

