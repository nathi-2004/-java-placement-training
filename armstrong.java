class armstrong{
	public static void main(String args[]) {
	    int a=153;
	    int x,y,z;
	    int temp=a;
	    x=temp%10;
	    temp=temp/10;
	     y=temp%10;
	    temp=temp/10;
		
		 z=temp%10;
		 int result=(z*z*z)+(y*y*y)+(x*x*x);
		 if(a==result)
		 {
		     System.out.println("armstrong");
		 }
		 else{
		      System.out.println("not armstrong");
		 }
	}
}
	  
	  
		