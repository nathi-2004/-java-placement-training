import java.util.*;
class Main {

	String name;
	int regno;

	void get(String n,int r)
	{
		name=n;
		regno=r;

	}
	void display()
	{
		System.out.println(name);
		System.out.println(regno);

	}
	public static void main(String args[]) {
		Main m=new Main();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your name");
		String b=in.nextLine();
			System.out.println("Enter your number");
		int a=in.nextInt();
	
		m.get(b,a);
		m.display();
	}
}


