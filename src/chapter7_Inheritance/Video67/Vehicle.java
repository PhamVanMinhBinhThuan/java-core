package chapter7_Inheritance.Video67;

public class Vehicle {
	String brand;
	int year;

	public Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;
		System.out.println("Constructor from Vehicle");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void printInfo() {
		System.out.println("Vehicle: " + this.brand + ", " + this.year);
	}

}
