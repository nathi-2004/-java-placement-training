import java.util.*;
class C7{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the lower bound:");
        int lower = in.nextInt();
        System.out.println("Enter the upper bound:");
        int upper = in.nextInt();
        if (lower <= 0 || upper <= 0 || lower > upper) {
            System.out.println("Provide valid input");
        } else {
            System.out.println("Prime numbers between " + lower + " and " + upper + " are:");
            for(int j=lower;j<=upper;j++){
                int f=0;
                for(int i=1;i<=j;i++){
                    if(j%i==0){
                        f++;
                    }
                }
                if(f==2){
                    System.out.print(j +" ");
                }
            }
        }
    }
}


