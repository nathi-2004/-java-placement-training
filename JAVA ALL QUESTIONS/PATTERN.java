class PATTERN12{
static void pattern1(int n){
for(int i=0;i<n;i++,System.out.print("\n")){
for(int j=0;j<n;j++,System.out.print(" "))
{
System.out.print("#");

}
}}
static void pattern2(int n){
for(int i=0;i<n;i++,System.out.print("\n")){
for(int j=0;j<n;j++,System.out.print(" ")){
if(i==0||j==0||i==n-1||j==n-1||i==2&&j==2){
System.out.print("*");}
else{
System.out.print(" ");
}
}
}
}
static void pattern3(int n){
for(int i=0;i<n;i++,System.out.print("\n")){
for(int j=0;j<n;j++,System.out.print(" ")){
if(i==0||j==0||i==n-1||i==j||i+j==4){
System.out.print("*");}
else{
System.out.print(" ");
}
}
}
}
static void pattern4(int n){
int mid=n/2;
for(int i=0;i<n;i++,System.out.print("\n")){
for(int j=0;j<n;j++,System.out.print(" ")){
if((i==j||i+j==4||i==4&&j==2)&&i>=mid){
System.out.print("*");}
else{
System.out.print(" ");
}
}
}
}
static void pattern5(int n){
int mid=n/2;
for(int i=0;i<n;i++,System.out.print("\n")){
for(int j=0;j<n;j++,System.out.print(" ")){
if((i==j&&i>=mid||i+j==4&&i<=mid)||i==2&&j==4){
System.out.print("*");}
else{
System.out.print(" ");
}
}
}
}
static void pattern6(int n){
for(int i=0;i<n;i++,System.out.print("\n")){
for(int j=0;j<i+1;j++,System.out.print(" ")){

System.out.print("*");

}
}
}
static void pattern7(int n){
for(int i=0;i<n;i++,System.out.print("\n")){
for(int j=0;j<n-i;j++,System.out.print(" ")){

System.out.print("*");

}
}
}
static void pattern8(int n){
for(int i=0;i<n;i++,System.out.print("\n")){
for(int j=0;j<n-i;j++,System.out.print(" ")){

System.out.print(" ");

}
for(int j=0;j<i+1;j++,System.out.print(" ")){

System.out.print("*");

}
}
}
static void pattern9(int n){
for(int i=0;i<n;i++,System.out.print("\n")){
for(int j=0;j<i+1;j++,System.out.print(" ")){

System.out.print(" ");

}
for(int j=0;j<n-i;j++,System.out.print(" ")){

System.out.print("*");

}
for(int j=1;j<n-i;j++,System.out.print(" ")){

System.out.print("*");

}
}
}
static void pattern10(int n){
for(int i=0;i<n;i++,System.out.print("\n")){
for(int j=0;j<i+1;j++,System.out.print(" ")){

System.out.print(" ");

}
for(int j=0;j<n-i;j++,System.out.print(" ")){

System.out.print("*");

}
for(int j=1;j<n-i;j++,System.out.print(" ")){

System.out.print("*");

}

}
for(int i=0;i<n;i++,System.out.print("\n")){
for(int j=0;j<n-i;j++,System.out.print(" ")){

System.out.print(" ");

}
for(int j=0;j<i+1;j++,System.out.print(" ")){

System.out.print("*");

}
for(int j=1;j<i+1;j++,System.out.print(" ")){

System.out.print("*");

}
}
}
static void pattern12(int n){
int a=0;
for(int i=0;i<n;i++,System.out.print("\n")){
for(int j=0;j<i+1;j++,System.out.print(" ")){
a++;
System.out.print(a);

}
}
}
static void pattern13(int n){
char ch='A','E';
for(int i=0;i<n;i++,System.out.print("\n")){
for(int j=0;j<i+1;j++,System.out.print(" ")){
System.out.print(ch);
ch++;

}
}
}

}

class PATTERN{
public static void main(String args[]){
PATTERN12 IN=new PATTERN12();
int n=5;
IN.pattern13(n);
  
}
}
