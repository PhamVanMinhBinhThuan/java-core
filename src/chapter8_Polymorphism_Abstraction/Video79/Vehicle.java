package chapter8_Polymorphism_Abstraction.Video79;

public class Vehicle {
	private String brand;

	public Vehicle(String brand) {
		this.brand = brand;
	}

	public void start() {
		System.out.println("Vehicle is starting...");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
