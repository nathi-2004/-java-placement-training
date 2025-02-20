class Car {
	String brand;

	Car() {
		brand = "unknown";
	}

	void setBrand(String newBrand) {
		brand = newBrand;
	}

	void display() {
		System.out.println("Car Brand: " + brand);
	}
}
class Main {

	public static void main(String[] args) {
		Car a = new Car();
		a.display();
		a.setBrand("Toyota");
		a.display();
	}
}
