class palindrome{
public static void main(String args[]){
int n=121;
int tem=n;
int r=0;
while(tem>0){
int d=tem%10;
r=r*10+d;
tem=tem/10;
}

if(n==r)
{
System.out.println("it is palindrome");
}
else{
System.out.println("it is not palindrome");

}
}
}

