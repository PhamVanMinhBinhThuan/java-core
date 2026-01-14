package chapter7_Inheritance.Video67;

public class Car extends Vehicle {
	String type;

	public Car(String type, String brand, int year) {
		super(brand, year);
		this.type = type;
		System.out.println("Constructor from Car");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("Type: " + this.type);
	}
}
