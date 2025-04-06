class lcm{
public static void main(String args[]){
int a=36;int b=60;
int pro=a*b;
while(b>0){
int temp=b;
b=a%b;
a=temp;
}

int lcm=pro/a;
System.out.println(lcm);
}
}