class Counter {
	static int count = 0;
	Counter() {
		count++;
	}
	void display() {
		System.out.println("object created!current count=" + count);
	}
}
class Main {

	public static void main(String[] args) {

		Counter obj1 = new Counter();
		obj1.display();

		Counter obj2 = new Counter();
		obj2.display();

		Counter obj3 = new Counter();
		obj3.display();
	}
}
